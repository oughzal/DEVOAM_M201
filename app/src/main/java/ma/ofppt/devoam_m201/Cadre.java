package ma.ofppt.devoam_m201;

import java.util.Date;

public class Cadre extends Employe{
    private int indice;

    public Cadre(int matricule, String nom, String prenom, Date dateNaissance, int indice) {
        super(matricule, nom, prenom, dateNaissance);
        this.indice = indice;
    }

    public Cadre() {

    }

    public int getIndice() {
        return indice;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }

    @Override
    public double getSalaire() {
        switch (this.indice){
            case 1 : return 13000;
            case 2 : return 15000;
            case 3 : return 17000;
            case 4 : return 20000;
        }
        return 0;
    }
}
