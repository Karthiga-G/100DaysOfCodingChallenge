## Challenge
The program must accept an integer matrix of size NxN as the input. The program must print the number of rows, where the sum of the integers in the rows is equal to the \
sum of the integers in its corresponding column.
Boundary Condition(s):
1 <= N <= 50
Input Format:
The first line contains N.
The next N lines each contain N integers separated by a space.
Output Format:
The first line contains an integer as per the given condition.
Example Input/Output 1:
Input:
3
1 2 3 
3 2 1
2 1 4
Output:
1
Explanation:
The sum of integers in the 1st row is 6 (1+2+3).
The sum of integers in the 1st column is 6 (1+3+2).
The sum of integers in the 2nd row is 6 (3+2+1).
The sum of integers in the 2nd column is 5 (2+2+1).
The sum of integers in the 3rd row is 7 (2+1+4).
The sum of integers in the 3rd column is 8 (3+1+4).
Here the 1st row and the 1st column have the equal sum. So the count is 1.
Hence the output is 1
Example Input/Output 2:
Input:
2 
1 2
2 1
Output:
2

## Solution

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n= sc.nextInt();
		int a[][]=new int[n][n];
		int rs=0;
		int cs=0;
		int c=0;
		for(int i=0; i<n; i++){
		    for(int j=0; j<n; j++){
		        a[i][j]=sc.nextInt();
		    }
		}
		for(int i=0; i<n; i++){
		    rs=0;
		    cs=0;
		    for(int j=0; j<n; j++){
		        rs+=a[i][j];
		        cs+=a[j][i];
		    }
		    if(rs==cs){
		        c++;
		    }
		}
		System.out.println(c);
	}
}
