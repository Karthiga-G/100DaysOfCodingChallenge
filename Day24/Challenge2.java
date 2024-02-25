//Challenge- Upper Case Alphabets

/*
The program must accept two string values S1 and S2 containing only alphabets as the input. The
program must print yes if all the upper case alphabets (A to Z) present only once in two string values.
Else the program must print no as the output.
Boundary Condition(s):
1 <= Length of S1, S2 <= 100
Input Format:
The first line contains S1.
The second line contains S2.
Output Format:
The first line contains yes or no.
Example Input/Output 1:
Input:
ABCDEFGHIJKLMNOPQRSTUVWXYZ
Output:
yes
Explanation:
Here all the upper case alphabets (A to Z) occur only once in two string values.
So yes is printed.
Example Input/Output 2:
Input:
FEDCBA
GHIJKLMNOPQRSTUVWXYZ
Output:
yes
Example Input/Output 3:
Input:
CBADEFGHIjkl
MNOPQRST
Output:
no
*/

//Solution

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();

        boolean result = true;

        int[] count = new int[26];
        for (char c : s1.toCharArray()) {
            if (Character.isUpperCase(c)) {
                count[c - 'A']++;
            }
        }

        for (char c : s2.toCharArray()) {
            if (Character.isUpperCase(c)) {
                count[c - 'A']++;
            }
        }

        for (int k : count) {
            if (k!= 1) {
                result = false;
                break;
            }
        }

        if(result){
		System.out.print("yes");
	}
	else{
		System.out.print("no");
    }
}
