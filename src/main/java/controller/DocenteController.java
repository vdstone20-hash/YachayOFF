package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DocenteController {

    @GetMapping("/teacher/dashboard")
    public String dashboardDocente() {
        return "teacher/dashboard";
    }
}