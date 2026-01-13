package sn.edu.uam.GuessMyNumber.entities;


public class Tentative {

    private int valeurProposee;
    private String resultat; // PLUS_GRAND, PLUS_PETIT, TROUVE

    public Tentative() {
    }

    public Tentative(int valeurProposee, String resultat) {
        this.valeurProposee = valeurProposee;
        this.resultat = resultat;
    }

    public int getValeurProposee() {
        return valeurProposee;
    }

    public void setValeurProposee(int valeurProposee) {
        this.valeurProposee = valeurProposee;
    }

    public String getResultat() {
        return resultat;
    }

    public void setResultat(String resultat) {
        this.resultat = resultat;
    }
}