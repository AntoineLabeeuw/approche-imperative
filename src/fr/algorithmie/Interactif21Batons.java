package fr.algorithmie;

import java.util.Scanner;

/**
 * Celui qui prend le dernier baton a perdu.
 * @author antoinelabeeuw
 *
 */
public class Interactif21Batons {
	/**
	 * 
	 * @param args : none used
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int nbBatons = 21;
		boolean fin = false;
		
		while(!fin) {
			System.out.println("il reste " + nbBatons + " bâtons, choisissez si vous voulez en retirer 1, 2 ou 3 :");
			int nbBatonsPris = scanner.nextInt();
			if (nbBatonsPris > 0 && nbBatonsPris < 4) {
				if (nbBatons - nbBatonsPris <= 0) {
					System.out.println("Vous avez perdu.");
					fin = true;
				} else {
					nbBatons -= nbBatonsPris;
				}
				if (!fin) {
					//tour de l'ordi
					// pour que l'ordi gagne à chaque fois, il doit prendre 4 - nbBatonsPris
					// exemple, joueur a pris 3 batons, l'ordi doit en prendre 1.
					int iaBatonsPris = 4 - nbBatonsPris;
					if (nbBatons - iaBatonsPris <= 0) {
						System.out.println("L'ordinateur a perdu");
						fin = true;
					} else {
						nbBatons -= iaBatonsPris;
						System.out.println("L'ordinateur à pris " + iaBatonsPris + " bâtons");
					}
				}
			} else {
				System.out.println("Vous avez fait une erreur, choisissez entre 1, 2 ou 3 bâtons à retirer.");
			}
		}
		scanner.close();
	}
}
