package fr.algorithmie;
// import pour la génération du nombre random
import java.util.Random;
import java.util.Scanner;
/**
 * choisit un nombre aléatoire entre 1 et 100
 * demande à l’utilisateur de trouver ce nombre en lui indiquant s’il est au-dessus ou en dessous du nombre,
 * Lorsque l’utilisateur a trouvé le nombre, le programme affiche « Bravo, vous avez trouvé en N coups » 
 * où N représente le nombre d’essais effecté par l’utilisateur
 * @author antoinelabeeuw
 *
 */
public class InteractifPlusMoins {
	/**
	 * 
	 * @param args : none used
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int randomNb = new Random().nextInt(100) + 1; // entre 1 et 100 et non pas entre 0 et 99
		int compteur = 1;
		boolean memeNombre = false;
		System.out.println("Choissisez un nombre");
		while (memeNombre != true) {
			int nombre = scanner.nextInt();
			if (nombre == randomNb) {
				memeNombre = true;
			} else {
				if (nombre < randomNb) {
					System.out.println("Trop bas");
				} else {
					System.out.println("Trop haut");
				}
				compteur++;
			}
		}
		System.out.println("Vous avez trouvé en " + compteur + " coups.");
		scanner.close();
	}
}
