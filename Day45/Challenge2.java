//Challenge

/**
You are given a string consisting of parentheses, denoted by '(' and ')'. Your task is to find and print a simplified version of the given string where only the primary parentheses are included. A primary parenthesis is one that is not part of the outer layer of parentheses.
Write a Java program to implement this task.

Example:
input:
"((())"
output:
"()"
Explanation: In the given string "((())", the outer layer of parentheses is "(())", and the primary parentheses are the ones inside this layer, which are "()". Therefore, the output consists only of the primary parentheses "()".
*/

//Solution

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s= sc.nextLine();
        Stack <Character> stack = new Stack<>();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='('){
                stack.push(s.charAt(i));
            }
            else{
                if(stack.size()==1){
                    stack.clear();
                }
                else if(stack.size()>1 && s.charAt(i-1)=='('){
                    stack.pop();
                    System.out.print("()");
                }
            }
        }
        // System.out.println("The items in the stack are "+stack);
        sc.close();
    }
}
