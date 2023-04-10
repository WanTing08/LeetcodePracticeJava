# [454. 4Sum II](https://leetcode.com/problems/4sum-ii/)

## Solution
The idea behind the solution is to use a hash map to store the counts of
sums of pairs of numbers from the first two arrays. We then loop through
the third and fourth arrays and look for the corresponding negative sum
in the hash map. If it exists, we add its count to the total number of
valid quadruplets.

### [code](../src/main/java/day6_10/Day7T454_4SumII.java)

```java
public int fourSum(int[] nums1, int[] nums2, int[] nums3, int[] nums4){
    Map<Integer, Integer> map = new HashMap<>(); //The keys of the map are sums of pairs and the values are the counts of those sums.int count = 0;
        
    for (int i = 0; i < nums1.length; i++) {
        for (int j = 0; j < nums2.length; j++) {
            int sum1 = nums1[i] + nums2[j];
            map.put(sum1, map.getOrDefault(sum1, 0) + 1);
        }
    }
    
    for (int i = 0; i < nums3.length; i++) {
        for (int j = 0; j < nums4.length; j++) {
            int sum2 = -(nums3[i] + nums4[j]);
            count += map.getOrDefault(sum2, 0);
        }
    }
    return count;
}
```

### Attention

- ```map.put(sum1, map.getOrDefault(sum1, 0) + 1);```  Adds a new sum to the map if it has not been seen before, or increments the count of an existing sum if it has been seen before.



- ```getOrDefault(Object key, V defaultValue)``` method is a method of the Map interface in Java.

    _**key:**_  the key whose associated value is to be returned
    
    **_defaultValue_**: the value to be returned if the specified key is not found in the map

# [383. Ransom Note](https://leetcode.com/problems/ransom-note/)

## Solution

The idea behind the solution is to first count the frequency of each character
of the magazine string, and then check if there are enough character to 
construct the ransom note. 

### [code](../src/main/java/day6_10/Day7T383RansomNote.java)
```java
public static boolean ransomNote(String ransom, String magazine){
    int[] record = new int[26]; //count each character in magazine
    
    for(char c : magazine.toCharArray()){
        record[c - 'a']++; //Increment the count of each encountered character
    }
    
    for(char c : ransom.toCharArray()){
        if(record[c - 'a'] == 0) return false; //Not enough character in magazine
        record[c - 'a']--; //Decrement count of used character
    }
    
    return true;
}
```

