package day6_10;
/*
Given a string s and an integer k, reverse the first k characters for every 2k characters counting from the start of the string.

If there are fewer than k characters left, reverse all of them.
If there are less than 2k but greater than or equal to k characters, then reverse the first k characters and leave the other as original.

Example 1:
Input: s = "abcdefg", k = 2
Output: "bacdfeg"

Example 2:
Input: s = "abcd", k = 2
Output: "bacd"
 */
public class Day8T541ReverseStringII {
    public static String reverseII(String s, int k){
        char[] arr = s.toCharArray();
        int n = arr.length;
        for (int i = 0; i < n; i += 2*k) {
            int left = i;
            int right = Math.min(i + k - 1, n - 1);
            while(right > left){
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
        return new String(arr);
    }

    public static void main(String[] args) {
        String s = "abcdefg";
        int k = 2;
        System.out.println(reverseII(s, k));
    }
}
