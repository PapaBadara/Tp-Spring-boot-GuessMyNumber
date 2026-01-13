package sn.edu.uam.GuessMyNumber.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import jakarta.servlet.http.HttpSession;

@Controller
public class GameController {

    @GetMapping("/")
    public String accueil() {
        return "accueil";
    }

    @PostMapping("/start")
    public String startGame(HttpSession session) {
        int secret = (int) (Math.random() * 100) + 1;
        session.setAttribute("nombreSecret", secret);
        session.setAttribute("tentatives", 0);
        return "jeu";
    }

    @PostMapping("/jeu")
    public String jouer(@RequestParam int proposition, HttpSession session, Model model) {
        int secret = (int) session.getAttribute("nombreSecret");
        int tentatives = (int) session.getAttribute("tentatives") + 1;
        session.setAttribute("tentatives", tentatives);

        if (proposition == secret) {
            model.addAttribute("tentatives", tentatives);
            return "fin";
        }

        model.addAttribute("message", proposition < secret ? "Plus grand !" : "Plus petit !");
        model.addAttribute("tentatives", tentatives);
        return "jeu";
    }
}