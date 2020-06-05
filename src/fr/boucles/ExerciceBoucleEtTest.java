package fr.boucles;
/**
 * Afficher l’ensemble des éléments du tableau grâce à une boucle
 * Afficher l’ensemble des éléments dans l’ordre inverse du tableau
 * Combiner une boucle et un test de manière à n’afficher que les entiers supérieurs à 3
 * Combiner une boucle et un test de manière à n’afficher que les entiers pairs
 * Combiner une boucle et un test de manière à n’afficher que valeurs des index pairs
 * Combiner une boucle et un test de manière à n’afficher que les entiers impairs
 * 
 *  * @author antoinelabeeuw
 *
 */
public class ExerciceBoucleEtTest {
/**
 * @param args : no args used
 */
	public static void main(String[] args) {
		int[] array = {1,15,-3,0,8,7,4,-2,28,7,-1,17,2,3,0,14,-4};
		
		
		// print all values of array with a loop
		// The fastest way is to use .length
		System.out.println("Afficher l’ensemble des éléments du tableau grâce à une boucle");
		for (int i=0; i<array.length; i++) {
			System.out.println("Valeur du tableau array en position " + i + " : " + array[i]);
		}
		
		// Print all elements in the reverse order
		// multiple ways to do this. The easiest way to do this is 
		// to loop starting from the last index, and go down
		// we can also create another array that way we can keep it for future use
		System.out.println();
		System.out.println("Afficher l’ensemble des éléments dans l’ordre inverse du tableau");
		for (int i = (array.length-1); i>= 0; i--) {
			System.out.println("2 Valeur du tableau array en position " + i + " : " + array[i]);
		}
		
		// loop and test to print only numbers > 3
		System.out.println();
		System.out.println("Combiner une boucle et un test de manière à n’afficher que les entiers supérieurs à 3");
		for (int i=0; i<array.length; i++) {
			if (array[i] > 3) {
				System.out.println("Valeur du tableau array, supérieur à 3 en position " + i + " : " + array[i]);
			}
		}
		
		// Print only even numbers
		System.out.println();
		System.out.println("Combiner une boucle et un test de manière à n’afficher que les entiers pairs");
		for (int i=0; i<array.length; i++) {
			if ((array[i]%2) == 0) {
				System.out.println("Valeur du tableau array, pair en position " + i + " : " + array[i]);
			}
		}
		
		// print only index of array when value is even
		// not much differences, since i was already printing indexes and values
		System.out.println();
		System.out.println("Combiner une boucle et un test de manière à n’afficher que valeurs des index pairs");
		for (int i=0; i<array.length; i++) {
			if ((array[i]%2) == 0) {
				System.out.println("index du tableau array ou la valeur est impaire : " + i);
			}
		}
		
		// combine loop and test to print only odd integers
		System.out.println();
		System.out.println("Combiner une boucle et un test de manière à n’afficher que les entiers impairs");
		for (int i=0; i<array.length; i++) {
			if ((array[i]%2) != 0) {
				System.out.println("Valeur du tableau array, impair en position " + i + " : " + array[i]);
			}
		}
	}
}
