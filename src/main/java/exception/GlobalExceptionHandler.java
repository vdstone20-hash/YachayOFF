package exception;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(Exception.class)
    public String manejarError(Exception ex, Model model) {
        model.addAttribute("mensaje", ex.getMessage() == null ? "Ocurrió un error." : ex.getMessage());
        return "error/404";
    }
}