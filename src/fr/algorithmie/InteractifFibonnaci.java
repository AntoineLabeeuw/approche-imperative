package fr.algorithmie;

import java.util.Scanner;

/**
 * La suite de Fibonacci est une suite qui commence par 0 et 1 et dans laquelle le nombre de rang 
 * N est égal à la somme des nombres de rangs N-1 et N-2
 * 
 * Demander à l’utilisateur de choisir un rang N
 * Ecrire un algorithme qui calcule et affiche le nombre de rang N
 * 
 * @author antoinelabeeuw
 *
 */
public class InteractifFibonnaci {
	/**
	 * 
	 * @param args none used
	 */
	public static void main(String[] args) {
		// initialisation
		Scanner scanner = new Scanner(System.in);
		System.out.println("Saisissez un nombre positif ou nul : ");
		int rang = scanner.nextInt();
		
		int premierNombre = 0; //== a0
		int deuxiemeNombre = 1; //== a1
		int temp = 0;
		if(rang >= 0) {
			for (int i = 2; i <= rang; i++) {
				// calcul pas à pas de la suite de fibonnaci.
				// exemple :
				// a2 = a1 = a0
				// on se déplace "vers la droite"
				// a1 devient alors a2 (d'où le deuxiemeNombre = temp)
				// a0 devient a1 (premierNombre = deuxiemeNombre.
				// et ainsi de suite jusqu'au bon rang..
				temp = premierNombre+ deuxiemeNombre;
				premierNombre = deuxiemeNombre;
				deuxiemeNombre = temp;
			}
			System.out.println("Le nombre de rang " + rang + " est de : " + temp);
		} else {
			System.out.println("Choisissez un nombre supérieur ou égal à 0");
		}
		scanner.close();
	}

}
