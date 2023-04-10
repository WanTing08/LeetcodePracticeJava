package day6_10;

/*
    Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.

    Each letter in magazine can only be used once in ransomNote.

    Example 1:
    Input: ransomNote = "a", magazine = "b"
    Output: false

    Example 2:
    Input: ransomNote = "aa", magazine = "ab"
    Output: false

    Example 3:
    Input: ransomNote = "aa", magazine = "aab"
    Output: true
 */
public class Day7T383RansomNote {
    public static boolean ransomNote(String ransom, String magazine){
        int[] record = new int[26];
        for(char c : magazine.toCharArray()){
            record[c - 'a']++;
        }
        for(char c : ransom.toCharArray()){
            if(record[c - 'a'] == 0) return false;
            record[c - 'a']--;
        }
        return true;
    }

    public static void main(String[] args) {
        String ransom = "aa";
        String magazine = "a";
        boolean res = ransomNote(ransom, magazine);
        System.out.println(res);
    }
}
