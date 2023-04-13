package day6_10;
/*
    Given two strings needle and haystack, return the index of the first occurrence of needle in haystack,
    or -1 if needle is not part of haystack.

    Example 1:
    Input: haystack = "sadbutsad", needle = "sad"
    Output: 0
    Explanation: "sad" occurs at index 0 and 6.
    The first occurrence is at index 0, so we return 0.
 */
public class Day9T28FindTheIndexOfTheFirstOccurrenceInAString {
    public static int findIndex(String haystack, String needle){
        if(needle.isEmpty()) return 0;

        int hlen = haystack.length();
        int nlen = needle.length();

        if(nlen > hlen) return -1;

        for (int i = 0; i <= hlen - nlen; i++) {
            if(haystack.substring(i, i + nlen).equals(needle)){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String haystack = "a";
        String needle = "a";

        int res = findIndex(haystack, needle);
        System.out.println(res);
    }
}
