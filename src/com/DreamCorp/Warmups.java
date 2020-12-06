package com.DreamCorp;

public class Warmups {
//1
    /*
    Given 2 int values, return true if one is negative and
    one is positive. Except if the parameter "negative"
    is true, then return true only if both are negative.

    posNeg(1, -1, false) → true
    posNeg(-1, 1, false) → true
    posNeg(-4, -5, true) → true
    posNeg(-4, 5, false) → true
    posNeg(-4, 5, true) → false
    posNeg(-1, -1, false) → false
    posNeg(1, 1, false) → false
    posNeg(1, 1, true) → false
     */

    //return a boolean, taking in 2 ints and a boolean expression
    public boolean posNeg(int a, int b, boolean negative) {

        //if a is positive and b is positive and negative is true
        if(a < 0 && b < 0 && negative) {
            return true;
        }
        //else if its not negative and one int is negative
        else if(!negative && ((a < 0 && b > 0) || (a > 0 && b < 0))) {
            return true;
        }
        return false;
    }

//2---------------------------------------------------------------------------
    /*
    Given a string, return a new string where "not " has been added to the
    front. However, if the string already begins with "not", return the
    string unchanged. Note: use .equals() to compare 2 strings.

    notString("x") → "not x"
    notString("not bad") → "not bad"
    notString("is not") → "not is not"
     */

    public String notString(String str) {

        //if str does not start with "not", add not to str
        if(!str.startsWith("not")) {
            return "not " + str;
        }
        //otherwise, return original str
        else return str;
    }

//3---------------------------------------------------------------------------
    /*
    Given a non-empty string and an int n, return a new string where
    the char at index n has been removed. The value of n will be a valid
    index of a char in the original string (i.e. n will be in the range
    0..str.length()-1 inclusive).


    missingChar("kitten", 1) → "ktten"
    missingChar("kitten", 0) → "itten"
    missingChar("kitten", 4) → "kittn"
     */

    public String missingChar(String str, int n) {

        //creating a string with the value of str starting at index 0 and ending right before index n
        String firstStr = str.substring(0, n);

        //creating a second string with the value of str starting after n to last index of str
        String secStr = str.substring(n + 1, str.length());

        //now that we have before index of n and after, create a new string combining those two
        String newStr = firstStr + secStr;
        return newStr;

        /*
        //can use StringBuilder bc the built in method "deleteCharAt"

        //put the value of str into a new StringBuilder
        StringBuilder newStrTwo = new StringBuilder(str);

        //delete the char at index n
        newStrTwo.deleteCharAt(n);

        //creating a variable to hold newStrTwo to a String (different than StringBuilder)
        String resultString = newStrTwo.toString();
        return resultString;

         */
    }
//4---(WARMUP-2)--------------------------------------------------------------
    /*
    Given a string and a non-negative int n, return a larger string that is
    n copies of the original string.

    stringTimes("Hi", 2) → "HiHi"
    stringTimes("Hi", 3) → "HiHiHi"
    stringTimes("Hi", 1) → "Hi"
     */

    public String stringTimes(String str, int n) {
    //create a loop that iterates n amount of times, adding str each time

        //creating a variable to hold the new string
        String newStr = "";

        //starting i at 1 because we are counting normally and need it to match n's logic, not computers
        //n's logic: if n = 3 it means 1,2,3. Its not including 0 i.e. (0,1,2,3)
        //could also have i = 0 and have it iterate while i < n
        for(int i = 1; i <= n; i++) {

            //adding str to newStr through each iteration
            newStr += str;
        }
        return newStr;
    }
//5---------------------------------------------------------------------------
    /*
    Given a string and a non-negative int n, we'll say that the front of the
    string is the first 3 chars, or whatever is there if the string is less
    than length 3. Return n copies of the front;


    frontTimes("Chocolate", 2) → "ChoCho"
    frontTimes("Chocolate", 3) → "ChoChoCho"
    frontTimes("Abc", 3) → "AbcAbcAbc"
     */

    public String frontTimes(String str, int n) {
        //create a variable that holds str.substring(0,4)
        //will the substring still work if indices are less than ss range? NOPE
        //loop that iterates n amount of times add var to new string

        //creating new string to hold additions
        String newStr = "";

        //iterate through this loop n amount of times
        for(int i = 1; i <= n; i++) {
            //checking for exception, if length less than 3 do this
            if(str.length() < 3) {
                newStr += str;
            }
            //otherwise find the first 3 letters of str and add it to var newStr
            else {
                String firstThree = str.substring(0, 3);
                newStr += firstThree;
            }
        }
        return newStr;
    }
//6---------------------------------------------------------------------------

    /*
    Count the number of "xx" in the given string. We'll say that
    overlapping is allowed, so "xxx" contains 2 "xx".

    countXX("abcxx") → 1
    countXX("xxx") → 2
    countXX("xxxx") → 3
    countXX("Hexxo thxxe") → 2
     */

    public int countXX(String str) {
        //if y index = x and y index + 1 = x, count + 1
        //iterate through each char in string to locate x's
        //char[] findX = str.toCharArray or use indexOf() or charAt()

        //declaring and initializing a variable to hold the int that will be returned
        int count = 0;

        //iterating through the length of str to account for x's (or if there are any)
        //starting at index 0 so i starts at 0
        //length - 1 because we are counting starting from 0
        //ex: 0, 1, 2, 3, 4 -vs- 1, 2, 3, 4, 5
        for(int i = 0; i < str.length() - 1; i++) {

            //searching for x's at each char index of str
            if(str.charAt(i) == 'x' && str.charAt(i + 1) == 'x'){

                //if two x's are found together, add to count
                count++;
            }
        }
        return count;
    }

}

