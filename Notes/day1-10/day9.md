# [28. Find the Index of the First Occurrence in a String](https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/)

## Solution

The idea is to iterate through all possible positions of the needle in 
the haystack, and check if the substring of the haystack starting at 
that position with the same length as the needle matches the needle.
If a match is found, the starting position is returned. If no match is found, -1 is returned. The function also includes some special cases, such as when the needle is empty or when the haystack is shorter than the needle.

### [code](../../src/main/java/day6_10/Day9T28FindTheIndexOfTheFirstOccurrenceInAString.java)

```java
public int findIndex(String haystack, String needle){
    if(needle.isEmpty()) return 0;
    
    int hlen = haystack.length();
    int nlen = needle.length();
    
    if(nlen > hlen) return -1;
    for(int i = 0; i <= hlen - nlen; i++){
        if(haystack.substring(i, i + nlen).equals(needle)){
            return i;
        }
    }
    return -1;
}
```

# [459. Repeated Substring Pattern](https://leetcode.com/problems/repeated-substring-pattern/)

## Solution
The approach is based on the observation that if the string 's' can be 
formed by repeating a smaller substring 'sub', then 's' must contain 'sub'
twice, once and the beginning once at the end. 

So we can start by checking if the string 's' contains any repeated substring.
We can do this by checking if 's' equals to 'sub' concatenated with itself
'n' times, where 'n' is the length of 's' divided by the length of 'sub'.
If 's' can be fromed by repeating 'sub', then this condition must be true.

### [code](../../src/main/java/day6_10/Day9T459RepeatedSubstringPattern.java)

```java
public boolean isRepeated(String s){
    int n = s.length();
    
    for(int i = n / 2; i >= 0; i--){
        
        if(n % i == 0){
            int m = n / i;
            String sub = s.substring(0, i);
            StringBuilder sb = new StringBuilder();
            
            for(int j = 0; j < m; j++){
                sb.append(sub);
            }
            
            if(sb.toString().equals(s)) return true;
        }
    }
    return false;
}
```

