//Challenge - Longest Strictly Increasing or Strictly Decreasing Subarray

/*
You are given an array of integers nums. Return the length of the longest subarray of nums which is either strictly increasing or strictly decreasing.

Example 1:
Input: nums = [1,4,3,3,2]
Output: 2
Explanation:
The strictly increasing subarrays of nums are [1], [2], [3], [3], [4], and [1,4].
The strictly decreasing subarrays of nums are [1], [2], [3], [3], [4], [3,2], and [4,3].
Hence, we return 2.

Example 2:
Input: nums = [3,3,3,3]
Output: 1
Explanation:
The strictly increasing subarrays of nums are [3], [3], [3], and [3].
The strictly decreasing subarrays of nums are [3], [3], [3], and [3].
Hence, we return 1.

Example 3:
Input: nums = [3,2,1]
Output: 3
Explanation:
The strictly increasing subarrays of nums are [3], [2], and [1].
The strictly decreasing subarrays of nums are [3], [2], [1], [3,2], [2,1], and [3,2,1].
Hence, we return 3.

Constraints:
1 <= nums.length <= 50
1 <= nums[i] <= 50
*/

//Solution

class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int inclen=1;
        int declen=1;
        int maxlen=1;
        for(int i=1; i<nums.length; i++){
            if(nums[i]>nums[i-1]){
                declen=1;
                inclen++;
            }
            else if(nums[i]<nums[i-1]){
                declen++;
                inclen=1;
            }
            else{
                declen=1;
                inclen=1;
            }
            maxlen=Math.max(maxlen, Math.max(inclen, declen));
        }
        return maxlen;
    }
}

//driver code
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test cases with different monotonic sequences and equal elements
        int[] testCase1 = {3, 3, 3};
        int[] testCase2 = {1, 4, 3, 3, 2};
        int[] testCase3 = {3,2,1};

        System.out.println("Length of longest monotonic subarray in [3, 3, 3]: " + solution.longestMonotonicSubarray(testCase1)); // Output: 3
        System.out.println("Length of longest monotonic subarray in [1, 4, 3, 3, 2]: " + solution.longestMonotonicSubarray(testCase2)); // Output: 4
        System.out.println("Length of longest monotonic subarray in [3,2,1]: " + solution.longestMonotonicSubarray(testCase3)); // Output: 2
    }
}
