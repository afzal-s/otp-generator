package com.learning.examples;

import java.util.Random;

public class ExampleOne {
    public static void main(String[] args) {
        int lengthOfOneTimePassword = 6;
        char[] oneTimePassword = oneTimePassword(lengthOfOneTimePassword);
        System.out.println(oneTimePassword);
    }

    private static char[] oneTimePassword(int lengthOfOneTimePassword) {
        String randomHardcodedNumbers = "0123456789";
        Random randomNumber = new Random();
        char[] generatedOneTimePassword = new char[lengthOfOneTimePassword];
        for (int index = 0; index < lengthOfOneTimePassword; index++) {
            generatedOneTimePassword[index] = randomHardcodedNumbers
                    .charAt(randomNumber.nextInt(randomHardcodedNumbers.length()));
        }
        return generatedOneTimePassword;
    }
}