## Challenge-2

The program must accept an integer N as the input. The program must print the Nth term in the series
given below.
3, 4, 33, 34, 43, 44, 333, 334, 343, 344, 433, 434, 443, 444 and so on.
All the integers in the above series are formed using the digits 3 and 4.
Boundary Condition(s):
1 <= N <= 10^7
Input Format:
The first line contains N.
Output Format:
The first line contains the Nth
term in the series.
Example Input/Output 1:
Input:
5
Output:
43
Explanation:
The 5th term in the series 3, 4, 33, 34, 43, 44, 333, 334, 343, etc., is 43.
Hence the output is 43

## Solution

def gs(n):
    result = []
    while n>0:
        rem = n%2
        if rem==0:
            result.insert(0, '4')
        else:
            result.insert(0, '3')
            
        n=(n-1)//2
    return ''.join(res)

n= int(input())
res = gs(n)
print(res)
