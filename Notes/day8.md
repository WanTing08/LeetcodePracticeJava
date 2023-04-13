# [344. Reverse String](https://leetcode.com/problems/reverse-string/)

### Solution
Two pointers approach: one pointer starts at the beginning of the array
('left'), and the other starts at the end ('right'). In each iteration
of the 'while' loop, it swaps the character at the 'left' and 'right' pointers and
moves the pointers closer together. The loop continues until the left pointer meets or passes the right pointer, at which point the reversal is complete.

### [code](../src/main/java/day6_10/Day8T344ReverseString.java)
```java
public void reverse(char[] s){
    int left = 0;
    int right = s.length - 1;
    
    while(right > left){
        char temp = s[left];
        s[left] = s[right];
        s[right] = temp;
        
        left++;
        right--;
    }
}
```

# [541. Reverse String II](https://leetcode.com/problems/reverse-string-ii/)

## Solution
The solution converts the input String 's' to a character array, and then
iterates through the array in chunks of 2*k characters. For each chunk,
it identifies the left and right indices of the substring be reversed, and
then swaps the characters at these indices using two pointers approach.

Finally, the reversed character array is converted back into a string and returned as the solution.

### [code](../src/main/java/day6_10/Day8T541ReverseStringII.java)

```java
public String reverseII(String s, int k){
    
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
```

```for (int i = 0; i < n; i += 2*k)```

i += 2 * k: This increments i by 2k after each iteration of the loop. This means that each iteration of the loop will start at a position that is 2k characters ahead of the previous iteration. This allows the loop to iterate through the input string in chunks of 2*k characters at a time.


# [151. Reverse Words in a String](https://leetcode.com/problems/reverse-words-in-a-string/)

## Solution



### [code](../src/main/java/day6_10/Day8T151ReverseWordsInAString.java)

