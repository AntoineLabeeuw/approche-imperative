package fr.algorithmie;

import java.util.Scanner;

/**
 * Ecrire un programme qui demande 10 nombres à 
 * un utilisateur et qui affiche le plus grand de ces nombres.
 * @author antoinelabeeuw
 *
 */
public class InteractifPlusGrand {
	/**
	 * 
	 * @param args :  none used
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//initialisation la plus faible possible
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < 10; i++) {
			System.out.println("Saisissez un nombre :");
			int nb = scanner.nextInt();
			if (nb > max) {
				max = nb;
			}
		}
		System.out.println("le maximum des 10 chiffres donnés est : " + max);
		scanner.close();
	}

}
