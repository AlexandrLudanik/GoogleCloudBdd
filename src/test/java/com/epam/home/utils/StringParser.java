package com.epam.home.utils;

public class StringParser {

    public static double getDoubleFromString(String name){
        return Double.parseDouble((name.replaceAll("[^\\d.]", ""))
                .substring(0, (name.replaceAll("[^\\d.]", "")).length()-1));
    }

    public static double getDoubleFromLetter(String name){
        return Double.parseDouble((name.replaceAll("[^\\d.]", "")));
    }
}
