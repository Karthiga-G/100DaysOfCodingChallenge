//Challenge

/*
Print String - Leaving Characters
The program must accept a string S as the input. The program must print the first character and then
the third character and then the sixth character and so on from the end as the output. 
Note: The interval between the printed characters increases by 1 each time.
Boundary Condition(s):
1 <= Length of S <= 100
Input Format:
The first line contains S.
Output Format:
The first line contains the characters based on the given conditions.
Example Input/Output 1:
Input:
abcdefghijklmno
Output:
omjfa
Explanation:
The string is abcdefghijklmno.
The first character from the end of the string is o, so o is printed.
The third character from the end of the string is m, the interval between o and m is 1, so m is printed.
The sixth character from the end of the string is j, the interval between m and j is 2, so j is printed.
The tenth character from the end of the string is f, the interval between j and f is 3, so f is printed.
The fifteenth character from the end of the string is a, the interval between f and a is 4, so a is
printed.
Hence the output is omjfa
Example Input/Output 2:
Input:
northeastwestsouth
Output:
huttt
*/

//Solution
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String str= sc.nextLine();
		String s= "";
		int c=1;
		for(int i=str.length()-1; i>=0; i--){
		    s+=str.charAt(i);
		}
		for(int i=0; i<str.length(); i+=c){
		    System.out.print(s.charAt(i));
		    c++;
		}
	}
}
