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

# [1047. Remove All Adjacent Duplicates In String](https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/)

## Solution
We use a stack to store characters from the input string 's', we iterate 
through the character in 's', and for each character:
- If the stack is not empty and the top character in the stack is equal
to the current character, we pop the top character from the stack.
- Otherwise, we push the current character onto the stack.

After iterating through all characters in 's', we construct a new string
by appending each character in the stack to a 'StringBuilder', and return
the resulting string.

Time Complexity: _**O(n)**_

```java
public String removeAdjacent(String s){
    
    Stack<Character> stack = new Stack<>();
    
    for(char c : s.toCharArray()){
        if(!stack.isEmpty() && stack.peek() == c){
            stack.pop();
        }else stack.push(c);
    }
    
    StringBuilder sb = new StringBuilder();
    for(char c : stack){
        sb.append(c);
    }
    
    return sb.toString();
}
```

