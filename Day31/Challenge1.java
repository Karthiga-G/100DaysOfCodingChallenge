//Challenge - Days in Month

/*
The program must accept an integer M as the input. The program must print the number of days in the month M if it is valid. Else the program must print Invalid as the output.
Note: The number of days in each month will be considered from a non-leap year.
Boundary Condition(s):
1 <= M <= 50
Input Format:
The first line contains M.
Output Format:
The first line contains the number of days in the month M or Invalid.
Example Input/Output 1:
Input:
5
Output:
31
Explanation:
In a non-leap year, there are 31 days in the 5
th month.
So 31 is printed.
Example Input/Output 2:
Input:
2
Output:
28
Example Input/Output 3:
Input:
15
Output:
Invalid
*/

//Solution

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		if(n>=1 && n<=7){
    		if(n==2){
    		    System.out.println("28");
    		}
    		else if(n%2!=0){
    		    System.out.println("31");
    		}
    		else{
    		    System.out.println("30");
    		}
		}
		else if(n>=8 && n<=12){
		    if(n%2==0){
		        System.out.println("31");
		    }
		    else if(n%2!=0){
		        System.out.println("30");
		    }
		}
		else{
		    System.out.println("Invalid");
		}
	}
}
