# Challenge

'''
The program must accept a string S containing multiple words as the input. The program must
print yes if the last character of each word is equal to the first character of its previous word. Else the
program must print no as the output.
Note: The alphabets in the string S is always case insensitive.
Boundary Condition(s):
5 <= Length of S <= 1000
Input Format:
The first line contains S.
Output Format:
The first line contains yes or no.
Example Input/Output 1:
Input:
Apple Guava Fig
Output:
yes
Explanation:
In the given string Apple Guava Fig, the last character of each word is equal to the first character of its
previous word.
So yes is printed.
Example Input/Output 2:
Input:
A thing begun is half done
Output:
no
'''

# Solution
words = input().split()
t, pre= True, words[0]
for i in range(1, len(words)):
    curr= words[i]
    f, l= pre[0].lower(), curr[-1].lower()
    t&=f == l
    pre= curr
print("yes" if t else "no")
