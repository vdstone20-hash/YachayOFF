package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/biblioteca")
public class BibliotecaController {
    @GetMapping
    public String index() { return "library/index"; }

    @GetMapping("/detalle")
    public String detalle() { return "library/detalle"; }
}
