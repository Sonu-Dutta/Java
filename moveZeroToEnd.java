/* Java program to push zeroes to back of array */
import java.io.*;

class moveZeroToEnd
{
	static void ZerosToEnd(int arr[], int n)
	{
		int count = 0; 
		for (int i = 0; i < n; i++)
			if (arr[i] != 0)
				arr[count++] = arr[i]; 
		while (count < n)
			arr[count++] = 0;
	}
	public static void main (String[] args)
	{
		int arr[] = {14, 29,38, 24, 0, 0, 42, 75, 0, 63, 0, 39};
		int n = arr.length;
		ZerosToEnd(arr, n);
		System.out.println("Array after pushing zeros to end: ");
		for (int i=0; i<n; i++)
			System.out.print(arr[i]+" ");
	}
}
