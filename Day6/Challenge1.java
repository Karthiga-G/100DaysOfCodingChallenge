## Challenge
Alternate Vowels - String
The program must accept a string S containing only alphabets as the input. The program must print the vowels in the string S alternatively from both ends.
Note: The string S always contains atleast one vowel.
Boundary Condition(s):
2 <= Length of S <= 100
Example Input/Output 1:
Input:
Environment
Output:
Eeio
Explanation:
The vowels in the string Environment are E, i, o and e.
So they are printed alternatively from both ends.
Example Input/Output 2:
Input:
MANAGERIAL
Output:
AAAIE
Example Input/Output 3:
Input:
skillrack
Output:
ia

## Solution

import java.util.*;
public class Hello {
    public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String s= sc.nextLine();
		int len= s.length();
        String newstring= ""; 
		for(int i=0; i<len; i++){
		        if(check(s.charAt(i))){
		         newstring+=s.charAt(i);
		    }
        }
        int nslen= newstring.length();
		int half= nslen/2;
        int i=0;
		int j=nslen-1;
		while(i<=j){
		    if(check(newstring.charAt(i))){
		        System.out.print(newstring.charAt(i));
		    }
		    if((i!=j) && (check(newstring.charAt(j)))){
		        System.out.print(newstring.charAt(j));
		    }
		    i++;
		    j--;
		}
        
    }
    public static boolean check(char c){
        return "aeiouAEIOU".indexOf(Character.toUpperCase(c))!=-1;
    }
}
