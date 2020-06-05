package fr.declaration.variable;
/**
 * déclare tous les types de variables <br/>
 * et les printent à la fin. <br/>
 * 
 * @author antoinelabeeuw
 */
public class DeclarationApp {
	/**
	 * classe qui déclare des variables et les affiche
	 * @param args
	 */
	public static void main(String[] args) {
		// declarations
		byte a = 1;
		short b = -23;
		int c = 12;
		long d = 100000000L;
		float e = 2.23F;
		double f = -2.12D;
		char g = 'w';
		boolean h = false;
		String i = "test";
		String randomString = "Voici le résultat d’un calcul :\n1+5=6";
		// prints
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
		System.out.println(i);
		System.out.println(12);
		System.out.println(randomString);
	}

}
