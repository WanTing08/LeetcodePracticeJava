# [49. Group Anagrams](https://leetcode.com/problems/group-anagrams/)
Given an array of strings strs, group the anagrams together. You can return the answer in any order.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

Example :
```
Input: strs = ["eat","tea","tan","ate","nat","bat"]
Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
```

# [238. Product of Array Except Self](https://leetcode.com/problems/product-of-array-except-self/description/)

Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].

The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

You must write an algorithm that runs in O(n) time and without using the division operation.


Example 1:
```java
Input: nums = [1,2,3,4]

Output: [24,12,8,6]
```

Example 2:
```java
Input: nums = [-1,1,0,-3,3]

Output: [0,0,9,0,0]

```
### [code](../src/main/java/neetcode150/arraysAndHashing/T238_ProductOfArrayExceptSelf.java)


# [36. Valid Sudoku](https://leetcode.com/problems/valid-sudoku/)
Determine if a 9 x 9 Sudoku board is valid. Only the filled cells need to be validated according to the following rules:

Each row must contain the digits 1-9 without repetition.
Each column must contain the digits 1-9 without repetition.
Each of the nine 3 x 3 sub-boxes of the grid must contain the digits 1-9 without repetition.

Note:

- A Sudoku board (partially filled) could be valid but is not necessarily solvable.

- Only the filled cells need to be validated according to the mentioned rules.

Example:
```java
Input: board = 
[["5","3",".",".","7",".",".",".","."]
,["6",".",".","1","9","5",".",".","."]
,[".","9","8",".",".",".",".","6","."]
,["8",".",".",".","6",".",".",".","3"]
,["4",".",".","8",".","3",".",".","1"]
,["7",".",".",".","2",".",".",".","6"]
,[".","6",".",".",".",".","2","8","."]
,[".",".",".","4","1","9",".",".","5"]
,[".",".",".",".","8",".",".","7","9"]]
Output: true
```

### [code](../src/main/java/neetcode150/arraysAndHashing/T36_ValidSudoku.java)

# 271. Encode and Decode Strings
Design an algorithm to encode a list of strings to a string. The encoded string is then sent over the network and is decoded back to the original list of strings.

Machine 1 (sender) has the function:
```java
string encode (vector<string> strs) {
// ... your code
return encoded string;
```

Machine 2 (receiver) has the function:
```java
vector<string> decode(string s) {
//... your code return strs;
}
```

So Machine 1 does:
```java
string encoded_string = encode(strs);
```

and Machine 2 does:
```java
vector<string> strs2 = decode (encoded_ string) ;
```

```str2``` in Machine 2 should be the same as ```strs``` in Machine 1.

Implement the encode and decode methods.

You are not allowed to solve the problem using any serialize methods (such as eval).

Example 1:
```java
Input: dummy_input = ["Hello", "World"]
Output: ["Hello", "World"]

Explanation:
Machine 1:
Codec encoder = new Codec();
String msg = encoder. encode (strs) ;
Machine 1 ---msg---> Machine 2
        
Machine 2:
Codec decoder = new Codec():
String[] strs = decoder. decode (msg) ;
```

Example 2:
```java
Input: dummy_input = ['"]
Output: ['"]
```
### [code](../src/main/java/neetcode150/arraysAndHashing/T271_EncodeAndDecodeStrings.java)


# 128. Longest Consecutive Sequence

Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.

You must write an algorithm that runs in O(n) time.

Example 1:
```java
Input: nums = [100,4,200,1,3,2]
Output: 4
Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.
```

Example 2:
```java
Input: nums = [0,3,7,2,5,8,4,6,0,1]
Output: 9
```

### [code](../src/main/java/neetcode150/arraysAndHashing/T128_LongestConsecutiveSequence.java)
