package fr.algorithmie;
//import de la class Scanner
import java.util.Scanner;
/**
 * Ecrire un programme qui demande un nombre à l’utilisateur qui doit être compris entre 1 et 10. 
 * Une fois que le nombre est bien entre 1 et 10, le programme affiche la table de multiplication de ce nombre.
 * 
 * @author antoinelabeeuw
 *
 */
public class InteractifTableMult {
	/**
	 * 
	 * @param args none used
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 
		int nb = 100;
		while (nb > 10 || nb < 0) {
			System.out.println("entrez un chiffre compris entre 0 et 10 :");
			nb = scanner.nextInt();
		}
		// passage à la suite si le nombre est entre 0 et 10
		System.out.println("affichage de la table de multiplication de " + nb + " :");
		for (int i = 1; i<=10; i++) {
			System.out.println(nb + " * " + i + " = " + nb * i);
		}
		scanner.close();
	}
}
