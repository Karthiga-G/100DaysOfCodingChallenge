//Challenge - Exactly Three Digits

/*
The program must accept an integer N as the input. The program must print yes if exactly three digits
are used to form the integer N. Else the program must print no as the output.
Boundary Condition(s):
100 <= N <= 10^18
Input Format:
The first line contains N.
Output Format:
The first line contains either yes or no.
Example Input/Output 1:
Input:
1221255
Output:
yes
Explanation:
Here the integer 1221255 is formed using exactly three digits 1, 2 and 5.
Hence the output is yes
Example Input/Output 2:
Input:
1024
Output:
no
*/

//Solution

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int a[]=new int[10];
		int count=0;
		for(char c:s.toCharArray()){
		    if(Character.isDigit(c)){
		        a[c-'0']++;
		    }
		}
		for(int i=0; i<=9; i++){
		    if(a[i]>0){
		        count++;
		    }
		}
	    System.out.print(count==3? "yes": "no");
	}
}
