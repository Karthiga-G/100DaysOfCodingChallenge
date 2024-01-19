## Challenge

The program must accept an integer matrix of size NxN and an integer X as the input. The program must print the sum of the integers in the Xth row and the sum of the integers in the Xth column of the matrix as the output.
Boundary Condition(s):
2 <= N <= 50
1 <= X <= N

Example Input/Output 1:
Input:
3
1 2 3
4 5 6
7 8 9
2
Output:
15 15

Example Input/Output 2:
Input:
4
12 45 13 28
93 58 26 80
27 22 10 12
74 89 32 28
3
Output:
71 81

## Solution

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int a[][]= new int[n][n];
		int s1=0;
		int s2=0;
		for(int i=0; i<n; i++){
		    for(int j=0; j<n; j++){
		        a[i][j]=sc.nextInt();
		    }
		}
		int x= sc.nextInt();
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i==(x-1)){
                    s1+=a[i][j];
                }
            }
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(j==(x-1)){
                    s2+=a[i][j];
                }
            }
        }
        System.out.println(s1+" "+s2);
	}
}
