//Challenge

/*
Please fill in the lines of code to implement the logic present in the flowchart[https://github.com/Karthiga-G/30DaysOfCodingChallenge/blob/main/Day25/C1_flowchart.png]
*/

//Solution

#include<stdio.h>
#include<stdlib.h>

int main()
{
    int x, y;
    scanf("%d %d", &x, &y);
    while(x<=y){
        printf("%d ", x);
        x+=1;
    }

}
