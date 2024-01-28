## Challenge
The program must accept two string values S1 and S2 containing only alphabets and an alphabet CH as the input.
The program must print the string which has the maximum occurrences of the CH. If both S1 and S2 have the same number of 
occurrences of the CH then the program must print the first string S1 as the output.
Note: At least one of the string values will always contain the alphabet CH.
Boundary Condition(s):
3 <= Length of S1, S2 <= 100
Input Format:
The first line contains S1.
The second line contains S2.
The third line contains CH.
Output Format:
The first line contains S1 or S2.
Example Input/Output 1:
Input:
world
hello
l
Output:
hello
Example Input/Output 2:
Input:
happy
day
a
Output:
happy

## Solution

#include<stdio.h>
#include<stdlib.h>
#include<string.h>

int main()
{
    char s1[100];
    char s2[100];
    char ch;
    scanf("%s %s %c", s1, s2, &ch);
    int c1=0;
    int c2=0;
    int len1= strlen(s1);
    int len2= strlen(s2);
    
    for(int i=0; i<len1; i++){
        if(s1[i]==ch){
            c1++;
        }
    }
    
    for(int i=0; i<len2; i++){
        if(s2[i]==ch){
            c2++;
        }
    }
    if(c1==c2){
        printf("%s", s1);
    }
    else{
        printf("%s", c1>c2? s1 : s2);
    }
}
