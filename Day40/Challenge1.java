// Challenge - Mommiez Errands
/*
Chef likes playing with matrices. He has a matrix of size , which is initialized to (i.e. for each ).
Chef’s mommy has a list of size that contains special indices. For each special index (assume 0-based indexing), she wants Chef to perform the following operations:
Increment the value of all the cells on row .
Increment the value of all the cells on column .
After performing operations, Mommy wants to know the total number of cells that store an odd value.
Since Chef has to go out to play with his friends, he asks for your help. Can you complete this task for Chef?
Input Format
The first line contains two integers and denoting the number of rows and columns of the matrix .
The next line contains an integer , denoting the number of special indices.
The next lines contain 2 space-separated integers and denoting the row index and the column index.
Output Format
Output in a single line the number of cells in the matrix that contains an odd value after applying operations.
Constraints
Sample 1:
Input
2 3
2
0 1
1 1
Output
6
Explanation:
Initial matrix = [[0,0,0],[0,0,0]].
After applying the first increment it becomes [[1,2,1],[0,1,0]].
The final matrix is [[1,3,1],[1,3,1]], which contains 6 odd numbers.
*/

// Solution

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int m= sc.nextInt();
		int s= sc.nextInt();
		int count=0;
		int matrix[][]= new int[n][m];
		for(int i=0; i<s; i++){
		    int row=sc.nextInt();
		    int col= sc.nextInt();
		    
		    for(int j=0; j<m; j++){
		        matrix[row][j]++;
		    }
		    
		    for(int j=0; j<n; j++){
		        matrix[j][col]++;
		    }
		}
		for(int i=0; i<n; i++){
		    for(int j=0; j<m; j++){
		        if(matrix[i][j]%2!=0){
		            count++;
		        }
		    }
		}
		System.out.println(count);
	}
}
