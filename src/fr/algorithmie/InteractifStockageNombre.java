package fr.algorithmie;

import java.util.Scanner;

/**
 * Faire un programme avec le menu suivant : 
 * 1. Ajouter un nombre
 * 2. Afficher les nombres existants.
 * Si l’utilisateur sélectionne l’option 1, le programme demande un nombre 
 * à l’utilisateur puis l’ajoute à un tableau.
 * Si l’utilisateur sélectionne l’option 2, le programme affiche le contenu du tableau. 
 * Si le tableau est plein, écrire un algorithme pour agrandir le tableau.
 * 
 * @author antoinelabeeuw
 *
 */
public class InteractifStockageNombre {
	/**
	 * 
	 * @param args : none used
	 */
	public static void main(String[] args) {
		//initialisations
		Scanner scanner = new Scanner(System.in);
		int[] tableauBase = {};
		boolean sortie = false;
		
		//menu
		
		while(!sortie) {
			System.out.println("1 : Ajout de nombres.");
			System.out.println("2 : Affichage du tableau.");
			System.out.println("3 : Quitter.");
			int menu = scanner.nextInt();
			switch(menu) {
			case 1 : 
				System.out.println("Écrire un nombre à ajouter :");
				int ajout = scanner.nextInt();
				// création de lignes pour le tableau
				// création d'un deuxième tableau plus grand de 1 case, stockage de tout dans celui-ci
				// + la nouvelle valeur
				int[] newTab = new int[tableauBase.length +1];
				// stockage
				for (int i = 0; i < tableauBase.length; i++) {
					newTab[i] = tableauBase[i];
				}
				// ajout à la fin de la valeur saisie
				newTab[newTab.length-1] = ajout;
				// newTab devien tableauBase pour pouvoir être affiché
				tableauBase = newTab;
				break;
			case 2 : 
				for (int i = 0; i < tableauBase.length; i++) {
					System.out.print(tableauBase[i] + "|");
				}
				System.out.println(); // saut de ligne
				break;
			case 3 : 
				System.out.println("Sortie.");
				sortie = true;
				break;
			default : 
				break;
			}
		}
		scanner.close();
	}
}
