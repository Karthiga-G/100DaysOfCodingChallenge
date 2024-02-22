//Challenge - Remove alternate repeated characters

/*
Example Input/Output - 1:
Input-1:
queenbee
output-1:
quenbe

Example Input/Output - 2:
Input-2:
kettle
Output-2:
ketl
*/

// Solution

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String s= sc.nextLine();
		int[] arr= new int[123];
		for(int i=0; i<s.length(); i++){
		    arr[s.charAt(i)]++;
		    if(arr[s.charAt(i)]%2!=0){
		        System.out.print(s.charAt(i));
		    }
		}

	}
}
