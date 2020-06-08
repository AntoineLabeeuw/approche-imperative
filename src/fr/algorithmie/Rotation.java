package fr.algorithmie;
/**
 * Dans cette classe, on déclare un tableau d’entiers
 * Effectuez une rotation à droite des éléments.
 * Exemple : si vous avez {0,1,2,3} vous obtenez {3,0,1,2}
 * @author antoinelabeeuw
 *
 */
public class Rotation {
	/**
	 * 
	 * @param args none used
	 */
	public static void main(String[] args) {
		// stockage du dernier nombre dans une variable
		// on parcoure le tableau a l'envers et on remplace avec la valeur d'avant
		// si on ne peut pas, c'est qu'on est au début (index == -1)
		// don con remplace avec la valeur stockée au début
		int[] array = {0,1,2,3};
		int last = array[array.length-1];
		for (int i = array.length-1; i >= 0; i--) {
			if (i-1>=0) {
				array[i] = array[i-1];
			} else {
				array[0] = last;
			}
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

}
