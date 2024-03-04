//Challenge - Form Smallest Possible Integer

/*
The program must accept a string S containing only digits as the input. The program must form the smallest possible integer X using the digits in S. Finally, the program must print
the value of X as the output.
Boundary Condition(s):
1 <= Length of S <= 1000
Input Format:
The first line contains S.
Output Format:
The first line contains X.
Example Input/Output 1:
Input:
5413045415601160561561060606606067888799932266544445524554841887021
Output:
1000000000111111122223344444444445555555555666666666666777888888999
Explanation:
The smallest possible integer formed using the digits
in 5413045415601160561561060606606067888799932266544445524554841887021 is 1000000000111111122223344444444445555555555666666666666777888888999.
Hence the output is 1000000000111111122223344444444445555555555666666666666777888888999
Example Input/Output 2:
Input:
19830000189165435362390019123121
Output:
10000001111112223333345566889999
*/

//Solution
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s = sc.nextLine();
		String res= smallint(s);
		System.out.print(res);
	}
	public static String smallint(String s){
	    int frq[]= new int[10];
	    for(char c:s.toCharArray()){
	        int digit= c-'0';
	        frq[digit]++;
	    }
	    StringBuilder sb= new StringBuilder();
	    for(int i=1; i<10; i++){
	        while(frq[i]-- > 0){
	            sb.append(i);
	        }
	    }
	        while(frq[0]-- >0){
	            sb.insert(1, '0');
	        }
	    return sb.toString();
	}
}
