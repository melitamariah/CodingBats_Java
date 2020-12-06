package com.DreamCorp;

public class String1 {
//1
    /*
    Given a string name, e.g. "Bob", return a greeting of
    the form "Hello Bob!".

    helloName("Bob") → "Hello Bob!"
    helloName("Alice") → "Hello Alice!"
    helloName("X") → "Hello X!"
     */

    public String helloName(String name) {
        //return hello + name
        return "Hello " + name + "!";
    }
//2-------------------------------------------------------------
    /*
    Given two strings, a and b, return the result of putting
    them together in the order abba, e.g. "Hi" and "Bye"
    returns "HiByeByeHi".

    makeAbba("Hi", "Bye") → "HiByeByeHi"
    makeAbba("Yo", "Alice") → "YoAliceAliceYo"
    makeAbba("What", "Up") → "WhatUpUpWhat"
     */

    public String makeAbba(String a, String b) {

        return a + b + b + a;
    }
//3-------------------------------------------------------------
    /*
    The web is built with HTML strings like "<i>Yay</i>" which
    draws Yay as italic text. In this example, the "i" tag makes
    <i> and </i> which surround the word "Yay". Given tag and
    word strings, create the HTML string with tags around the
    word, e.g. "<i>Yay</i>".

    makeTags("i", "Yay") → "<i>Yay</i>"
    makeTags("i", "Hello") → "<i>Hello</i>"
    makeTags("cite", "Yay") → "<cite>Yay</cite>"
     */
    public String makeTags(String tag, String word) {

        return "<" + tag + ">" + word + "</" + tag + ">";
    }
//4-------------------------------------------------------------
    /*
    Given an "out" string length 4, such as "<<>>", and a word,
    return a new string where the word is in the middle of the
    out string, e.g. "<<word>>". Note: use str.substring(i, j)
    to extract the String starting at index i and going up to
    but not including index j.

    makeOutWord("<<>>", "Yay") → "<<Yay>>"
    makeOutWord("<<>>", "WooHoo") → "<<WooHoo>>"
    makeOutWord("[[]]", "word") → "[[word]]"
    */

    public String makeOutWord(String out, String word) {

        return out.substring(0,2) + word + out.substring(2);
    }
//5-------------------------------------------------------------
    /*
    Given a string of even length, return the first half.
    So the string "WooHoo" yields "Woo".

    firstHalf("WooHoo") → "Woo"
    firstHalf("HelloThere") → "Hello"
    firstHalf("abcdef") → "abc"
     */

    public String firstHalf(String str) {

        int splitIndex = (str.length()/2);
        String firstThree = "";

        for(int i = 0; i < splitIndex; i++) {
            firstThree += str.charAt(i);
        }
        return firstThree;
    }

    /*
    ----OR (W/O for-i Loop)--------
    int half = str.length() / 2;
    return str.substring(0, half);
     */
//6-------------------------------------------------------------
    /*
    Given 2 strings, a and b, return a string of the form
    short+long+short, with the shorter string on the outside
    and the longer string on the inside. The strings will not
    be the same length, but they may be empty (length 0).

    comboString("Hello", "hi") → "hiHellohi"
    comboString("hi", "Hello") → "hiHellohi"
    comboString("aaa", "b") → "baaab"
     */
    public String comboString(String a, String b) {

        if(a.length() > b.length()) {
            return b + a + b;
        } else {
            return a + b + a;
        }
    }


}

