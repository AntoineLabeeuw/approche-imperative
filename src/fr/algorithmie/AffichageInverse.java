package fr.algorithmie;
/**
 * Soit le tableau suivant : int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
 * Afficher l’ensemble des éléments du tableau grâce à une boucle
 * Afficher l’ensemble des éléments dans l’ordre inverse du tableau
 * Créer un tableau arrayCopy et copier tous les éléments de array dans arrayCopy
 * 
 * @author antoinelabeeuw
 *
 */
public class AffichageInverse {
	/**
	 * 
	 * @param args : none used
	 */
	public static void main(String[] args) {
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
		// déclaration d'un noveau tableau de taille array.length
		int[] arrayCopy = new int[array.length];
		// même boucle pour l'affichage et la copie du tableau dans arrayCopy
		// je le fais donc au même endroit
		System.out.println("Affichage du tableau array");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
			arrayCopy[i] = array[i];
		}
		
		System.out.println();
		System.out.println();

		//affichage des éléments dans l'ordre inverse
		System.out.println("Afficher l’ensemble des éléments dans l’ordre inverse du tableau");
		for (int i = (array.length-1); i>= 0; i--) {
			System.out.print(array[i] + " ");
		}
		
		System.out.println();
		System.out.println();
		
		//affichage du tableau arrayCopy non demandé, mais vérification quand même de la fonctionnalité
		System.out.println("Affichage du tableau arrayCopy");
		for (int i = 0; i < arrayCopy.length; i++) {
			System.out.print(arrayCopy[i] + " ");
		}
	}

}
