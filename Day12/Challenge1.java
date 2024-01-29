## Challenge

Missing Lower Case Alphabets
The program must accept two string values S1 and S2 containing only lower case alphabets as the input. The program must print the missing lower case alphabets among the 
alphabets in S1 and S2 in alphabetical order. If all the lower case alphabets are present in S1 and S2, the program must print -1 as the output.
Boundary Condition(s):
1 <= Length of S1, S2 <= 100
Input Format:
The first line contains S1.
The second line contains S2.
Output Format:
The first line contains the missing alphabets or -1.
Example Input/Output 1:
Input:
hello
skillrack
Output:
bdfgjmnpqtuvwxyz
Explanation:
The missing lower case alphabets in "hello" and "skillrack"
are b, d, f, g, j, m, n, p, q, t, u, v, w, x, y and z.
Hence the output is bdfgjmnpqtuvwxyz
Example Input/Output 2:
Input:
abcdefghijklmn
opqrstuvwxyz
Output:
-1


## Solution

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String s1= sc.nextLine();
		String s2= sc.nextLine();
		String str1= s1.toLowerCase();
		String str2= s2.toLowerCase();
		int f=0;
		for(char c='a'; c<='z'; c++){
		    if(!str1.contains(String.valueOf(c)) && (!str2.contains(String.valueOf(c)))){
		        System.out.print(c);
		        f=1;
		    }
		}
		if(f==0){
		    System.out.print("-1");
		}
	}
}
