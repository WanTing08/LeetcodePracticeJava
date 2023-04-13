package day6_10;
/*
    Given a string s, check if it can be constructed by taking a substring of it and appending multiple copies of the substring together.

    Example 1:
    Input: s = "abab"
    Output: true
    Explanation: It is the substring "ab" twice.

    Example 2:
    Input: s = "aba"
    Output: false
 */

public class Day9T459RepeatedSubstringPattern {
    public static boolean isRepeated(String s){
        int n = s.length();
        for(int i = n/2; i >= 0; i--){
            if(n % i == 0){
                int m = n / i;
                String sub = s.substring(0, i);
                StringBuilder sb = new StringBuilder();
                for (int j = 0; j < m; j++) {
                    sb.append(sub);
                }
                if(sb.toString().equals(s)) return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String s = "abab";
        boolean res = isRepeated(s);
        System.out.println(res);
    }
}
