## Challenge
The program must accept an integer N as the input. The program must print the desired pattern as shown in the Example Input/Output section.
Boundary Condition(s):
1 <= N <= 50
Example Input/Output 1:
Input:
3
Output:
1 2 3 + 3 2 1
1 2 3 + 3 2 1
1 2 3 + 3 2 1
+ + + + + + +
1 2 3 + 3 2 1
1 2 3 + 3 2 1
1 2 3 + 3 2 1
Example Input/Output 2:
Input:
4
Output:
1 2 3 4 + 4 3 2 1
1 2 3 4 + 4 3 2 1
1 2 3 4 + 4 3 2 1
1 2 3 4 + 4 3 2 1
+ + + + + + + + +
1 2 3 4 + 4 3 2 1
1 2 3 4 + 4 3 2 1
1 2 3 4 + 4 3 2 1
1 2 3 4 + 4 3 2 1

## Solution

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int m= (n*2)+1;
		int cen= n+1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                    System.out.print(j+" ");
            }
            System.out.print("+ ");
            for(int j=n; j>=1; j--){
                    System.out.print(j+" ");
            }
            System.out.println();
        }
        for(int i=0; i<m; i++){
            System.out.print("+ ");
        }
        System.out.println();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                    System.out.print(j+" ");
            }
            System.out.print("+ ");
            for(int j=n; j>=1; j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }
	}
}
