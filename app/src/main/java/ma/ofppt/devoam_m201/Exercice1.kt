package ma.ofppt.devoam_m201

/**
 * DR : BMKH (2024)
 * EFM :M202 Programmation en Kotlin
 */

/**
 * Exercice 1 :
 * 1) Créer la fonction d'extension [trierEtSupprimerDoublant] de la classe [ArrayList]<[Int]> qui permet à la fois de tier et supprimer les doublons dans une liste d'entiers.
 */
fun ArrayList<Int>.trierEtSupprimerDoublant() {
    // TODO : créer une Set à partir de la liste
    val set = this.toSet()
    // TODO : Supprimer tous les éléments de la liste
    this.clear()
    //TODO : Ajouter les éléments de set à la liste
    this.addAll(set.toList())
    // TODO : trier la liste
    this.sort()
}

/**
 * 2) Dans la fonction main :
 * - Créer une liste [L] de 6 entiers de type [ArrayList]<[Int]>
 * - Appliquer la fonction [trierEtSupprimerDoublant] sur [L]
 * - Afficher la liste résultante
 */
fun main() {
    val L = ArrayList<Int>()
    L.addAll(listOf(2, 7, 3, 2, 9, 1, 7, 4, 11, 9, 20, 3, 4))
    L.trierEtSupprimerDoublant()
    println(L)
}