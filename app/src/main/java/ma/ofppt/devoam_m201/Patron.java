package ma.ofppt.devoam_m201;

import java.time.LocalDate;
import java.util.Date;

public class Patron extends Employe{
    private static double chiffreAffaire;
    private double pourcentage;
    public Patron(int matricule, String nom, String prenom, LocalDate dateNaissance, double chiffreAffaire,double pourcentage) {
        super(matricule, nom, prenom, dateNaissance);
        Patron.chiffreAffaire = chiffreAffaire;
        this.pourcentage = pourcentage;
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
