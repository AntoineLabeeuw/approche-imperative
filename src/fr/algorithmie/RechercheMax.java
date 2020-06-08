package fr.algorithmie;
/**
 * Soit le tableau suivant : int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
 * Rechercher le plus grand élément du tableau
 * @author antoinelabeeuw
 *
 */
public class RechercheMax {
	/**
	 * 
	 * @param args none used
	 */
	public static void main(String[] args) {
		// initialisation d'un variable maximum qui stockera le maximum
		// peut être initalisée a une valeur très faible où à une valeur du tableau
		// pas de différence
		int[] array = {1,15,-3,0,8,7,4,-2,28,7,-1,17,2,3,0,14,-4};
		int maximum = array[0];
		for (int i = 0; i < array.length; i++) {
			if (maximum < array[i]) {
				maximum = array[i];
			}
		}
		System.out.println("le maximum du tableau est de : " + maximum);
	}
}
