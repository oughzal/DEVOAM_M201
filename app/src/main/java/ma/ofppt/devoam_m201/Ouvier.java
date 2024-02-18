package ma.ofppt.devoam_m201;

import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

public class Ouvier extends Employe{
   private LocalDate DateEntree;
   private static  final double SMIG = 25000;

    public Ouvier(int matricule, String nom, String prenom, Date dateNaissance,LocalDate dateEntree) {
        super(matricule, nom, prenom, dateNaissance);
        this.DateEntree = dateEntree;
    }


    @Override
    public double getSalaire() {
            int ancient = 0;
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
            ancient =Period.between(LocalDate.now(),this.DateEntree).getYears();
        }
        double salaire = SMIG*ancient*100;
        if(salaire > 2*SMIG){salaire = SMIG*2;}
        return salaire;
    }

    public LocalDate getDateEntree() {
        return DateEntree;
    }

    public void setDateEntree(LocalDate dateEntree) {
        DateEntree = dateEntree;
    }
}
