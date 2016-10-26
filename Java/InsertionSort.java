/*
** The mentioned algorithm is known as Insertion Sort Algorithm
** This algorithm with sort the numbers in the incremental form
** To chnge the order or to sort the nubers in the decremental for 
** change the while loop to "insertion_sort[j] < key"
** Create by 
** - Abhimanyu (manyu)
*/
import java.util.Arrays;

public class InsertionSort {
	
	public static void main(String[] args){
	
		int[] insertion_sort = {5,3,8,6,2,7,4,1}; // Declare int array 
		
		System.out.println("insertion_sort(initial)---- " + Arrays.toString(insertion_sort));
		
		for(int i = 1; i<insertion_sort.length; i++){
			int key = insertion_sort[i];
			int j = i-1;
			
			while(j >= 0 && insertion_sort[j] > key){
				insertion_sort[j + 1] = insertion_sort[j];
				j = j - 1;
			}
			insertion_sort[j + 1] = key;
		}
		System.out.println("insertion_sort(final) " + Arrays.toString(insertion_sort));
	}
}
