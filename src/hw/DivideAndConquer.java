/** Michael Womack
 * 2/24/2015
 * CS3401
 * Assignment 5
 * 
 * Write a method that uses the divide-and-conquer approach to find the 
 * smallest number in an array.  Test your method with multiple arrays.
 */
package hw;

public class DivideAndConquer {

	public static void main(String[] args) {
		
		int[] a = {1,2,3,4,5,6,7,8,9,10};
		System.out.println("The smallest element is " + min(a));
		
		int[] b = {34,456,345};
		System.out.println("The smallest element is " + min(b));
	}

	public static int min(int[] a) {
		if(a == null)
			throw new IllegalArgumentException();
		
		return min(a, 0, a.length-1);
	}
	
	private static int min(int[] a, int low, int high){
		if(high-low == 1)
			return a[low];
	   
	    int	midIndex = (low+high)/2;
		int x = min(a,0, midIndex);
		int y = min(a,midIndex, high);
		
		if(x < y)
			return x;
		else
			return y;
	}
}
