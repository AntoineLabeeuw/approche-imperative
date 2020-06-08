package fr.algorithmie;
/**
 * {1,15,-3,0,8,7,4,-2,28,7,-1,17,2,3,0,14,-4};
 * {-1,12,17,14,5,-9,0,18,-6,0,4,-13,5,7,-2,8,-1};
 * Créer un tableau qui contient la somme des 2 précédents tableaux
 * 
 * @author antoinelabeeuw
 *
 */
public class SommeDeTableaux {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// même taille, 3 e tableau de la taille des deux autres
		int[] tab1 = {1,15,-3,0,8,7,4,-2,28,7,-1,17,2,3,0,14,-4};
		int[] tab2 = {-1,12,17,14,5,-9,0,18,-6,0,4,-13,5,7,-2,8,-1};
		int[] sommeTab = new int[tab1.length];
		for (int i = 0; i < tab1.length; i++) {
			sommeTab[i] = tab1[i] + tab2[i];
		}
		// print du tableau pour verification
		// on peut aussi print directement apres la somme dans la 1e boucle
		System.out.println("Afficher l’ensemble des éléments du tableau grâce à une boucle");
		for (int i = 0; i < sommeTab.length; i++) {
			System.out.print(sommeTab[i] + " ");
		}
	}

}
