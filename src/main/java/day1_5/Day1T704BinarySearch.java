package day1_5;

public class Day1T704BinarySearch {
    public static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while(right >= left){
            int mid = (right + left) / 2;
            if(target < nums[mid]){
                right = mid -1;
            }
            else if(target > nums[mid]){
                left = mid + 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {-1,0,3,5,9,12};
        int target = 5;
        System.out.println(search(nums, target));

    }
}
