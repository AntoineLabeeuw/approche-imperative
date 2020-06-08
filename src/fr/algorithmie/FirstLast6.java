package fr.algorithmie;
/**
 * On calcule une valeur booléenne qui contrôle le tableau de la sorte :
 *  elle vaut true si le tableau a au moins 1 élément et si le premier élément ou le dernier élément vaut 6.
 *  elle vaut false dans les autres cas
 *  écrire l’algo de valorisation de cette variable avec le minimum de ligne
 *  
 * @author antoinelabeeuw
 *
 */
public class FirstLast6 {
	/**
	 * 
	 * @param args none used
	 */
	public static void main(String[] args) {
		int[] arraytest1 = {};
		int[] arraytest2 = {3,-8,17,5,-1,4,0,6,2,11,-5,-4,8};
		int[] arraytest3 = {4, 0, 6};
		int[] arraytest4 = {6, 0, 4};
		
		System.out.println("test 1 : " + firstLast(arraytest1)); // false
		System.out.println("test 2 : " + firstLast(arraytest2)); // false
		System.out.println("test 3 : " + firstLast(arraytest3)); // true
		System.out.println("test 4 : " + firstLast(arraytest4)); // true
		
	}
	// initialiser le booleen directement a false, cela evite de faire la boucle else
	// doit faire le moins de ligne possible
	// création d'une fonction pour les tests
	static boolean firstLast(int[] tab) {
		boolean firstLast = false;
		if (tab.length > 0 && (tab[0] == 6 || tab[tab.length-1] == 6)) {
			firstLast = true;
		}
		return firstLast;
	}
}
