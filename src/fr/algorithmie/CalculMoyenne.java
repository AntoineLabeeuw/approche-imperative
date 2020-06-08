package fr.algorithmie;
/**
 * Soit le tableau suivant : int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
 * Quelle est la moyenne des éléments du tableau ?
 * 
 * @author antoinelabeeuw
 *
 */
public class CalculMoyenne {
	/**
	 * 
	 * @param args : none used
	 */
	public static void main(String[] args) {
		// creation d'une variable total initalisee a 0 a laquelle on aditionne toutes les valeurs du tableau
		// division de total par array.length
		int[] array = {1,15,-3,0,8,7,4,-2,28,7,-1,17,2,3,0,14,-4};
		int total = 0;
		float moyenne = 0.00F;
		for (int i = 0; i < array.length; i++) {
			total += array[i];
		}
		// cast de type, sinon division qui donne 5 sinon
		// pas besoin de cast les deux
		moyenne = total / (float)array.length;
		System.out.println("La moyenne est de : " + moyenne);
	}
}
