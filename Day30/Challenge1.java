//Challenge - Differential Series(First N Terms)


/*
The program must accept an integer N as the input. The program must print the first N terms in the
series given below.
The order of the series must be 2, 5, 10, 17, 26, 37, 50, 65,... and so on.
Boundary Condition(s):
1 <= N <= 1000
Input Format:
The first line contains N.
Output Format:
The first line contains the first N terms in the series separated by a space.
Example Input/Output 1:
Input:
5
Output:
2 5 10 17 26
Explanation:
Here N = 5.
The first 5 terms in the series are 2 5 10 17 26.
Hence the output is 2 5 10 17 26
Example Input/Output 2:
Input:
10
Output:
2 5 10 17 26 37 50 65 82 101
*/

//Solution

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int c= 3;
		int term=2;
		int no_of_terms=0;
		System.out.print(term+" ");
		while(no_of_terms<n-1){
		    term+=c;
		    System.out.print(term+" ");
		    c+=2;
		    no_of_terms++;
		}
	}
}
