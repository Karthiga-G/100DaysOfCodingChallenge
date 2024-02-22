// Challenge

/* 
Identify the purpose of the subtractUnitDigit function and describe its functionality. 
Also, explain the main logic of the program and how it processes the input array. 
#include <stdio.h>
#include <stdlib.h>

int* subtractUnitDigit(int arr[], int n) {
    // Write your code here
}

int main() {
    int n;
    printf("Enter the size of the array: ");
    scanf("%d", &n);
    int arr[n];
    int *result = subtractUnitDigit(arr, n);
    if (result != NULL) {
        printf("Result array: ");
        for (int i = 0; i < n; i++) {
            printf("%d ", result[i]);
        }
        printf("\n");
    }
    return 0;
}

*/

//Solution

#include <stdio.h>

int* subtractUnitDigit(int arr[], int n) {
    for (int i = 0; i < n; i++) {
        scanf("%d", &arr[i]);
    }
    int *c = malloc(n * sizeof(int));
    int *b = malloc(n * sizeof(int));
    for (int i = 0; i < n; i++) {
        b[i] = arr[i] % 10;
    }
    for (int i = 0; i < n; i++) {
        c[i] = arr[i] - b[i];
    }
    return c;
}

int main() {
    int n;
    printf("Enter the size of the array: ");
    scanf("%d", &n);
    int arr[n];
    int *result = subtractUnitDigit(arr, n);
    if (result != NULL) {
        printf("Result array: ");
        for (int i = 0; i < n; i++) {
            printf("%d ", result[i]);
        }
        printf("\n");
    }
    return 0;
}
