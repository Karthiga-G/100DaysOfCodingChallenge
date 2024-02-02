## Function - concatenateDigitsWithTrailingZeros

You must implement the function concatenateDigitsWithTrailingZeros(int arr[], int N) which accepts an integer array arr and its size N as the input. The function must form a 
new integer K by concatenating all the non zero integers in the order of their occurrence in the array arr. Then the function must concatenate all the zeros at the end of the 
new integer K. Finally, the function must return the new integer K.
Boundary Condition(s):
1 <= N <= 18
0 <= Each integer value <= 9
Example Input/Output 1:
Input:
4
6 7 0 2
Output:
Integer: 6720
Explanation:
After concatenating the non zero integers 6, 7 and 2, 672 is formed.
After concatenating the only zero at the end of 672, 6720 is formed.
Example Input/Output 2:
Input:
6
5 2 0 3 0 0
Output:
Integer: 523000

## Solution
  
#include <stdio.h> 
#define ULL unsigned long long int

ULL concatenateDigitsWithTrailingZeros(int arr[], int N)
{
    //your code here
    ULL newInteger = 0;
    int zerosCount = 0;

    for (int i = 0; i < N; i++) {
        if (arr[i] != 0) {
            newInteger = newInteger * 10 + arr[i];
        } else {
            zerosCount++;
        }
    }

    // Add trailing zeros
    while (zerosCount > 0) {
        newInteger *= 10;
        zerosCount--;
    }
  return newint;
}

int main() { 
int N; 
scanf("%d",&N); 
int arr[N];
for(int index = 0; index < N; index++) 
{ scanf("%d",&arr[index]); 
} 
printf("Integer: %llu", concatenateDigitsWithTrailingZeros(arr, N)); 
}

