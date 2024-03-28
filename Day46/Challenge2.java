//Challenge - Position of Second One

/*
The program must accept two integers M and N as the input. The program must print the position of the second 1 in the binary representation of the sum of M and N as the output. If there is no second 1 then the program must print 0 as the output.
Boundary Condition(s): <= M ,N<=10^ ^ 8
Input Format:
The first line contains M and N separated by a space.
Output Format:
The first line contains an integer value as per the given condition.

Example Input/Output 1:
Input:
13 5
Output:
4
Explanation:
Here M = 13 and N = 5 The binary representation of 18(13 + 5) is 10010. The position of the second 1 in 10010 is 4, so 4 is printed as the output.

Example Input/Output 2:
Input:
20 12
Output:
0
*/

//Solution

import java.util.*;
public class Hello {
    public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int m= sc.nextInt();
		int n= sc.nextInt();
		int sum= m+n;
		int pos=0;
		int c=0;
		String bin= Integer.toBinaryString(sum);
		for(int i=0; i<bin.length(); i++){
		    if(bin.charAt(i)=='1'){
		        c++;
		    }
		    if(c>1){
		        pos=i+1;
		        break;
		    }
		}
		System.out.print(pos);
	}
}
