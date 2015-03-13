/** Michael Womack
 * 2/24/2015
 * CS3401
 * Assignment 5
 * 
 * Write a program that finds the maximum increasingly ordered subsequence 
 * of characters in a string.  Analyze the time complexity of your program.
 */
package hw;
import java.util.Stack;

public class IncreasingSubsequence {
		
	public static void main(String[] args){
		
		System.out.println(maxIncrease("Welcome"));
	}
	
	
	/**
	 * @param String s
	 * @return a subsequence of the maximum increasing characters, using a stack to
	 * keep track of the characters of the longest sequence. The time complexity is 
	 * O(n^2).
	 */
	public static String maxIncrease(String s){
		
		Stack<Character> stack = new Stack<>();
		String longest = "";
		
		for(int i = 0; i < s.length(); i++){
			stack.push(s.charAt(i));
			for(int j = i; j < s.length(); j++){
				
				if(s.charAt(j) > stack.peek()){
					stack.push(s.charAt(j));
				}
			}
			if(stack.size() > longest.length()){
				longest = "";
				while(!stack.isEmpty())
					longest = stack.pop() + longest;
			}
			else{
				while(!stack.isEmpty())
					stack.pop();
					
			}
		}
		
		return longest;
	}
}
	
	
