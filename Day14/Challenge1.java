## Challenge

Maximum Absolute Difference
The program must accept N distinct integers as the input. The program must print the maximum
possible absolute difference between two consecutive integers in the given N integers as the output.
Boundary Condition(s):
2 <= N <= 1000
1 <= Each integer value <= 10^8
Input Format:
The first line contains N.
The second line contains N distinct integers separated by a space.
Output Format:
The first line contains the maximum absolute difference between the consecutive two integers.
Example Input/Output 1:
Input:
5
1 4 7 2 6
Output:
5
Explanation:
The given 5 integers are 1, 4, 7, 2, and 6.
The absolute difference between 1 and 4 is 3.
The absolute difference between 4 and 7 is 3.
The absolute difference between 7 and 2 is 5.
The absolute difference between 2 and 6 is 4.
Here the maximum absolute difference is 5.
Hence the output is 5
Example Input/Output 2:
Input:
4
10 2 3 11
Output:
8

## Solution

import java.util.*;
import java.lang.Math;
public class Hello {

    public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int a[]= new int[n];
		int b[]= new int[n-1];
		int max=0;
		for(int i=0; i<n; i++){
		    a[i]= sc.nextInt();
		}
		for(int i=1; i<n; i++){
		    b[i-1]=Math.abs(a[i]-a[i-1]);
		}
		for(int i=0; i<n-1; i++){
		    if(b[i]>max){
		        max=b[i];
		    }
		}
        System.out.println(max);
	}
}
