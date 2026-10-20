
package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public UserDetailsService userDetailsService(
            PasswordEncoder passwordEncoder) {

        UserDetails estudiante = User.withUsername("estudiante")
                .password(passwordEncoder.encode("123456"))
                .roles("STUDENT")
                .build();

        UserDetails docente = User.withUsername("docente")
                .password(passwordEncoder.encode("123456"))
                .roles("TEACHER")
                .build();

        UserDetails administrador = User.withUsername("admin")
                .password(passwordEncoder.encode("123456"))
                .roles("ADMIN")
                .build();

        return new InMemoryUserDetailsManager(
                estudiante,
                docente,
                administrador
        );
    }

    @Bean
    public SecurityFilterChain filtroSeguridad(
            HttpSecurity http) throws Exception {

        http
            .authorizeHttpRequests(auth -> auth
                .requestMatchers(
                    "/login",
                    "/registro",
                    "/css/**",
                    "/js/**",
                    "/img/**",
                    "/audio/**"
                ).permitAll()

                .requestMatchers("/admin/**").hasRole("ADMIN")
                .requestMatchers("/teacher/**").hasRole("TEACHER")
                .requestMatchers("/student/**").hasRole("STUDENT")

                .anyRequest().authenticated()
            )

            .formLogin(form -> form
                .loginPage("/login")
                .successHandler((request, response, authentication) -> {

                    var roles = authentication.getAuthorities();

                    boolean esAdmin = roles.stream()
                        .anyMatch(a -> a.getAuthority()
                            .equals("ROLE_ADMIN"));

                    boolean esDocente = roles.stream()
                        .anyMatch(a -> a.getAuthority()
                            .equals("ROLE_TEACHER"));

                    if (esAdmin) {
                        response.sendRedirect("/admin/dashboard");
                    } else if (esDocente) {
                        response.sendRedirect("/teacher/dashboard");
                    } else {
                        response.sendRedirect("/student/dashboard");
                    }
                })
                .failureUrl("/login?error=true")
                .permitAll()
            )

            .logout(logout -> logout
                .logoutSuccessUrl("/login?salir")
                .invalidateHttpSession(true)
                .clearAuthentication(true)
                .permitAll()
            );

        return http.build();
    }
}
