package fr.algorithmie;
/**
 * Soit le tableau suivant : int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
 * Créer un tableau arrayCopy et copier tous les éléments de array dans arrayCopy mais dans l’ordre inverse.
 * Afficher l’ensemble des éléments des 2 tableaux
 * 
 * @author antoinelabeeuw
 *
 */
public class InversionContenu {
	/**
	 * 
	 * @param args : none used
	 */
	public static void main(String[] args) {
		int[] array = {1,15,-3,0,8,7,4,-2,28,7,-1,17,2,3,0,14,-4};
		int[] arrayCopy = new int[array.length];
		short compteur = 0;
		for (int i = array.length-1; i >= 0; i--) {
			arrayCopy[compteur] = array[i];
			compteur++;
		}
		// vérification du tableau arrayCopy
		System.out.println("Affichage du tableau arrayCopy");
		for (int i = 0; i < arrayCopy.length; i++) {
			System.out.print(arrayCopy[i] + " ");
		}
	}

}
