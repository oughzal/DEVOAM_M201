package ma.ofppt.devoam_m201;

import java.util.Date;

public class Patron extends Employe{
    private static double chiffreAffaire;
    private double pourcentage;
    public Patron(int matricule, String nom, String prenom, Date dateNaissance,double chiffreAffaire) {
        super(matricule, nom, prenom, dateNaissance);
        chiffreAffaire = chiffreAffaire;
    }

    public double getPourcentage() {
        return pourcentage;
    }

    public void setPourcentage(double pourcentage) {
        this.pourcentage = pourcentage;
    }

    public static double getChiffreAffaire() {
        return chiffreAffaire;
    }

    public static void setChiffreAffaire(double chiffreAffaire) {
        Patron.chiffreAffaire = chiffreAffaire;
    }

    @Override
    public double getSalaire() {
        return chiffreAffaire*pourcentage/100;
    }
}
