package com.DreamCorp;

public class String2 {
//1
    /*
    Given a string, return a string where for every char in
    the original, there are two chars.

    doubleChar("The") → "TThhee"
    doubleChar("AAbb") → "AAAAbbbb"
    doubleChar("Hi-There") → "HHii--TThheerree"
    */
    public String doubleChar(String str) {

    String doubleLetters = "";

    for(int i = 0; i < str.length(); i++) {
        doubleLetters += str.charAt(i);
        doubleLetters += str.charAt(i);
    }
    return doubleLetters;
}
//2-------------------------------------------------------------
    /*
    Return the number of times that the string "hi" appears
    anywhere in the given string.

    countHi("abc hi ho") → 1
    countHi("ABChi hi") → 2
    countHi("hihi") → 2
     */
    public int countHi(String str) {

    int count = 0;

    for(int i = 0; i < str.length() - 1; i++) {
        if(str.charAt(i) == 'h' && (str.charAt(i + 1) == 'i')) {
            count++;
        }
    }
    return count;
}
//3-------------------------------------------------------------
    /*
    Return true if the string "cat" and "dog" appear the
    same number of times in the given string.

    catDog("catdog") → true
    catDog("catcat") → false
    catDog("1cat1cadodog") → true
     */

    public boolean catDog(String str) {

        //a variable to keep track of the count
        int count = 0;

        //loop through length of str - 2 to catch exceptions
        for (int i = 0; i < str.length() - 2; i++) {

            //if substring at i, ii, iii = cat
            if (str.substring(i, i + 3).equals("cat")) {
                count++;
            }
            //if substring at i, ii, iii = dog
            if (str.substring(i, i + 3).equals("dog")) {
                count--;
            }
        }
        //it counts cancel each other out, return true
        //or if count remains 0
        if (count == 0) {
            return true;
        }
        //return false for everything else
        return false;
    }
//4-------------------------------------------------------------


}
