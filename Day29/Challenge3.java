//Challenge - String from Digits

/*
The program must accept an integer N and ten alphabets as the input. The program must form a string S based on the following 
condition.
- For each digit D in N, the program must replace the digit D by the alphabet at the index D in the given ten alphabets.
Boundary Condition(s):
1 <= N <= 10^8
Input Format:
The first line contains N.
The second line contains ten alphabets separated by a space.
Output Format:
The first line contains the string S as per the given condition.
Example Input/Output 1:
Input:
1870
a b c d e f g h i j
Output:
biha
Explanation:
The 1st digit in 1870 is 1, which is replaced by the alphabet at the index 1 (b).
The 2nd digit in 1870 is 8, which is replaced by the alphabet at the index 8 (i).
The 3rd digit in 1870 is 7, which is replaced by the alphabet at the index 7 (h).
The 4th digit in 1870 is 0, which is replaced by the alphabet at the index 0 (a).
Hence the output is biha
Example Input/Output 2:
Input:
15733
r f g i o m m p q r
Output:
fmpii
*/

//Solution
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		sc.nextLine();
		String[] s= sc.nextLine().split(" ");
		System.out.print(replace(n, s));
	}
	
	public static String replace(int n, String s[]){
	    String digits = String.valueOf(n);
	    String res="";
	    for(int i=0; i<digits.length(); i++){
	        int index= Character.getNumericValue(digits.charAt(i));
	        res+=s[index];
	    }
	    return res;
	}
}
