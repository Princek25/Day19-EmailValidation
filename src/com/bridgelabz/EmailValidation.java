package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.]+$");
        Matcher matcher = pattern.matcher("abc-100@yahoo.com");
        if (matcher.matches()) {
            System.out.println("This is valid Email");
        } else System.out.println("This is invalid Email");
    }
}
