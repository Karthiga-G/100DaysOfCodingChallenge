/* The program must accept a matrix of size R*C and sort the integers in the matrix. Then the program
must print the integer values in the sorted matrix.
Boundary Condition(s):
2 <= R, C <= 100
Input Format:
The first line contains R and C separated by a space.
The next R lines, each containing C integer values separated by a space.
Output Format:
The first R lines, each containing C integer values separated by a space.
Example Input/Output 1:
Input:
3 3
66 6 69
34 45 54
36 7 77
Output:
6 7 34 
36 45 54 
66 69 77
Example Input/Output 2:
Input:
4 5
39 22 20 98 68
28 52 30 57 58
57 97 46 23 76
53 70 44 51 95
Output:
20 22 23 28 30
39 44 46 51 52
53 57 57 58 68
70 76 95 97 98
*/

//Solution

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int r= sc.nextInt();
		int c= sc.nextInt();
		int m[][]= new int[r][c];
		for(int i=0; i<r; i++){
		    for(int j=0; j<c; j++){
		        m[i][j]= sc.nextInt();
		    }
		}
		int a[]= new int[r*c];
		int k=0;
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                a[k++]= m[i][j];
            }
        }
        Arrays.sort(a);
        k=0;
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                System.out.print(a[k++]+" ");
            }
            System.out.println();
        }
	}
}
