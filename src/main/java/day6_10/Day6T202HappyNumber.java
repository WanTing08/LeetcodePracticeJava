package day6_10;

import java.util.HashSet;
import java.util.Set;

/**
 * Write an algorithm to determine if a number n is happy.
 *
 * A happy number is a number defined by the following process:
 *
 * Starting with any positive integer, replace the number by the sum of the squares of its digits.
 * Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
 * Those numbers for which this process ends in 1 are happy.
 * Return true if n is a happy number, and false if not.
 *
 * Example 1:
 *
 * Input: n = 19
 * Output: true
 * Explanation:
 * 1^2 + 9^2 = 82
 * 8^2 + 2^2 = 68
 * 6^2 + 8^2 = 100
 * 1^2 + 0^2 + 0^2 = 1
 * */
public class Day6T202HappyNumber {
    public static boolean isHappy(int n){
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

    public static void main(String[] args) {
        int n = 19;
        System.out.println(isHappy(n));
    }
}
