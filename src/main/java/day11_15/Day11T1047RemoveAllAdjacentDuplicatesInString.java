package day11_15;

import java.util.Stack;

/*
    You are given a string s consisting of lowercase English letters.
    A duplicate removal consists of choosing two adjacent and equal letters and removing them.

    We repeatedly make duplicate removals on s until we no longer can.

    Return the final string after all such duplicate removals have been made. It can be proven that the answer is unique.

    Example 1:
    Input: s = "abbaca"
    Output: "ca"

    Example 2:
    Input: s = "azxxzy"
    Output: "ay"

 */
public class Day11T1047RemoveAllAdjacentDuplicatesInString {
    public static String removeAdjacent(String s){
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for(char c : s.toCharArray()){
            if(!stack.isEmpty() && stack.peek() == c){
                stack.pop();
            }else{
                stack.push(c);
            }
        }
        for(char c : stack){
           sb.append(c);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "azxxzy";
        System.out.println(removeAdjacent(s));
    }
}
