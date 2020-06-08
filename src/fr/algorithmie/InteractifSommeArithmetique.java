package fr.algorithmie;

import java.util.Scanner;

/**
 * Ecrire un programme qui demande un nombre à l’utilisateur puis calcule la somme de tous les
 * entiers compris entre 1 et ce nombre.
 * 
 * Exemple si l’utilisateur saisit 5, le programme affiche: 15
 * 
 * 5+4+3+2+1
 * @author antoinelabeeuw
 *
 */
public class InteractifSommeArithmetique {
	/**
	 * 
	 * @param args none used
	 */
	public static void main(String[] args) {
		// meilleure façon de faire est d'utiliser une méthode récursive.
		Scanner scanner = new Scanner(System.in);
		System.out.println("entrez un chiffre :");
		int nb = scanner.nextInt();
		System.out.println("affichage de la somme de tous les entiers compris entre 1 et " + nb + " : " + sommeTous(nb));
		scanner.close();
	}
	
	static int sommeTous(int n) {
		if (n!=1) {
			return (n + sommeTous(n-1));
		}else {
			return 1;
		}
	}
}
