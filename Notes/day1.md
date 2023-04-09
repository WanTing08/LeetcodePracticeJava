# [704. Binary Search](https://leetcode.com/problems/binary-search/description/)



### Solution

**Double Pointers.** To begin, we establish two pointers that denote 
the position of the first and last elements of the interval in which
we are seeking the target. We then use a recursive approach to determine 
if the middle element of the interval matches the target value. 
If it does, we return the index of the middle element. 
If the target is greater than the middle element, 
we search for the target in the interval to the right of the 
middle element: [mid, right]. 
Conversely, if the target is smaller than the middle element, 
we search for the target in the interval to the left of the 
middle element: [left, mid]. 
Finally, if we do not find the target in the interval (i.e., left > right), 
we return -1 to indicate that it is not present.

Time Complexity: O(log(n))

### [code](../src/main/java/day1_5/Day1T704BinarySearch.java)

### Attention

1 `mid = (right + left) / 2` 

The while loop should contain the position of "mid".


# [27. Remove Element](https://leetcode.com/problems/remove-element/)

### Solution

We use two pointer to traverse the array - 'slow' and 'fast'.
The pointer 'slow' keeps track of the current index where
we can place the next element that is not equal to 'val', and
'fast' is used to iterate over all elements of the array.

We start with 'slow=0' and 'fast=0'. As we iterate over the
array with 'fast', we compare the current element nums[fast] 
with the value 'val'. If the element nums[fast] is equal to
the 'val', copy it to the nums[slow] and increment 'slow'.

At the end of iteration, all elements are not equal to 'val'
will have been moved to the leftside of the array, and 'slow'
will point the next empty position. We return 'slow' as the
length of the new array with the target element removed.

### [code](../src/main/java/day1_5/Day1T27RemoveElement.java)










 
