// CHALLENGE

/*
Write a Java program that takes three integers as input: n, x, and y. It then reads an array of n integers and rearranges it such 
that all elements within the range [x, y] are sorted in ascending order, while maintaining the order of elements outside this 
range. Implement the program to achieve this functionality efficiently using priority queues. Ensure the output maintains the 
original order of elements.

Example:
Input:
7 3 8
6 1 9 4 3 7 5
Output:
1 3 4 6 7 9 5
Explanation: In the input array [6, 1, 9, 4, 3, 7, 5], elements within the range [3, 8] are [6, 4, 3, 7], which when sorted, 
become [3, 4, 6, 7]. The rearranged array maintains the order of other elements while placing the sorted elements within the 
specified range.
*/

// Solution

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int x= sc.nextInt();
		int y= sc.nextInt();
		int arr[]= new int[n];
		for(int i=0; i<n; i++){
		    arr[i]= sc.nextInt();
		}
		int small=x;
		int large=y;
		if(x>y){
		    small= y;
		    large= x;
		}
        Queue<Integer> q= new PriorityQueue<>();
        for(int i=0; i<arr.length; i++){
            if(arr[i]>=small && arr[i]<=large){
                q.add(arr[i]);
            }
        }
        for(int i=0; i<arr.length; i++){
            if(arr[i]>=small && arr[i]<=large){
                System.out.print(q.poll()+" ");
            }
            else{
                System.out.print(arr[i]+" ");
            }
        }
	}
}
