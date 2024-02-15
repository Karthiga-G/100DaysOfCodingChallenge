// Challenge

/*
Check Sorted Array
The program must accept N integer values and check if they are sorted or not.
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
12 25 456 875 1000
Output:
yes
Example Input/Output 2:
Input:
5
1000 654 321 21 5
Output:
yes
Example Input/Output 3:
Input:
4
26 55 12 105
Output:
no
  */

// Solution

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int a[]= new int[n];
		boolean asc=false;
		boolean des= false;
		for(int i=0; i<n; i++){
		    a[i]= sc.nextInt();
		}
        for(int i=1; i<n; i++){
            if(a[i-1]<a[i]){
                asc= true;
            }
            if(a[i-1]>a[i]){
                des= true;
            }
        }
        if(!asc || !des){
            System.out.print("yes");
        }
        else{
            System.out.println("no");
        }
	}
}
