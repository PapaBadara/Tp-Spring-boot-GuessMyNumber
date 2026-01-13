package sn.edu.uam.GuessMyNumber.services;


import org.springframework.stereotype.Service;
import sn.edu.uam.GuessMyNumber.entities.Partie;
import sn.edu.uam.GuessMyNumber.repositories.PartieRepository;

@Service
public class PartieService {

    private final PartieRepository partieRepository;

    public PartieService(PartieRepository partieRepository) {
        this.partieRepository = partieRepository;
    }

    public void enregistrerPartie(Partie partie) {
        partieRepository.save(partie);
    }
}