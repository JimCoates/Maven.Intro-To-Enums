package com.zipcodewilmington.preassessment2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AliceBobEvaluator {
    String input;
    Pattern pattern;
    Matcher matcher;

    public AliceBobEvaluator(String input) {
        this.input = input;
    }

    public boolean isAlice() {
        pattern = Pattern.compile("\\balice\\b", Pattern.CASE_INSENSITIVE);
        matcher = pattern.matcher(input);
        return matcher.matches();
    }

    public boolean isBob() {
        pattern = Pattern.compile("\\bbob\\b", Pattern.CASE_INSENSITIVE);
        matcher = pattern.matcher(input);
        return matcher.matches();
    }
}
