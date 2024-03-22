//Challenge - Positions of Smallest and Largest

/*
The program must accept N distinct integers as the input. The program must print the positions of the
smallest and the largest integer among the N integers as the output.
Boundary Condition(s):
2 <= N <= 100
1 <= Each integer value <= 1000
Input Format:
The first line contains N.
The second line contains N integers separated by a space.
Output Format:
The first line contains the positions of the smallest and the largest integer among the N integers.
Example Input/Output 1:
Input:
10
40 18 5 89 9 74 69 59 27 93
Output:
3 10
Explanation:
The smallest integer among the 10 integers is 5. The integer 5 is present in the 3
rd position.
The largest integer among the 10 integers is 93. The integer 93 is present in the 10th position.
So 3 and 10 are printed.
Example Input/Output 2:
Input:
6
82 11 23 61 27 73
Output:
2 1
*/

//Solution

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int a[]= new int[n];
		for(int i=0; i<n; i++){
		    a[i]= sc.nextInt();
		}
		int max=0;
		int max_ind=0;
		for(int i=0; i<n; i++){
		    if(a[i]>max){
		        max= a[i];
		        max_ind=i;
		    }
		}
		int min = max;
		int min_ind=0;
		for(int i=0; i<n; i++){
		    if(a[i]<min){
		        min= a[i];
		        min_ind= i;
		    }
		 }
		 System.out.print((min_ind+1)+" "+(max_ind+1));
	}
}
