# [977. Squares of a Sorted Array](https://leetcode.com/problems/squares-of-a-sorted-array/)

### Solution

The idea behind the solution is to maintain two pointers 'left' and 
'right', one at the beginning of the array and one at the end. We 
compare the absolute values of the elements point to by 'left' and 
'right', and take the square of the larger absolute value and add it 
to the result array, working our way backwards from the end of array.
We then decrement or increment 'left' and 'right' accordingly.

Since the original array is sorted in non-decreasing order, the
absolute value of the largest element either at the beginning or 
at the end of the array, so this approach ensures that we add the 
squares of the largest element in the end of the result array.

### [code](../../src/main/java/day1_5/Day2T977.java)

```java
public static int[] sortedSquares(int[] nums){
    int left = 0;
    int right = nums.length - 1;
    int k = nums.length - 1;
    int[] result = new int[nums.length];
    
    while(right >= left){
        if(Math.abs(nums[left]) > Math.abs(nums[right])){
            result[k--] = nums[left] * nums[left];
            left++;
        }else{
            result[k--] = nums[right] * nums[right];
            right--;
        }
    }
    return result;
}
```


# [209. Minimum Size Subarray Sum](https://leetcode.com/problems/minimum-size-subarray-sum/)

### Solution

The idea behind this solution is to use two pointers 'left' and 'right'
to create a sliding window representing a subarray. We start by moving
'right' to the right until the sum of the elements in the current
window greater or equal to the target, then we move 'left' to the
right until the sum of the elements in the current window less than
the target. We repeat this process until 'right' reach the end of 
the array. At each step, we keep track of the minimum length of a 
subarray that has a sum greater or equal to the target.

### [code](../../src/main/java/day1_5/Day2T209.java)
```java
public int minSubArrayLen(int[] nums, int target){
    int left = 0;
    int right = 0;
    int sum = 0;
    int minLen = Integer.MAX_VALUE;
    
    while(right < nums.length){
        sum += nums[right];
        
        while(sum >= target){
            minLen = Math.min(minLen, right - left + 1);
            sum = sum - nums[left];
            left++;
        }
        right++;
    
    }
    return minLen == Integer.MAX_VALUE ? 0 : minLen;
}
```

### Attention

### 1.

In Java, **Integer.MAX_VALUE** is a constant that represents the maximum value that an int variable can hold, which is 2,147,483,647.

In the context of this problem, we use minLength to keep track of the minimum length of a subarray that has a sum greater than or equal to the target. We initialize minLength to Integer.MAX_VALUE to represent that we haven't found any valid subarrays yet.

Later in the code, we check whether minLength has been updated from its initial value. If it has not been updated, then we return 0 to indicate that there is no subarray with a sum greater than or equal to the target.

### 2.
`sum -= nums[left]`
This line is executed when the current subarray sum is greater than or equal to the target value. Since we want to find the minimum length subarray, we move the left pointer to the right to reduce the size of the subarray. When we move the left pointer, we need to subtract the value at the previous left index from the sum variable to maintain the correct subarray sum. 

# [59. Spiral Matrix II](https://leetcode.com/problems/spiral-matrix-ii/)

### Solution

The idea to simulate the spiral pattern iterative filling in the 
matrix in a clockwise direction, while updating the boundaries of
the rows and columns that need to be traversed next. We use four loops
(right, down, left, up), updating the starting and ending indices
accordingly.

