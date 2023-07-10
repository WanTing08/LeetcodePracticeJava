package neetcode150.twoPointers;

import java.util.ArrayList;
import java.util.List;

public class ContainerWithMostWater {
    public static int maxArea(int[] height){
        int maxArea = 0;
        int left = 0;
        int right = height.length - 1;
        while(right > left){
            int area = Math.min(height[left], height[right]) * (right - left);
            maxArea = Math.max(area, maxArea);

            if(height[left] < height[right]){
                left++;
            }else{
                right--;
            }
        }
        return maxArea;
    }

    public static void main(String[] args) {

    }
}
