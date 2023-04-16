# [20. Valid Parentheses](https://leetcode.com/problems/valid-parentheses/)

## Solution
The solution uses a stack to keep track of the opening parentheses, brackets, and braces. When a closing symbol is encountered, we check the top of the stack to see if it matches the expected opening symbol. If it doesn't match or the stack is empty, then the string is not valid.

```java
public boolean isValid(String s){
    
    Stack<Character> stack = new Stack<>();
    
    for(char c : s.toCharArray()){
        if(c == '(' || c == '{' || c == '['){
            stack.push(c);
        }
        else if(stack.isEmpty()) return false;
        
        else if (c == ')' && stack.peek() == '('){
            stack.pop();
        } 
        else if (c == '}' && stack.peek() == '{') {
            stack.pop();
        } 
        else if (c == ']' && stack.peek() == ']') {
            stack.pop();
        }
        else return false;
    }
    return stack.isEmpty();
}
```

# [1047. Remove All Adjacent Duplicates In String]