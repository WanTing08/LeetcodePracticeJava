package day6_10;
/*
    Given an input string s, reverse the order of the words.

    A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.

    Return a string of the words in reverse order concatenated by a single space.

    Note that s may contain leading or trailing spaces or multiple spaces between two words.
    The returned string should only have a single space separating the words. Do not include any extra spaces.

    Example:
    Input: s = "the sky is blue"
    Output: "blue is sky the"
 */
public class Day8T151ReverseWordsInAString {
    public String reverseWords(String s){

        s = s.trim(); // Remove leading and trailing whitespaces

        String[] words = s.split("\\s+"); // Split the string into individual words

        StringBuilder sb = new StringBuilder();
        for (int i = words.length; i >= 0; i--) {
            sb.append(words[i]);
            if(i != 0){
                sb.append(" ");
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {

    }
}
