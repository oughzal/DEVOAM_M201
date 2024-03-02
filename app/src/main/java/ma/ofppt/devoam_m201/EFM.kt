package ma.ofppt.devoam_m201

import android.annotation.SuppressLint
import java.time.LocalDate
import java.util.Date

open abstract class Empolye(var matricule:Int , var nom:String , var prenom:String,var dateNaissance:Date){
    open override fun toString():String{
        return "matricule $matricule \n le nom : $nom \n le prenom $prenom \n date de naissance : $dateNaissance"
    }
    abstract fun getSalaire():Double

}

class Ouvrier( matricule:Int ,  nom:String ,  prenom:String, dateNaissance:Date,var dateEntre:Date) : Empolye( matricule,  nom ,  prenom,dateNaissance){

    companion object {
        const val SMIG : Double=2500.0
    }
    override fun toString():String{
        return super.toString()+"\ndateEntre:$dateEntre"
    }

    @SuppressLint("NewApi")
    override fun getSalaire():Double{
        val a = LocalDate.now().year-dateEntre.year
        val salaire=SMIG*a*100
        if (salaire<2*SMIG) return salaire
            else return 2*SMIG

    }
}
class Cadre( matricule:Int ,  nom:String ,  prenom:String, dateNaissance:Date,var indice:Int) : Empolye( matricule,  nom ,  prenom,dateNaissance){
    override fun toString():String{
        return super.toString()+"\nindice:$indice"
    }
    override fun getSalaire():Double{

        val salaire = when(indice){
            1 -> 13000.toDouble()
            2 -> 15000.toDouble()
            3 -> 17000.toDouble()
            4 ->  20000.toDouble()
            else -> 0.toDouble()
        }

        when(indice){
            1 -> return 13000.toDouble()
            2 -> return 15000.toDouble()
            3 -> return 17000.toDouble()
            4 -> return  20000.toDouble()
            else -> return 0.toDouble()
        }

    }
}
class Patron(matricule:Int ,  nom:String ,  prenom:String, dateNaissance:Date,var pourcentage:Double):Empolye(matricule,  nom , prenom,dateNaissance){
    override fun toString():String{
        return super.toString()+"\nPourcentage: $pourcentage\nChiffre d affaire:$chiffreAffaire"
    }
    companion object{
        final var chiffreAffaire=0
    }
    override fun getSalaire(): Double{
        return chiffreAffaire*pourcentage/100
    }
}

@SuppressLint("NewApi")
fun Empolye.calculerAge():Int{
    return LocalDate.now().year - this.dateNaissance.year
}

fun main(args: Array<String>) {
    val cadre = Cadre(1,"nom","prenom", Date(2000,1,1),1)
    print(cadre.calculerAge())
}