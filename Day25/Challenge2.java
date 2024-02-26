//Challenge- Sum - Prime Integers ending with 7

/*
The program must accept an integer N as the input. The program must print the sum of prime
integers from 1 to N ending with 7 as the output.
Boundary Condition(s):
10 <= N <= 10^8
Input Format:
The first line contains N.
Output Format:
The first line contains the sum of prime integers from 1 to N ending with 7.
Example Input/Output 1:
Input:
42
Output:
61
Explanation:
The prime integers from 1 to 42 which ends with 7 are 7, 17 and 37.
The sum of 7, 17 and 37 is 61.
Hence the output is 61
Example Input/Output 2:
Input:
156
Output:
643
*/

//Solution

import java.util.*;

public class Hello {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(primeSumWith7(n));
    }


    public static boolean prime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean contains7(int num) {
            if (num % 10 == 7) {
                return true;
            }
            return false;
    }
    public static int primeSumWith7(int n) {
        int sum = 0;
        for (int k = 2; k <= n; k++) {
            if (isPrime(k) && contains7(k)) {
                sum += k;
            }
        }
        return sum;
    }

}
