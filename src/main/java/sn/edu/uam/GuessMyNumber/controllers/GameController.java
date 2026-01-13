package sn.edu.uam.GuessMyNumber.controllers;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import sn.edu.uam.GuessMyNumber.entities.Partie;
import sn.edu.uam.GuessMyNumber.services.PartieService;

import java.time.LocalDateTime;

@Controller
public class GameController {

    private final PartieService partieService;

    // Injection du service
    public GameController(PartieService partieService) {
        this.partieService = partieService;
    }

    // ===============================
    // Page d'accueil
    // ===============================
    @GetMapping("/")
    public String accueil() {
        return "accueil";
    }

    // ===============================
    // Démarrer le jeu
    // ===============================
    @PostMapping("/start")
    public String startGame(HttpSession session) {
        int randomNumber = (int) (Math.random() * 100) + 1; // nombre aléatoire [1-100]
        session.setAttribute("nombreSecret", randomNumber);
        session.setAttribute("tentatives", 0); // initialise les tentatives à 0
        return "redirect:/jeu";
    }

    // ===============================
    // Afficher la page de jeu
    // ===============================
    @GetMapping("/jeu")
    public String jeu() {
        return "jeu";
    }

    // ===============================
    // Traiter la proposition
    // ===============================
    @PostMapping("/jeu")
    public String jouer(
            @RequestParam int proposition,
            HttpSession session,
            Model model
    ) {

        // Récupération des valeurs depuis la session
        int nombreSecret = (int) session.getAttribute("nombreSecret");
        int tentatives = (int) session.getAttribute("tentatives") + 1;
        session.setAttribute("tentatives", tentatives);

        // Cas victoire
        if (proposition == nombreSecret) {

            // Création de la partie
            Partie partie = new Partie();
            partie.setJoueur("Joueur"); // tu peux remplacer par un formulaire plus tard
            partie.setDate(LocalDateTime.now());
            partie.setTentatives(tentatives); // <- juste l'int ici, pas de liste

            // Enregistrement en base
            partieService.enregistrerPartie(partie);

            model.addAttribute("tentatives", tentatives);
            return "fin"; // page de victoire
        }

        // Cas échec
        model.addAttribute(
                "message",
                proposition < nombreSecret ? "Plus grand !" : "Plus petit !"
        );
        model.addAttribute("tentatives", tentatives);

        return "jeu"; // retourne à la page du jeu
    }
}
