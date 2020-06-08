package fr.algorithmie;
/**
 * Soit les tableaux suivants :
 * int[] array1 = {1, 15, -3, 8, 7, 4, -2, 28, -1, 17, 2, 3, 0, 14, -4} ;
 * int[]array2={3,-8,17,5,-1,4,0,6,2,11,-5,-4,8};
 * Ecrire le code permettant de compter le nombre d’éléments en commun dans ces 2 tableaux
 * @author antoinelabeeuw
 *
 */
public class ComparaisonTableau {
	/**
	 * 
	 * @param args : none used
	 */
	public static void main(String[] args) {
		int[] array1 = {1,15,-3,8,7,4,-2,28,-1,17,2,3,0,14,-4};
		int[]array2={3,-8,17,5,-1,4,0,6,2,11,-5,-4,8};
		int compteur = 0;
		// attention, les doubles boucles imbriquées ajoute de la complexité algorithmique
		// donc temps de calcul augmente rapidement.
		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array2.length; j++) {
				if (array1[i] == array2[j]) {
					compteur++;
				}
			}
		}
		// verification : il y a 8 doublons
		System.out.println("nombres d'éléments en communs entre les  deux tableaux : " + compteur);
	}

}
