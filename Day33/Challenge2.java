//Challenge - Second String From First String

/*
The program must accept two string values S1 and S2 are of equal length as the input. The program
must print yes if the second string is formed using all the alphabets in the first string by ignoring the
case of alphabets. Else the program must print no as the output.
Boundary Condition(s):
1 <= Length of S1, S2 <= 1000
Input Format:
The first line contains S1.
The second line contains S2.
Output Format:
The first line contains yes or no.
Example Input/Output 1:
Input:
Flow
Wolf
Output:
yes
Explanation:
Here the string Wolf is formed using all the alphabets in the string Flow by ignoring the case
of alphabets.
So yes is printed as the output.
Example Input/Output 2:
Input:
clOud
robOt
Output:
no
*/

//Solution

import java.util.*;
public class Hello {

  public static void main(String[] args) {
      	Scanner sc= new Scanner(System.in);
      	String s1= sc.nextLine().toLowerCase();
      	String s2 = sc.nextLine().toLowerCase();
        int sum1=0;
        int sum2=0;
        for(int i=0; i<s1.length(); i++){
            sum1+=(int)s1.charAt(i);
        }
        for(int i=0; i<s2.length(); i++){
            sum2+=(int)s2.charAt(i);
        }
        if(sum1==sum2){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
}
