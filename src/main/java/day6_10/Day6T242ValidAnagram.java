package day6_10;
/**
 * Given two strings s and t, return true if t is an anagram of s, and false otherwise.
 *
 * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
 * typically using all the original letters exactly once.
 *
 * Example 1:
 * Input: s = "anagram", t = "nagaram"
 * Output: true
 *
 * Example 2:
 * Input: s = "rat", t = "car"
 * Output: false
 * */
public class Day6T242ValidAnagram {
    public static boolean validAnagram(String s, String t){
        if(s.length() != t.length()) return false;
        int[] result = new int[26];

        for(int i = 0; i < s.length(); i++){
            result[s.charAt(i) - 'a']++;
        }

        for(int i = 0; i < t.length(); i++){
            result[t.charAt(i) - 'a']--;
        }

        for(int i = 0; i < result.length; i++){
            if(result[i] != 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";

        boolean res = validAnagram(s,t);
        System.out.println(res);

    }
}
