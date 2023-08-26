package com.hooper.jenkinsdemo.util;

public class ColorUtil {
    public static final String ANSI_RESET = "\033[0m";

    public static final String ANSI_GREEN = "\033[32m";
    public static final String ANSI_RED = "\033[31m";
    public static final String ANSI_BLUE = "\033[34m";
    public static final String ANSI_YELLOW = "\033[33m";

    public static String getColorString(String text, String color) {

        String ansiColorCode = "";

        switch(color.toLowerCase()) {
            case "green":
                ansiColorCode = ANSI_GREEN;
                break;
            case "red":
                ansiColorCode = ANSI_RED;
                break;
            case "blue":
                ansiColorCode = ANSI_BLUE;
                break;
            case "yellow":
                ansiColorCode = ANSI_YELLOW;
                break;
            default:
                break;
        }

        return ansiColorCode + text + ANSI_RESET;
    }
}
