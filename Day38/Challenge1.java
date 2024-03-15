//Challenge - First K Integers (Sorting)

/*
The program must accept an integer array of size N and an integer K as the input. The program must
print the output based on the following conditions.
- After sorting the first K integers in the array, if all the integers in the array in sorted order then the
program must print YES.
- Else the program must print NO as the output.
Boundary Condition(s):
2 <= N <= 100
1 <= Each integer value <= 10^5
2 <= K <= N
Input Format:
The first line contains N.
The second line contains N integers separated by a space.
The third line contains K.
Output Format:
The first line contains YES or NO.
Example Input/Output 1:
Input:
9
39 23 19 27 41 55 69 88 97
4
Output:
YES
Explanation:
The 9 integers are 39 23 19 27 41 55 69 88 97.
After sorting the first 4 integers in ascending order, the integers become 19 23 27 39 41 55 69 88 97.
Now, all the 9 integers are in ascending order. So YES is printed.
Example Input/Output 2:
Input:
5
25 39 41 85 27
3
Output:
NO
*/

//Solution

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n= sc.nextInt();
		int a[]= new int[n];
		for(int i=0; i<n; i++){
		    a[i]= sc.nextInt();
		}
		int k=sc.nextInt();
		int b[]= new int[n];
		for(int i=0; i<n; i++){
		    b[i]= a[i];
		}
		for(int i=0; i<k; i++){
		    for(int j=i+1; j<k; j++){
		        if(a[i]>a[j]){
    		        int temp= a[i];
    		        a[i]= a[j];
    		        a[j]= temp;
		        }
		    }
		}
		for(int i=0; i<n; i++){
		    for(int j=i+1; j<n; j++){
		        if(b[i]>b[j]){
		            int temp= b[i];
		            b[i]= b[j];
		            b[j]= temp;
		        }
		    }
		}
		boolean bool = true;
		for(int i=0; i<n; i++){
		    if(a[i]!=b[i]){
		        bool=false;
		    }
		}
    	if(!bool){
    	   System.out.println("NO");
    	}
    	else{
    	    System.out.println("YES");
    	}
	}
}
