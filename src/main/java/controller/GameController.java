package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/juegos")
public class GameController {
    @GetMapping
    public String index() { return "games/index"; }
    @GetMapping("/globos")
    public String globos() { return "games/globos"; }
    @GetMapping("/fruta")
    public String fruta() { return "games/fruta"; }
    @GetMapping("/cesta")
    public String cesta() { return "games/cesta"; }
    @GetMapping("/letras")
    public String letras() { return "games/letras"; }
    @GetMapping("/laberinto")
    public String laberinto() { return "games/laberinto"; }
    @GetMapping("/secuencias")
    public String secuencias() { return "games/secuencias"; }
    @GetMapping("/pintar")
    public String pintar() { return "games/pintar"; }
}
