package fr.boucles;
/**
 * Exercises about loops
 * Affichez tous les nombres de 1 à 10
 * Affichez 20 fois votre nom et votre prénom
 * Affichez les éléments pairs de 2 à 100
 * Affichez les éléments impairs de 1 à 99
 * 
 * @author antoinelabeeuw
 *
 */
public class ExerciceBoucleBase {
	/**
	 * @param args : no args used
	 */
	public static void main(String[] args) {
		//print numbers from 1 to 10
		System.out.println("Affichez tous les nombres de 1 à 10 : ");
		for (int i =0; i<10; i++) {
			System.out.println(i+1);
		}
		
		//print 20 times my name
		System.out.println();
		System.out.println("Affichez 20 fois votre nom et votre prénom");
		String name = "Antoine LABEEUW";
		for (int i =0; i< 20; i++) {
			System.out.println("je m'appelle " + name + " (" + (i+1) + "e fois)");
		}
		
		
		
		// print all even numbers from 2 to 100
		// should not print 0 --> start the loop at 2
		System.out.println();
		System.out.println("Affichez les éléments pairs de 2 à 100");
		for (int i =2; i<=100; i++) {
			if ((i%2) == 0) {
				System.out.println("nombre pair : " + i);
			}
		}
		
		
		// print all odd numbers from 1 to 99
		System.out.println();
		System.out.println("Affichez les éléments impairs de 1 à 99");
		for (int i =0; i<100; i++) {
			if ((i%2) != 0) {
				System.out.println("nombre impair : " + i);
			}
		}
	}
}
