//Challenge - Sort the Vowels

/*
The program must accept a string S as the input. The program must arrange the vowels in the string S
in sorted order. Finally, the program must print the modified string S as the output.
Boundary Condition(s):
3 <= Length of S <= 100
Input Format:
The first line contains S.
Output Format:
The first line contains the modified string S.
Example Input/Output 1:
Input:
skillrack
Output:
skallrick
Explanation:
After arranging the vowels in the string skillrack in sorted order, the string becomes skallrick.
Hence the output is skallrick
Example Input/Output 2:
Input:
PROGRAMMING
Output:
PRAGRIMMONG
*/

//Solution

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		ArrayList<Character> list = new ArrayList<>();
		for(int i=0; i<s.length(); i++){
		    char c=s.charAt(i);
		    if(c=='a' || c=='e' || c=='i' || c=='o' ||c=='u' || c=='A' || c=='E' ||c=='O'||c=='I' || c=='U'){
		        list.add(c);
		    }
		}
		Collections.sort(list);
		int vi=0;
		for(int i=0; i<s.length(); i++){
		    if(list.contains(s.charAt(i))){
		        System.out.print(list.get(vi++));
		    }
		    else{
		        System.out.print(s.charAt(i));
		    }
		}
	}
}
