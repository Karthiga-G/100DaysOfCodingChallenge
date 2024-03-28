//Challenge - Number of Ways Sum Two Primes

/*
The program must accept an integer N as the input. The program must print the number of ways to represent N as the sum of two prime integers.
Boundary Condition(s): 2 <= N <= 10 ^ 4
Input Format: The first line contains N.
Output Format: The first line contains the number of ways to represent N as the sum of two prime integers.

Example Input/Output 1:
Input:
18
Output:
2
Explanation:
The 2 possible ways are given below.
5 + 13 = 18
7 + 11 = 18

Example Input/Output 2:
Input:
100
Output:
6
*/
  
//Solution

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
	    boolean isprime=true;
	    int c=0;
	    ArrayList<Integer> list= new ArrayList<>();
    	for(int i=2; i<n; i++){
    	    for(int j=2; j<i; j++){
        	  if(n%i==0){
        	     isprime=false;
        	     break;
        	   }
    	    }
    	    if(isprime){
    	        list.add(i);
    	    }
    	}
    	for(int i=0; i<list.size(); i++){
    	    for(int j=i+1; j<list.size(); j++){
    	        if(list.get(i)+list.get(j)==n){
    	            c++;
    	        }
    	    }
    	}
    	System.out.println(c);
	}
}
