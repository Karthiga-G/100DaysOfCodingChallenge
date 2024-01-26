##Challenge
Matrix - Surrounding Integers of N.
  
The program must accept an integer matrix of size RxC and an integer N as the input. The program must print the surrounding integers of N (all possible 8 integers).
If the integer N is not present in the matrix then the program must print -1 as the output.
Note: All the integers in the matrix are unique.
Boundary Condition(s):
2 <= R, C <= 50
Input Format:
The first line contains R and C separated by a space.
The next R lines each contain C integers separated by a space.
The (R+2)nd
line contains N.
Output Format:
The first line contains the surrounding integers of N separated by a space or -1.
Example Input/Output 1:
Input:
4 5
21 68 13 60 42
75 38 80 93 88
95 94 16 58 17
91 28 84 56 18
16
Output:
38 80 93 94 58 28 84 56
Explanation: 
In the 4x5 matrix, the surrounding integers of 16 are highlighted below.
21 68 13 60 42
75 38 80 93 88
95 94 16 58 17
91 28 84 56 18
Hence the output is 38 80 93 94 58 28 84 56

Example Input/Output 2:
Input:
3 3
43 93 69
70 10 61
34 19 46
11
Output:
-1

## Solution

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int m= sc.nextInt();
		int row= 0;
		int col= 0;
		int flag=0;
		int a[][]= new int[n][m];
		for(int i=0; i<n; i++){
		    for(int j=0; j<m; j++){
		        a[i][j]= sc.nextInt();
		    }
		}
		int target= sc.nextInt();
		for(int i=0; i<n; i++){
		    for(int j=0; j<m; j++){
		        if(a[i][j]== target){
		            row=i;
		            col=j;
		            flag=1;
		        }
		    }
		}
		if(flag==1){
            for(int i=0; i<n; i++){
                for(int j=0; j<m; j++){
                    if((i==row-1 || i==row || i==row+1) && (j==col-1 || j==col || j==col+1) && a[i][j]!=target){
                        System.out.print(a[i][j]+" ");
                    }
                }
            }
		}
		else{
		    System.out.println("-1");
		}
	}
}
