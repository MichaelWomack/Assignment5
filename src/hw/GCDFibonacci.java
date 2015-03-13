/**Michael Womack
 * 2/24/2015
 * CS 3401
 * 
 * Write a program that obtains the execution time for finding the GCD of every 
 * two consecutive Fibonacci numbers from the index 40 to index 45 using the 
 * algorithms in Listings 22.3 and 22.4 in the text.  Display the results in a table.
 */
package hw;

public class GCDFibonacci {

	public static void main(String[] args) {
		
			long start;
			for(int i = 40; i < 45; i+=2){
				start = System.currentTimeMillis();
				System.out.printf("GCD %d and %d |\tTime(ms) | ", i, i+1);
				System.out.printf("EuclidGCD %d and %d | Time(ms)\n", i, i+1);
				System.out.print("----------------------------------------------------------\n");
				System.out.print(gcd(fib(i), fib(i+1)));
				System.out.print("\t\t" + (System.currentTimeMillis()-start));
		    
				start = System.currentTimeMillis();
				System.out.print("\t  \t" + euclidGCD(fib(i), fib(i+1)));
				System.out.println("\t\t  " + (System.currentTimeMillis()-start)+"\n\n");
			}
	
	}
	
	public static long fib(long n){
		int f0 = 0;
		int f1 = 1;
		int f2 = 1;
		
		if(n == 0)
			return 0;
		else if(n == 1)
			return 1;
		else if (n == 2)
			return 1;
		
		for(int i = 3; i < n; i++){
			f0 = f1;
			f1 = f2;
			f2 = f0 + f1;
		}
		return f2;
	}
	
	public static long gcd(long m, long n){
		long gcd = 1;
		
		if(m % n == 0) return n;
		
		for(long k = n/2; k >= 1; k--)
			if(m % k == 0 && n % k == 0){
				gcd = k;
				break;
			}
		
		return gcd;
	}
	
	public static long euclidGCD(long m, long n){
		if(m % n == 0) 
			return n;
		else 
			return euclidGCD(n, m % n);
	}

}
