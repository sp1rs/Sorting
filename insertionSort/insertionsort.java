
/*  
	
	Author: Shashank Parekh
	This program is about sorting the array element in increasing element is called insertion sort.
	The runnig time of this algorithm is n^2.Where n is the number of elements in the array.
*/

import java.util.Scanner;
public class insertionsort{
	public static void main(String[] args){

		// Initiate the scanner object
		Scanner sc=new Scanner(System.in);
	
		System.out.println("Enter the number of element in array");
		int t=sc.nextInt();

		// Intialize the array object and enter elment in the array
		int arr[]=new int[t];
		System.out.println("Enter the element in array");
		for(int i=0;i<t;i++)
			arr[i]=sc.nextInt();
		
		// Logic of insertion sort
		for(int j=1;j<arr.length;j++){
			int key=arr[j];
			int k=j-1;
			while(k>=0 && (arr[k]>key)){
				arr[k+1]=arr[k];
				k--;
			}
			arr[k+1]=key;
		}	
		
		// Print the sorting array
		for(int l=0;l<t;l++){
			System.out.print(arr[l]+" ");
		}
		System.out.println();
	}
}
