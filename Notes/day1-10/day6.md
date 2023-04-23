# [242. Valid Anagram](https://leetcode.com/problems/valid-anagram/)

## Solution
The solution works by using an array to keep track of the frequency of 
each character in the first string, and then subtracting the frequency 
of each character in the second string. If the resulting frequency 
is zero, then the two string are anagram.

### [code](../../src/main/java/day6_10/Day6T242ValidAnagram.java)
```java
public boolean validAnagram(String s, String t){
    if(s.length() != t.length()) return false;
    int[] result = new int[26];
    
    for(int i = 0; i < s.length(); i++){
        result[s.charAt(i) - 'a']++;
    }
    
    for(int i = 0; i < t.length(); i++){
        result[t.charAt(i) - 'a']--;
    }
    
    for(int i = 0; i < result.length; i++){
        if(result[i] != 0){
            return false;
        }
    }
    return true;
}
```

# [349. Intersection of Two Arrays](https://leetcode.com/problems/intersection-of-two-arrays/)

## Solution
We create two set _'set1'_ and _'set2'_ to store the unique elements of _'nums1'_
and the common elements of _'nums1'_ and _'nums2'_, respectively;

Loop through _'nums1'_ and add each element on _'set1'_;

Loop through _'nums2'_, check if the element is presented in _'set1'_. If
it is, add it on _'set2'_;

Finally, convert the _'set2'_ to an array and return it.

### [code](../../src/main/java/day6_10/Day6T349IntersectionOfTwoArrays.java)
```java
public int[] intersection(int[] nums1, int[] nums2){
    Set<Integer> set1 = new HashSet<>();
    Set<Integer> set2 = new HashSet<>();
    
    for (int i = 0; i < nums1.length; i++) {
        set1.add(nums1[i]);
    }
    
    for (int i = 0; i < nums2.length; i++) {
        if(set1.contains(nums2[i])){
            set2.add(nums2[i]);
        }
    }
    
    int[] result = new int[set2.size()];
    int i = 0;
    for(int num : set2){
        result[i++] = num;
    }
    
    return result;
}
```

### Attention
```java
int i = 0;
for(int num : set2){
    result[i++] = num;
}
```
This code block is used to convert the 'Set<Integer>' 'set2'to 'int[]'
array 'result'. First, we initialize a variable 'i' to 0, this variable 
will be used as a index of the 'result' array. Next we loop through the 
elements of 'set2' using a **for-each loop**. For each element 'num' in
'set2', we assign 'num' to 'result[i]' and then increment the value of
the index 'i' by 1.


# [202. Happy Number](https://leetcode.com/problems/happy-number/)

## Solution
The idea behind the solution is to sum the squares of each digit from
given number. If the result of sum equals to 1, the number is considered 
happy. If the number repeats a previously calculated number, it's in a
cycle and thus not a happy number. 

To keep track of the previous calculated number, we use a **HashSet**.
We first add the given number to the HashSet, and then continue to 
calculate the sum of squares of digits. If the sum is already in the
HashSet, then we have entered the cycle and the number is not happy. 
If the sum is 1, the number is happy and return true. Otherwise, we add
the sum to the HashSet and continue the process.


### [code](../../src/main/java/day6_10/Day6T202HappyNumber.java)
```java
public boolean isHappy(int n){
    Set<Integer> set = new HashSet<>();
    
    while(n != 1){
        int sum = 0;
        while(n != 0){
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        
        if(set.contains(sum)) return false;
        set.add(sum);
        n = sum;
    }
    return true;
}
```

# [1. Two Sum](https://leetcode.com/problems/two-sum/)

# Solution
The idea is to use a HashMap to store the values and their indices.
We loop through the array and check if the complement of each element is in the HashMap. If it is, we return the indices of the two elements. Otherwise, we add the element and its index to the HashMap. If no solution is found, we return an empty array.

### [code](../../src/main/java/day6_10/Day6T1TwoSum.java)
```java
public int[] twoSum(int[] nums, int target){
    
    int[] res = new int[2];
    
    if(nums == null || nums.length == 0) return res;
    
    Map<Integer, Integer> map = new HashMap<>();
    
    for (int i = 0; i < nums.length; i++) {
        int temp = target - nums[i];
        if(map.containsKey(temp)) {
            res[1] = i;
            res[0] = map.get(temp);
            break;
        }
        map.put(nums[i], i);
    }
    
    return res;
}
```















