//Challenge 1 - HCF-Ranges 

/*
The program must accept N integers and T ranges as the input. For each range(X, Y), the program must print the HCF of the integers from the Xth integer to the Yth integer 
among the N integers as the output. 
Boundary Condition(s): 2 <= N <= 100 
1 <= T <= 100 
1 <= X < Y <= N 
1 <= Each integer value <= 1000 
Input Format: The first line contains N and T separated by a space. The second line contains N integers separated by a space. The next T lines, each contains two integers 
representing a range. 
Output Format: The first T lines, each contains an integer representing the HCF of the integers specified in the given range. 
Example Input/Output 1: 
Input: 5 3 
2 30 10 12 20 
1 5 
2 3 
3 5 
Output: 2 10 2 
Explanation: In the first range (1, 5), the HCF of the integers 2 30 10 12 20 is 2. So 2 is printed. In the second range (2, 3), the HCF of the integers 30 10 is 10. So 10 
is printed. In the third range (3, 5), the HCF of the integers 10 12 20 is 2. So 2 is printed. 
Example Input/Output 2: 
Input: 
6 4 
6 27 30 9 15 10 
2 4 3 6 5 6 1 2 
Output: 3 1 5 3
*/

//Solution

import java.util.*;
public class Hello {

    public static int gcd(int a, int b){
        while(b!=0){
            int temp=b;
            b= a%b;
            a= temp;
        }
        return a;
    }
    
    public static int rangegcd(int[] arr, int start, int end){
        int res= arr[start];
        for(int i=start+1; i<=end; i++){
            res= gcd(res, arr[i]);
            if(res==1){
                return 1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int t= sc.nextInt();
		int x, y;
		int a[]= new int[n];
		for(int i=0; i<n; i++){
		    a[i]= sc.nextInt();
		}
		for(int i=0; i<t; i++){
		    x= sc.nextInt()-1;
		    y= sc.nextInt()-1;
		    int result= rangegcd(a, x, y);
		    System.out.println(result);
		}
	}
}
