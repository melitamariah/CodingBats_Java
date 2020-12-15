package com.DreamCorp;

import java.util.Arrays;

public class Arrays2 {
//1
    /*
    Return the number of even ints in the given array.
    Note: the % "mod" operator computes the remainder,
    e.g. 5 % 2 is 1.

    countEvens([2, 1, 2, 3, 4]) → 3
    countEvens([2, 2, 0]) → 3
    countEvens([1, 3, 5]) → 0
     */
    public int countEvens(int[] nums) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                count++;
            }
        }
        return count;
    }
//2-------------------------------------------------------------
    /*
    Given an array length 1 or more of ints, return the difference
    between the largest and smallest values in the array. Note:
    the built-in Math.min(v1, v2) and Math.max(v1, v2) methods
    return the smaller or larger of two values.

    bigDiff([10, 3, 5, 6]) → 7
    bigDiff([7, 2, 10, 9]) → 8
    bigDiff([2, 10, 7, 2]) → 8
     */
    public static int bigDiff(int[] nums) {

        //starting point is nums at index 1
        int min = nums[0];
        int max = nums[0];

        //for each = enhanced for i loop
        for (int num : nums) {
            //comparing for min
            min = Math.min(min, num);
            //comparing for max
            max = Math.max(max, num);
        }
        return max-min;
    }
//2-------------------------------------------------------------
    /*
    Return the "centered" average of an array of ints, which
    we'll say is the mean average of the values, except ignoring
    the largest and smallest values in the array. If there are multiple
    copies of the smallest value, ignore just one copy, and likewise
    for the largest value. Use int division to produce the final average.
    You may assume that the array is length 3 or more.

    centeredAverage([1, 2, 3, 4, 100]) → 3
    centeredAverage([1, 1, 5, 5, 10, 8, 7]) → 5
    centeredAverage([-10, -4, -2, -4, -2, 0]) → -3
     */
    public static int centeredAverage(int[] nums) {
        //ignore the smallest the largest and smallest values
        //is this in order? Use sort to order if not
        //start at index 1 and end at length - 2
        int addElements = 0;

        Arrays.sort(nums);
        for (int i = 1; i <= nums.length - 2; i++) {
            addElements += nums[i];
        }
        //subtracting 2 because we have ignored the max and mix elements
        return addElements / (nums.length - 2);
    }
//3-------------------------------------------------------------
    /*
    Return the sum of the numbers in the array, returning 0 for
    an empty array. Except the number 13 is very unlucky, so it does
    not count and numbers that come immediately after a 13 also do
    not count.

    sum13([1, 2, 2, 1]) → 6
    sum13([1, 1]) → 2
    sum13([1, 2, 2, 1, 13]) → 6
    */
    public int sum13(int[] nums) {

        int sum = 0;

        for(int i = 0; i < nums.length; i++) {
            if (nums[i] == 13)
                i++;
            else
                sum += nums[i];
        }
        return sum;
    }
//4-------------------------------------------------------------
    /*
    Return the sum of the numbers in the array, except ignore
    sections of numbers starting with a 6 and extending to the
    next 7 (every 6 will be followed by at least one 7). Return
    0 for no numbers.

    sum67([1, 2, 2]) → 5
    sum67([1, 2, 2, 6, 99, 99, 7]) → 5
    sum67([1, 1, 6, 7, 2]) → 4
     */
    public int sum67(int[] nums) {
        //create an operation that'll ignore 6 until 7
        //create variable to hold sum

        int sum = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 6) {
                while (nums[i] != 7) {
                    i++;
                }
            } else {
                sum += nums[i];
            }
        }
        return sum;
    }
//5-------------------------------------------------------------
    /*
    Given an array of ints, return true if the array contains
    a 2 next to a 2 somewhere.

    has22([1, 2, 2]) → true
    has22([1, 2, 1, 2]) → false
    has22([2, 1, 2]) → false
     */
    public boolean has22(int[] nums) {

        //generate iteration to catch the index of a 2 and check if
        //the index of 2 + 1 are equal, if so return true

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 2 && nums[i + 1] == 2)
                return true;
        }
        return false;
    }
