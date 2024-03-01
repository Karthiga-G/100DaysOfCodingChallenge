//Challenge - Two integers - Factorial

/*
The program must accept two integers A and B as the input. The program must print the value
of A!/B! as the output.
Note: The difference between A and B is always less than or equal to 5.
Boundary Condition(s):
1 <= B <= A <= 10^4
Input Format:
The first line contains A and B separated by a space.
Output Format:
The first line contains the value of A!/B!.
Example Input/Output 1:
Input:
4 2
Output:
12
Explanation:
Here A=4 and B=2,
The value of 4! is 24 (4*3*2*1 = 24).
The value of 2! is 2 (2*1 = 2).
The value of 4!/2! is 12 (24/2 = 12), so 12 is printed as the output.
Example Input/Output 2:
Input:
12 9
Output:
1320
*/

//Solution
import java.util.*;
import java.math.BigInteger;

public class Hello {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
        BigInteger res = calculate(a).divide(calculate(b));
        System.out.println(res);
	}
	public static BigInteger calculate(int n){
	    BigInteger fact = BigInteger.ONE;
	    for(int i=2; i<=n; i++){
	        fact = fact.multiply(BigInteger.valueOf(i));
	    }
	    return fact;
	}
}
