// Challenge - Palindrome Linked List

/**
Given the head of a singly linked list, return true if it is a palindrome or false otherwise.
Example 1:
Input: head = [1,2,2,1]
Output: true
Example 2:
Input: head = [1,2]
Output: false
Constraints:
The number of nodes in the list is in the range [1, 105]. 0 <= Node.val <= 9
*/

// Intuition
// The intuition behind this approach is to use a stack to store the elements of the linked list in reverse order. We then traverse the linked list again and compare each element with the elements popped from the stack. If all elements match, the linked list is a palindrome.

// Approach
// 1. Traverse the linked list and push each element's value onto a stack.
// 2. Traverse the linked list again and compare each element's value with the elements popped from the stack. If any element doesn't match, return false.
// 3. If all elements match, return true, indicating that the linked list is a palindrome.
  
// Complexity
// Time complexity:
// O(n), where n is the number of elements in the linked list. We traverse the linked list twice, each time taking O(n) time.
// Space complexity:
// O(n), where n is the number of elements in the linked list. We use a stack to store the elements of the linked list, which requires O(n) space.

//Solution

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        ListNode curr = head;
        while(curr!=null){
            stack.push(curr.val);
            curr = curr.next;
        }
        curr= head;
        while(curr!=null){
            if(curr.val!= stack.pop()){
                return false;
            }
            curr=curr.next;
        }
        return true;
    }
}
