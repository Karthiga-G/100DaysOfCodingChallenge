//Challenge - Check Sorted Array (Descending Order)

/*
The program must accept N integer values and check if they are sorted in descending order or not.
Boundary Condition(s):
2 <= N <= 100
1 <= Each integer value <= 1000
Input Format:
The first line contains N.
The second line contains N integer values separated by a space.
Output Format:
The first line contains yes or no.
Example Input/Output 1:
Input:
5
834 700 53 45 12
Output:
yes
Explanation:
Here N = 5.
The given 5 integers 834 700 53 45 12 are sorted in descending order.
So yes is printed as the output.
Example Input/Output 2:
Input:
4
403 482 642 109
Output:
no
Example Input/Output 3:
Input:
6
35 47 56 70 75 84
Output:
no
*/

//Solution

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int a[] = new int[n];
		for(int i=0; i<n; i++){
		    a[i]= sc.nextInt();
		}
		boolean bool= true;
		for(int i=1; i<n; i++){
		    if(a[i-1]<a[i]){
		        bool= false;
		    }
		}
		if(!bool){
		    System.out.println("no");
		}
		else{
		    System.out.println("yes");
		}
	}
}
