package neetcode150.stack;

import java.util.ArrayList;
import java.util.List;

public class T22_GenerateParentheses {
    public static List<String> generateParentheses(int n){
        List<String> result = new ArrayList<>();
        backtrack(result, "", 0, 0 , n);
        return result;
    }
    private static void backtrack(List<String> result, String curr, int open, int close, int n){
        if(curr.length() == 2 * n){
            result.add(curr);
            return;
        }
        if(open < n){
            backtrack(result, curr + '(', open + 1, close, n);
        }
        if(open > close){
            backtrack(result, curr + ')', open, close + 1, n);
        }
    }

    public static void main(String[] args) {
        int n = 2;
        List<String> result = generateParentheses(n);
        for(String combination : result){
            System.out.println(combination);
        }
    }
}
