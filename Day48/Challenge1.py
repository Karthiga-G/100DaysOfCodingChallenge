#Challenge - Celsius to Fahrenheit

"""
The program must accept the temperature T of a city in Celsius and print it in Fahrenheit with the precision up to two decimal places.
Formula: T(i * n deg * F) = (T(i * n deg * C) * 9 / 5) + 32
Boundary Condition(s): 40 <= T <= 40
Input Format:
The first line contains T.
Output Format: The first line contains the temperature T of the city in Fahrenheit.

Example Input/Output 1:
Input:
27
Output: 80.60
Explanation:
Here T = 27
The temperature 27 deg * C is equal to 80.60°F ((27^ * 9/5 )+32) Hence the output is 80.60.

Example Input/Output 2:
Input:
30.8
Output:
87.44

Example Input/Output 3:
Input:
-12.7

Output:
9.14
"""

# Solution

t=int(input())
F=(t * 9/5) + 32 
print(round(F,2))
