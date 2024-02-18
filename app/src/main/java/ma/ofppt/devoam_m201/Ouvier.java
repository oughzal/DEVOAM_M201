package ma.ofppt.devoam_m201;

import android.annotation.SuppressLint;

import java.time.LocalDate;
import java.time.Period;

public class Ouvier extends Employe {
    private LocalDate DateEntree;
    private static final double SMIG = 2500;

    public Ouvier(int matricule, String nom, String prenom, LocalDate dateNaissance, LocalDate dateEntree) {
        super(matricule, nom, prenom, dateNaissance);
        this.DateEntree = dateEntree;
    }


    @SuppressLint("NewApi")
    @Override
    public double getSalaire() {
        int ancient = 0;
        ancient = Period.between(this.DateEntree,LocalDate.now()).getYears();
        double salaire = SMIG + ancient * 100;
        if (salaire > 2 * SMIG) {
            salaire = SMIG * 2;
        }
        return salaire;
    }

    public LocalDate getDateEntree() {
        return DateEntree;
    }

    public void setDateEntree(LocalDate dateEntree) {
        DateEntree = dateEntree;
    }
}
