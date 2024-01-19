## Challenge

Implement the function getOddEvenString(int N) which accepts an integer N as the input.
The function must form a string S by replacing each odd digit of N by 'o' and each even digit of N by
'e'. Then the function must return the string S.
Example Input/Output 1:
Input:
147
Output:
oeo
Explanation:
The first digit of 147 is odd. So 'o' is present as the first character of S.
The second digit of 147 is even. So 'e' is present as the second character of S.
The third digit of 147 is odd. So 'o' is present as the third character of S.
So the string S is "oeo".
Example Input/Output 2:
Input:
205070
Output:
eeoeoe

##Solution

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

char* getOddEvenString(int N) {
    // Convert the integer to a string for easier digit manipulation
    char s[100];
    sprintf(s, "%d", N);

    // Calculate the length of the string
    int len = strlen(s);

    // Allocate memory for the result string
    char* result = (char*)malloc((len + 1) * sizeof(char));

    // Iterate through each digit and replace with 'o' or 'e'
    for (int i = 0; i < len; i++) {
        int digit = s[i] - '0';
        result[i] = (digit % 2 == 0) ? 'e' : 'o';
    }

    // Null-terminate the result string
    result[len] = '\0';

    return result;
}

// Sample main function
int main() {
    int input = 147;
    char* output = getOddEvenString(input);
    printf("Output: %s\n", output);
    return 0;
}
