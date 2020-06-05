package fr.boucles;
/**
 * Exercice : Parcours d'un tableau entier
 * 
 * Déclarez un tableau d’entiers contenant tous les entiers de 1 à 10
 * Affichez le premier élément du tableau
 * Affichez la longueur du tableau en utilisant la propriété length
 * Affichez le dernier élément du tableau en utilisant la propriété length
 * Modifiez la valeur de l’élément d’index 4 et donnez lui la valeur 8
 * 
 * @author antoinelabeeuw
 *
 */
public class ExerciceTableauEntier {
/**
 * @param args : no args used
 */
	public static void main(String[] args) {
		//create a table containing all ints from 1 to 10
		int table10[] = {1,2,3,4,5,6,7,8,9,10};
		// print first element of table10:
		// in java, indexes starts at 0
		System.out.println("Affichez le premier élément du tableau");
		System.out.println("Premier élément du tableau : " + table10[0]);
		
		// print the length of the table with the use of the "length" propriety
		// since it is a propriety, we can access it with var.propriety
		System.out.println();
		System.out.println("Affichez la longueur du tableau en utilisant la propriété length");
		System.out.println("La taille du tableau est de : " + table10.length);
		
		// print the last element with the use of length
		// Since a table starts at 0, we need to use length -1
		// 2 ways to do it, will be shown under
		System.out.println();
		System.out.println("Affichez le dernier élément du tableau en utilisant la propriété length");
		int last = table10.length -1;
		System.out.println("(1e version) Le dernier élément du tableau est : " + table10[table10.length-1]);
		System.out.println("(2e version) Le dernier élément du tableau est : " + table10[last]);
		
		//modify the 4th element and give it the value 10
		// 4th one = 3rd index since it starts at 0
		System.out.println();
		System.out.println("Modifiez la valeur de l’élément d’index 4 et donnez lui la valeur 8");
		System.out.println("4e valeur : " + table10[3]);
		table10[3] = 8;
		System.out.println("4e valeur modifiée : " + table10[3]);
	}
}
