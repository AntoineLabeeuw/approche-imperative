package fr.algorithmie;
/**
 * Dans cette classe, on déclare un tableau d’entiers
 * On calcule une valeur booléenne qui contrôle le tableau de la sorte :
 * elle vaut true si le tableau est de longueur supérieure ou égale à 1 et que le premier et le dernier élément du tableau ont la même valeu
 * elle vaut false dans les autres cas
 * écrire l’algo de valorisation de cette variable avec le minimum de ligne
 * @author antoinelabeeuw
 *
 */
public class FirstLast {
	/**
	 * 
	 * @param args : none used
	 */
	public static void main(String[] args) {
		// même méthodo qu'avec firstLast6 mais en changeant le test
		// ici aussi, utilisation de fonction : plus propre et mieux pour la vérification
		int[] arraytest1 = {};
		int[] arraytest2 = {3,-8,17,5,-1,4,0,6,2,11,-5,-4,8};
		int[] arraytest3 = {4, 0, 4};
		
		System.out.println("test 1 : " + firstLast(arraytest1)); // false
		System.out.println("test 2 : " + firstLast(arraytest2)); // false
		System.out.println("test 3 : " + firstLast(arraytest3)); // true
		
	}
	// initialiser le booleen directement a false, cela evite de faire la boucle else
	// doit faire le moins de ligne possible
	// création d'une fonction pour les tests
	static boolean firstLast(int[] tab) {
		boolean firstLast = false;
		if (tab.length > 0 && (tab[0] == tab[tab.length-1])) {
			firstLast = true;
		}
		return firstLast;
	}

}
