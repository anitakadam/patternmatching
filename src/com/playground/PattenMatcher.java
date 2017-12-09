package com.playground;

import java.util.HashMap;
import java.util.Map;

public class PattenMatcher {

    public static final String SPACE = " ";

    public Boolean match(String text, String pattern) {
        String[] words = text.split(SPACE);
        Map<String, Character> patternWords = new HashMap<>();

        if (words.length != pattern.length()) {
            return false;
        }
        for (int i = 0; i < words.length; i++) {

            String word = words[i];
            char patternChar = pattern.charAt(i);

            if (patternWords.containsKey(word) &&
                    patternWords.get(word).charValue() != patternChar) {
                return false;
            }

            if(!patternWords.containsKey(word) && pattern.indexOf(patternChar) != i) {
                return false;
            }
            patternWords.put(word, patternChar);

        }
        return true;
    }
}
