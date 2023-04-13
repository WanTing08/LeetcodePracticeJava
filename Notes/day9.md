# [28. Find the Index of the First Occurrence in a String](https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/)

## Solution

The idea is to iterate through all possible positions of the needle in 
the haystack, and check if the substring of the haystack starting at 
that position with the same length as the needle matches the needle.
If a match is found, the starting position is returned. If no match is found, -1 is returned. The function also includes some special cases, such as when the needle is empty or when the haystack is shorter than the needle.

### [code](../src/main/java/day6_10/Day9T28FindTheIndexOfTheFirstOccurrenceInAString.java)

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

