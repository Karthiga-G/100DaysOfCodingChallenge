//Challenge - Replace with Maximum digit

/*
The program must accept two integers X and Y as the input. The program must replace all the occurrences of the maximum digit in X with the maximum digit in Y. Then the 
program must print the sum of X and Y as the output.

Boundary Condition(s): 10 <=X, Y <= 10^8
Input Format: The first line contains X and Y separated by a space.
Output Format: The first line contains an integer representing the sum of X and Y.

Example Input/Output 1:
Input: 1878 2020
Output: 3292
Explanation:
Here X 1878 and Y = 2020.
After replacing all the occurrences of the maximum digit 8 in 1878 with the maximum digit 2 in 2020, the integer 1878 becomes 1272.
Here the sum of 1272 and 2020 is 3292.
Hence the output is 3292

Example Input/Output 2:
Input:
1111 144
Output: 4588

Example Input/Output 3:
Input:
189 1239
Output: 1428
*/

//Solution

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int x= sc.nextInt();
		int y= sc.nextInt();
        int x_ldigit= maxNumber(x);
        int y_ldigit= maxNumber(y);
        String xstr= Integer.toString(x);
        String ystr= Integer.toString(y);
        String xld= Integer.toString(x_ldigit);
        String yld= Integer.toString(y_ldigit);
        String res= xstr.replaceAll(xld, yld);
        int modified_x= Integer.parseInt(res);
        int result= modified_x+y;
        System.out.println(result);
	}
	public static int maxNumber(int n){
	    int large=0;
	    while(n!=0){
	        int r= n%10;
	        large= Math.max(r, large);
	        n/=10;
	    }
	    return large;
	}
}
