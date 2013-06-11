
/*
	This is code for heap sorting.
	Heapsort running time is n*log(n) , where n  is the number of elment to be sorted.
	Heapsort is better than insertion sort and is also better than merge sort if n is large.

	=======================
	Author: Shashank Parekh
	=======================
*/
import java.util.Scanner;

public class heapsort{
	public int arraylength=100;
	private static int arr[];
	private static int heapsize;
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		// Enter the number to be entered in the array
		System.out.println("Enter the number");
		int t=sc.nextInt();
		arr=new int[t+1];
		//Enter the element in the array
		System.out.println("Enter the element in the array");
		for(int i=1;i<=t;i++){
			arr[i]=sc.nextInt();
		}

		heapsize=t;

		// Build max heap
		BuildMaxHeap(arr);

		//Print the heapify array
		System.out.println("Print the array");
		for(int k=1;k<=t;k++){
			System.out.print(arr[k]+" ");
		}
		System.out.println();

		//Convert heapify array into sorted array
		HeapSort(arr);

		//Print the sorted array
		System.out.println("Print the sorted array");
                for(int k=1;k<=t;k++){
                        System.out.print(arr[k]+" ");
                }
                System.out.println();
	}

	// return the index of the left child of the ith node
	public static int left(int i){
		return 2*i;
	}

	//return the index of the right child of the ith node
	public static int right(int i){
		return (2*i+1);
	}

	// return the index of the parent of the ith node
	public static int parent(int i){
		return i/2;
	}
	
	//Build the max heap
	public static void BuildMaxHeap(int arr[]){
		for(int i=heapsize/2;i>=1;i--){
			
			//Call max-heapify method on every element except leaf
			MaxHeapify(arr,i);
		}
	}


	public static void MaxHeapify(int arr[],int i){
		int l=left(i);
		int r=right(i);
		int largest;
		if(l<= heapsize && arr[i]<=arr[l])
			largest=l;
		else
			largest=i;

		if(r<=heapsize && arr[r]>=arr[largest])
			largest=r;
		if(largest != i){
			int temp=arr[i];
			arr[i]=arr[largest];
			arr[largest]=temp;
			MaxHeapify(arr,largest);
		}
	}
	public static void HeapSort(int arr[]){
		for(int i=heapsize;i>=2;i--){
			int temp=arr[1];
			arr[1]=arr[i];
			arr[i]=temp;
			heapsize=heapsize-1;
			MaxHeapify(arr,1);
		}
	}
}