//6-------------------------------------------------------------
    /*
    Given an array of ints, return true if the array contains
    no 1's and no 3's.

    lucky13([0, 2, 4]) → true
    lucky13([1, 2, 3]) → false
    lucky13([1, 2, 4]) → false
     */
    public boolean lucky13(int[] nums) {

        for (int num : nums) {
            if (num == 1 || num == 3)
                return false;
        }
        return true;
    }
//7-------------------------------------------------------------
    /*
    Given an array of ints, return true if the sum of all the
    2's in the array is exactly 8.

    sum28([2, 3, 2, 2, 4, 2]) → true
    sum28([2, 3, 2, 2, 4, 2, 2]) → false
    sum28([1, 2, 3, 4]) → false
    */
    public boolean sum28(int[] nums) {

        int twoSum = 0;

        for (int num : nums) {
            if (num == 2)
                twoSum += 2;
        }
        return twoSum == 8;
    }
//8-------------------------------------------------------------
    /*
    Given an array of ints, return true if the number of 1's
    is greater than the number of 4's

    more14([1, 4, 1]) → true
    more14([1, 4, 1, 4]) → false
    more14([1, 1]) → true
     */
    public boolean more14(int[] nums) {

        int countOne = 0;
        int countFour = 0;

        for (int num : nums) {
            if (num == 1) {
                countOne++;
            } else if (num == 4) {
                countFour++;
            }
        }
        return countOne > countFour;
    }
//9-------------------------------------------------------------
    /*
    Given a number n, create and return a new int array of
    length n, containing the numbers 0, 1, 2, ... n-1. The
    given n may be 0, in which case just return a length 0
    array. You do not need a separate if-statement for the
    length-0 case; the for-loop should naturally execute 0
    times in that case, so it just works. The syntax to make
    a new int array is: new int[desired_length]
    (See also: FizzBuzz Code)

    fizzArray(4) → [0, 1, 2, 3]
    fizzArray(1) → [0]
    fizzArray(10) → [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
     */
    public int[] fizzArray(int n) {
        //use a for loop (thinking for-i)
        //iterate through each number of n and add it do newly created array

        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            //at i insert the number i into array
            arr[i] = i;

        return arr;
    }
//10-------------------------------------------------------------
    /*
    Given an array of ints, return true if every element
    is a 1 or a 4.

    only14([1, 4, 1, 4]) → true
    only14([1, 4, 2, 4]) → false
    only14([1, 1]) → true
     */
public boolean only14(int[] nums) {
    //doesnt matter positioning
    //scan for 1 or 4 for every element
    //return t/f after iteration

    for(int num : nums) {
        if(num != 1 && num != 4) {
            return false;
        }
    }
    return true;
}
//11-------------------------------------------------------------
   /*
   Given a number n, create and return a new string array of
   length n, containing the strings "0", "1" "2" .. through n-1.
   N may be 0, in which case just return a length 0 array. Note:
   String.valueOf(xxx) will make the String form of most types.
   The syntax to make a new string array is: new String[desired_length]
   (See also: FizzBuzz Code)

    fizzArray2(4) → ["0", "1", "2", "3"]
    fizzArray2(10) → ["0", "1", "2", "3", "4", "5", "6", "7", "8", "9"]
    fizzArray2(2) → ["0", "1"]
    */
    public String[] fizzArray2(int n) {

        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            arr[i] = String.valueOf(i);
        }
        return arr;
    }
//12-------------------------------------------------------------
    /*
    Given an array of ints, return true if it contains no 1's or
    it contains no 4's.

    no14([1, 2, 3]) → true
    no14([1, 2, 3, 4]) → false
    no14([2, 3, 4]) → true
     */
    public boolean no14(int[] nums) {

        int countOne = 0;
        int countFour = 0;

        for (int num : nums) {
            if (num == 1)
                countOne++;
            if (num == 4)
                countFour++;

        }
        if (countOne >= 1 && countFour >= 1) {
            return false;
        }
        return true;
    }

}

