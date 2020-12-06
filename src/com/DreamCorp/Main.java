package com.DreamCorp;

public class Main {

    public static boolean catDog(String str) {
            int catCount = 0;
            int dogCount = 0;

            if(str.length() < 7 && !str.contains("cat") || !str.contains("dog")) {
                return true;
            }

            for(int i = 0; i < str.length() - 2; i++) {
                if(str.substring(i, i + 3).equals("cat")) {
                    catCount++;
                    i = i + 2;
                } else if(str.substring(i, i + 3).equals("dog")) {
                    dogCount++;
                    i = i + 2;
                }
            }
            return dogCount == catCount;
        }

    public static void main(String[] args) {

        System.out.println(catDog("1cat1cadodog"));
    }
}
