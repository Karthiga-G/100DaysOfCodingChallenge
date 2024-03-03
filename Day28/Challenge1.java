//Challenge - Three Distinct Digits

/*
The program accepts N integers and prints the integers which are having at least three distinct digits.
If there is no such integer, the program must print -1 as the output.
Boundary Condition(s):
1 <= N <= 100
100 <= Each integer value <= 10^8
Input Format:
The first line contains N.
The second line contains N integers separated by a space.
Output Format:
The first line contains the integers which are having at least three distinct digits separated by a space
or -1.
Example Input/Output 1:
Input:
5
488 978 1432 151 5070
Output:
978 1432 5070
Explanation:
The integer 488 contains 2 distinct digits.
The integer 978 contains 3 distinct digits.
The integer 1432 contains 4 distinct digits.
The integer 151 contains 2 distinct digits.
The integer 5070 contains 3 distinct digits.
Hence the output is 978 1432 5070
Example Input/Output 2:
Input:
4
100 474 255 666
Output:
-1
*/

//Solution
import java.util.*;
public class Hello {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int a[]= new int[n];
		for(int i=0; i<n; i++){
		    a[i]= sc.nextInt();
		}
		ArrayList<Integer> numbers= new ArrayList<>();
		for(int i=0; i<n; i++){
		    if(has3digits(a[i])){
		        numbers.add(a[i]);
		    }
		}
		if(numbers.isEmpty()){
		    System.out.print("-1");
		}
		else{
		    for(int num:numbers){
		        System.out.print(num+" ");
		    }
		}
	}
	public static boolean has3digits(int num){
	    Set<Character> digits= new HashSet<>();
	    while(num>0){
	        digits.add((char)(num%10+'0'));
	        num/=10;
	    }
	    return digits.size()>=3;
	}
}
