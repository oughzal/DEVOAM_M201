package ma.ofppt.devoam_m201;

import android.annotation.SuppressLint;
import android.os.Build;

import androidx.annotation.RequiresApi;

import java.time.LocalDate;
import java.util.Date;


public class Main {
    // Programme Teste
    @RequiresApi(api = Build.VERSION_CODES.O)
    public static void main(String[] args) {
        Cadre cadre = new Cadre(123,"nom","prenom",LocalDate.of(2000,1,1),3);
        System.out.println("Salaire cadre : " +cadre.getSalaire());
        Ouvier ouvier = new Ouvier(123,"nom","prenom",LocalDate.of(2022, 1, 1),LocalDate.of(1970, 1, 1));
        System.out.println("Salaire ouvier : " + ouvier.getSalaire());
        Patron patron= new Patron(123,"nom","prenom",LocalDate.of(2022, 1, 1),300000.0,10.0);
        System.out.println("Salaire patron : " + patron.getSalaire());
    }

}
