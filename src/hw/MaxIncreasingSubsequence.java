/** Michael Womack
 * 2/24/2015
 * CS3401
 * Assignment 5
 * 
 * Write a program that finds the maximum increasingly ordered subsequence 
 * of characters in a string.  Analyze the time complexity of your program.
 */
package hw;

public class MaxIncreasingSubsequence {
	
	public static void main(String[] args) {
		
		System.out.println(maxIncrease("welcome"));
	}

	private static String maxIncrease(String s) {
		
		String result = "";
		int bestIndex = 0;
		int localIndex = 0;
		int localLength = 1;
		int bestLength = 0;
		int bestEndIndex;
		int maxBeginIndex[] = new int[s.length()];
		
		for(int i = 0; i < s.length(); i++){
			bestIndex = i;
			for(int j = i; j < s.length(); j++){
				
				if(s.charAt(j) > s.charAt(bestIndex)){
					
					bestIndex = j;
					localLength++;
					maxBeginIndex[i] = localLength;
				}
				
					
			    if(localLength > bestLength)
					bestLength = localLength;
								
			}
			localLength = 1;
			
		}
		
		int maxStartIndex = maxBeginIndex[0];
		for(int i = 1; i < s.length(); i++){
			if(maxBeginIndex[i] > maxStartIndex)
				maxStartIndex = maxBeginIndex[i];
		}
		result += s.charAt(maxStartIndex);
		for(int i = maxStartIndex+1 ; i < maxStartIndex + bestLength; i++){
			
				result += s.charAt(i);
		}
			
		return result;
	}
}
