
/*
	This program is about sorting the sequence in increasing order and is called mergesort.
	The running time of merge sort is n*ln(n), where n is number of element in array.
	This is better sorting algorithm , but if n is large then it can create problem , since we are using recursion,to recursively call an array.
*/
import java.util.Scanner;
public class mergesort{
	public static int arr[];
	public static void main(String[] args){ 
		Scanner sc=new Scanner(System.in);
		// Enter the number of array element
		System.out.println("Enter the number to be entered in the array ");
		int t=sc.nextInt();
		arr=new int[t];
	
		System.out.println("Enter element in the array");
		for(int i=0;i<t;i++){
			arr[i]=sc.nextInt();
		}
		mergeSort(arr,0,t-1);

		// Print the sorting array in ascending order
		for(int i=0;i<t;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

	// It will merge the two sorting array into an resulting sorting array

	public static void merge(int a[],int p, int q, int r){
		int n=q-p+1;
		int m=r-q;
		int x[]=new int[n+1];
		int y[]=new int[m+1];
		for(int i=0;i<n;i++){
			x[i]=arr[p+i];
		}
		for(int j=0;j<m;j++){
			y[j]=arr[q+j+1];
		}
		
		x[n]=1000000;	
		y[m]=1000000;
		int i=0;
		int j=0;
		for(int k=p;k<=r;k++){
			if(x[i]<=y[j]){
				arr[k]=x[i];
				i++;
			}else{
				arr[k]=y[j];
				j++;
			}
		}
	}
	
	// Recursively call the array	

	public static void mergeSort(int a[],int p,int r){
		if(p<r){
			int q=(p+r+1)/2;
			mergeSort(a,p,q-1);
			mergeSort(a,q,r);
			merge(a,p,q-1,r);
		}
	}
}
