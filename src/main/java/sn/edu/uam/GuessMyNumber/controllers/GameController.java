package sn.edu.uam.GuessMyNumber.controllers;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GameController {

    // Page d'accueil
    @GetMapping("/")
    public String accueil() {
        return "accueil";
    }

    // Démarrer le jeu
    @PostMapping("/start")
    public String startGame(HttpSession session) {
        int randomNumber = (int) (Math.random() * 100) + 1; // nombre aléatoire [1-100]
        session.setAttribute("nombreSecret", randomNumber);
        session.setAttribute("tentatives", 0);
        return "redirect:/jeu";
    }

    // Afficher la page de jeu
    @GetMapping("/jeu")
    public String jeu() {
        return "jeu";
    }

    // Traiter la proposition
    @PostMapping("/jeu")
    public String jouer(@RequestParam int proposition, HttpSession session, Model model) {
        int nombreSecret = (int) session.getAttribute("nombreSecret");
        int tentatives = (int) session.getAttribute("tentatives") + 1;
        session.setAttribute("tentatives", tentatives);

        if (proposition == nombreSecret) {
            model.addAttribute("tentatives", tentatives);
            return "fin"; // victoire
        } else {
            model.addAttribute("message", proposition < nombreSecret ? "Plus grand !" : "Plus petit !");
            model.addAttribute("tentatives", tentatives);
            return "jeu";
        }
    }
}
