
/*
	This is a quicksort code.
	Running time of this is n*log(n), where n is number of element to be sorted.
	worst case is n^2.
	This is most efficient than insertion or merge sort and even heapsort.
*/

import java.util.Scanner;

public class quicksort{
	private static int arr[];
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
			
		// Enter the number to be entered in the array
		System.out.println("Enter the number to be entered in the array");     
		int t=sc.nextInt();
		arr=new int[t];

		// Enter the number in the array to be sorted
		System.out.println("Enter the number in the array to be sorted");
		for(int i=0;i<t;i++){
			arr[i]=sc.nextInt();
		}
		
		QuickSort(arr,0,t-1);
		// Print the sorted array
		for(int i=0;i<t;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	public static void QuickSort(int arr[],int p,int r){
		if(p<r){
			int q=partition(arr,p,r);
			QuickSort(arr,p,q-1);
			QuickSort(arr,q+1,r);
		}
	}
	public static int partition(int arr[],int p,int r){
		int x=arr[r];
		int i=p-1;
		for(int j=p;j<=r-1;j++){
			if(arr[j]<=x){
				i=i+1;
				int temp=arr[j];
				arr[j]=arr[i];
				arr[i]=temp;
				
			}
		}
		int temp=arr[i+1];
		arr[i+1]=arr[r];
		arr[r]=temp;
		return i+1;
	}
}
