## Challenge

The program must accept an integer N as the input. The program must print the next immediate integer that has all the digits in N as the output. If there is no such next
immediate integer then the program must print -1 as the output.
Boundary Condition(s):
1 <= N <= 10^6
Input Format:
The first line contains N.
Output Format:
The first line contains the next immediate integer that has all the digits in N or -1.
Example Input/Output 1:
Input:
2586
Output:
2658
Explanation:
The next immediate integer that has all the digits in 2586 is 2658.
Hence the output is 2658
Example Input/Output 2:
Input:
3111
Output:
-1
Example Input/Output 3:
Input:
101
Output:
110

## Solution

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int result= findnext(n);
		System.out.println(result);

	}
	private static int findnext(int n){
	    char digits[]= Integer.toString(n).toCharArray();
	    int len= digits.length;
	    int i;
	    for(i=len-2; i>=0; i--){
	        if(digits[i]<digits[i+1]){
	            break;
	        }
	    }
	    if(i==-1){
	        return -1;
	    }
	    int j;
	    for(j=len-1; j>i; j--){
	        if(digits[j]>digits[i]){
	            break;
	        }
	    }
	    char temp= digits[i];
	    digits[i]= digits[j];
	    digits[j]= temp;
	    reverse(digits, i+1, len-1);
	    int result= Integer.parseInt(new String(digits));
	    
	    return result;
	}
	private static void reverse(char arr[], int start, int end){
	    while(start<end){
	        char temp=arr[start];
	        a[start]= arr[end];
	        arr[end]= temp;
	        start++;
	        end--;
	    }
	}
}
