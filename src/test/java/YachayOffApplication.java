


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.persistence.autoconfigure.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {
    "YachayOFF",
    "controller",
    "config",
    "service",
    "repository"
})
@EntityScan(basePackages = "entity")
@EnableJpaRepositories(basePackages = "repository")
public class YachayOffApplication {

    public static void main(String[] args) {
        SpringApplication.run(YachayOffApplication.class, args);
    }
}
