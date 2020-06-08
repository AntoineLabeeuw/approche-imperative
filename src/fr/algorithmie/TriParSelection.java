package fr.algorithmie;
/**
 * Soit le tableau suivant :
 * int[]array2={3,-8,17,5,-1,4,0,6,2,11,-5,-4,8};
 * Implémenter la méthode tri par sélection
 * @author antoinelabeeuw
 *
 */
public class TriParSelection {
	/**
	 * 
	 * @param args : none used
	 */
	public static void main(String[] args) {
		int[] array =  {3,-8,17,5,-1,4,0,6,2,11,-5,-4,8};
		for (int i = 0; i < array.length - 1; i++)  
        {
             int index = i;  
             for (int j = i + 1; j < array.length; j++)
             {
                  if (array[j] < array[index]){ 
                       index = j;
                  }
             }
             int min = array[index];
             array[index] = array[i]; 
             array[i] = min;
        }
		
		// verification
		System.out.println("Tableau trié : ");
		for(int i=0; i < array.length; i++) {  
             System.out.print(array[i] + " ");  
        } 
	}
}
