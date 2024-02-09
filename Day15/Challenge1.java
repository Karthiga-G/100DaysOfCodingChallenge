## Challenge
Please fill in the lines of code to implement the logic present in the flowchart. [img] */

## Solution

import java.util.Scanner;

public class Hello {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int i = 0;
        while (i < s.length()) {
            char currentChar = s.charAt(i);
            int count = 1;
            while (i + 1 < s.length() && s.charAt(i + 1) == currentChar) {
                count++;
                i++;
            }
            System.out.print(currentChar);
            System.out.print(count);
            i++;
        }
    }
}
