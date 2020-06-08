package fr.algorithmie;

import java.util.Scanner;

/**
 * Ecrire un programme qui demande un nombre à l’utilisateur puis qui affiche les 10 nombres suivants. 
 * Par exemple si l’utilisateur saisit 5, 
 * le programme affiche : 6, 7, 8, 9, 10, 11, 12, 13, 14, 15.
 * @author antoinelabeeuw
 *
 */
public class InteractifChiffresSuivants {
	/**
	 * 
	 * @param args : none used
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("entrez un chiffre :");
		int nb = scanner.nextInt();
		System.out.println("affichage des 10 prochains chiffres : ");
		for (int i = 1; i <= 10; i++) {
			// test pour un affichage propre : 
			// virgule entre les choffres, point à la fin.
			if (i !=10) {
				System.out.print((nb+i) + ", ");
			} else {
				System.out.print((nb+i) + ".");
			}
		}
		scanner.close();
	}
}
