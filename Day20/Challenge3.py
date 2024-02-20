#Challenge - Prime Factors

"""
The program must accept an integer N as the input. The program must print the prime factors of N in
ascending order as the output.
Boundary Condition(s):
10 <= N <= 10^5
Input Format:
The first line contains N.
Output Format:
The first line contains the prime factors of N in ascending order.
Example Input/Output 1:
Input:
100
Output:
2 5
Explanation:
The factors of 100 are 1, 2, 4, 5, 10, 20, 25, 50 and 100.
The prime factors of 100 are 2 and 5.
So 2 and 5 are printed as the output.
Example Input/Output 2:
Input:
150
Output:
2 3 5
"""

#Solution

def isprime(n):
    if n<=1:
        return False
    else:
        for i in range(2, int(n**0.5)+1):
            if(n%i==0):
                return False
        return True

n= int(input())
for i in range(1, n+1):
    if(n%i==0):
        if(isprime(i)):
            print(i, end=" ");
