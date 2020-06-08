package fr.algorithmie;
/**
 * 2 tableaux : 
 * {1,15,-3,0,8,7,4,-2,28,7,-1,17,2,3,0,14,-4};
 * {-1,12,17,14,5,-9,0,18};
 * 
 * Créer un tableau qui contient la somme des 2 précédents tableaux
 * @author antoinelabeeuw
 *
 */
public class SommeDeTableauxDiff {
	/**
	 * 
	 * @param args : none used
	 */
	public static void main(String[] args) {
		//beaucoup de verifications pour savoir lequel est le plus petit
		// on ajoute que jusqu'a la fin du plus petit, copie du plus grand ensuite
		int[] tab1 = {1,15,-3,0,8,7,4,-2,28,7,-1,17,2,3,0,14,-4};
		int[] tab2 = {-1,12,17,14,5,-9,0,18};
		int[] sommeDif;
		// initialisation de la taille de somme tab
		// plus somme dans la foulée
		if (tab1.length > tab2.length) {
			//tab1 le plus grand
			sommeDif = new int[tab1.length];
			for (int i = 0; i < tab1.length; i++) {
				if (i < tab2.length) {
					// ajout des deux
					sommeDif[i] = tab1[i] + tab2[i];
				} else {
					// copie de tab1
					sommeDif[i] = tab1[i];
				}
			}
		} else {
			//tab2 le plus grand
			sommeDif = new int[tab2.length];
			for (int i = 0; i < tab2.length; i++) {
				if (i < tab1.length) {
					// ajout des deux
					sommeDif[i] = tab1[i] + tab2[i];
				} else {
					// copie de tab1
					sommeDif[i] = tab2[i];
				}
			}
		}
		//verification
		System.out.println("Afficher l’ensemble des éléments du tableau sommeDif");
		for (int i = 0; i < sommeDif.length; i++) {
			System.out.print(sommeDif[i] + " ");
		}
	}

}
