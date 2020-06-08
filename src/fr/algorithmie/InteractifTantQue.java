package fr.algorithmie;
// import de la class Scanner
import java.util.Scanner;

/**
 * Ecrire un programme qui demande un nombre à l’utilisateur qui doit être obligatoirement
 * compris entre 1 et 10 :
 * Tant que ce nombre n’est pas compris entre 1 et 10, le programme redemande un nombre à l’utilisateur.
 * Si le nombre est compris entre 1 et 10, le programme affiche ce nombre et se termine.
 * 
 * @author antoinelabeeuw
 *
 */
public class InteractifTantQue {
	/**
	 * 
	 * @param args : none used
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in) ;
		int nb = 100;
		while (nb > 10 || nb < 0) {
			System.out.println("entrez un chiffre : ");
			nb = scanner.nextInt();
		}
		System.out.println("Nombre compris entre 0 et 10, fin du programme.");
		scanner.close();
	}
}
