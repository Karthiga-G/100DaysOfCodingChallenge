//Challenge - Non Repeated Characters

/**
The program must accept a string S as the input. The program must print all the non-repeated characters in the string S in the order of their occurrence as the output.
Note: At least one non-repeated character is always present in the string S.
Boundary Condition(s): 1 <= Length of S <= 1000

Input Format:
The first line contains S.
Output Format:
The first line contains the non-repeated characters in the string S separated by a space.

Example Input/Output 1:
Input:
Japan
Output: J p n
Explanation:
Here the string is Japan.
The characters J, p and n are not repeated in the string Japan.
Hence the output is J p n

Example Input/Output 2:
Input:
fireFighter
Output:
fFght
*/

//Solution

import java.util.*;
public class Hello {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s= sc.nextLine();
        int ch[]= new int[128];
        for(char c:s.toCharArray()){
            ch[(int)c]++;
        }
        for(char c: s.toCharArray()){
            if(ch[(int)c]==1){
                System.out.print(c+" ");
            }
            ch[(int)c]=-1;
        }
	}
}
