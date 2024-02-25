//Challenge- Integer Plus Pattern

/*
The program must accept an integer N as the input. The program must print the desired pattern as
shown in the Example Input/Output section.
Note: N is always an odd integer.
Boundary Condition(s):
3 <= N <= 25
Input Format:
The first line contains N.
Output Format:
The lines containing the desired pattern as shown in the Example Input/Output section.
Example Input/Output 1:
Input:
5
Output:
5 4 3 2 1 2 3 4 5
4 4 3 2 1 2 3 4 4
3 3 3 2 1 2 3 3 3
2 2 2 2 1 2 2 2 2
1 1 1 1 1 1 1 1 1
2 2 2 2 1 2 2 2 2 
3 3 3 2 1 2 3 3 3
4 4 3 2 1 2 3 4 4
5 4 3 2 1 2 3 4 5
Example Input/Output 2:
Input:
3
Output:
3 2 1 2 3
2 2 1 2 2
1 1 1 1 1
2 2 1 2 2
3 2 1 2 3
*/

//Solution

import java.util.*;
public class Hello {
    public static void main(String[] args) {
	int N= new Scanner(System.in).nextInt();
        int M= N*2-1;
        int x=N;
        for(int i=0; i<M; i++){
            int y=N;
            for(int j=0; j<M; j++){
                System.out.print(Math.min(x, y)+" ");
                y += j<N-1?-1:1;
            }
            System.out.println();
            x += i<N-1?-1:1;
        }
   }
}
