//ASCII Diagonal Pattern

/*The program must accept a string S as the input. The program must print the ASCII values of all the
characters in the string S as shown in the Example Input/Output section.
Boundary Condition(s):
2 <= Length of S <= 100
Input Format:
The first line contains S.
Output Format:
The lines containing the desired pattern as shown in the Example Input/Output section.
Example Input/Output 1:
Input:
mark
Output:
********109
******97***
***114*****
107********
Example Input/Output 2:
Input:
SkillRack
Output:
*********************83
******************107**
***************105*****
************108********
*********108***********
*******82**************
*****97****************
***99******************
107********************
*/

//Solution

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String s= sc.nextLine();
		int len= s.length();
		int temp=0;
		int t=0;
		ArrayList<Integer> list= new ArrayList<Integer>();
		for(int i=0; i<len; i++){
		    char c= s.charAt(i);
		    list.add((int)c);
		    temp+= Integer.toString(list.get(i)).length();
		}
        for(int i=0; i<len; i++){
            String ele_list=Integer.toString(list.get(i));
            int z= (temp-(ele_list.length())-t);
            System.out.print(getrepeated('*', z));
            System.out.print(Integer.toString(list.get(i)));
            System.out.print(getrepeated('*', t));
            t+=ele_list.length();
            System.out.println();
        }
	}
	public static String getrepeated(char ch, int count){
	    StringBuilder s= new StringBuilder();
	    for(int i=0; i<count; i++){
	        s.append(ch);
	    }
	    return s.toString();
	}
}
