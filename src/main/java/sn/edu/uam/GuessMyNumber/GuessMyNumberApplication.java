package sn.edu.uam.GuessMyNumber;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GuessMyNumberApplication {

    public static void main(String[] args) {
        SpringApplication.run(GuessMyNumberApplication.class, args);

//        int randomNumber = (int)(Math.random() * 10) + 1;
//        System.out.println("Nombre généré au démarrage : " + randomNumber);
    }
}
