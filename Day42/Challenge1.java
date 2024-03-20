//Challenge - Sum of Two Integers Equal to K

/*
The program must accept N integers and an integer K as the input. The program must print yes if the
sum of any two integers among the N integers is equal to K. Else the program must print no as the
output.
Boundary Condition(s):
2 <= N <= 100
1 <= K, Each integer value <= 10^8
Input Format:
The first line contains N and K separated by a space.
The second line contains N integers separated by a space.
Output Format:
The first line contains yes or no.
Example Input/Output 1:
Input:
5 10
2 5 8 4 7
Output:
yes
Explanation:
The sum of 2 and 8 is 10. So yes is printed.
Example Input/Output 2:
Input:
4 25
12 24 15 11
Output:
no
*/

//Solution

import java.util.*;
public class Hello {

    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n= sc.nextInt();
            int k= sc.nextInt();
            int a[]= new int[n];
            boolean bool= false;
            for(int i=0; i<n; i++){
                a[i]= sc.nextInt();
            }
            for(int i=0; i<n; i++){
                for(int j=i+1; j<n; j++){
                    if(a[i]+a[j]==k){
                        bool= true;
                        break;
                    }
                }
            }
            if(bool){
                System.out.print("yes");
            }
            else{
                System.out.print("no");
            }
    }
}
