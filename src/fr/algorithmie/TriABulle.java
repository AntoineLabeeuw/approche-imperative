package fr.algorithmie;
/**
 * Soit le arrayleau suivant :
 * int[]array2={3,-8,17,5,-1,4,0,6,2,11,-5,-4,8};
 * Implémenter la méthode de tri à bulles
 * 
 * @author antoinelabeeuw
 *
 */
public class TriABulle {
	/**
	 * 
	 * @param args : none used
	 */
	public static void main(String[] args) {
		int[] array = {3,-8,17,5,-1,4,0,6,2,11,-5,-4,8};
		int taille = array.length;  
        int temp = 0;  
        for(int i=0; i < taille; i++) {
        	for(int j=1; j < (taille-i); j++) {  
        		if(array[j-1] > array[j]) {
        			//switch
                    temp = array[j-1];  
                    array[j-1] = array[j];  
                    array[j] = temp;  
                }
            }
        }
        // verification
        System.out.println("Tableau trié : ");
        for(int i=0; i < array.length; i++) {  
        	System.out.print(array[i] + " ");  
        }
	}
}
