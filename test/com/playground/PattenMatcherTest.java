package com.playground;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PattenMatcherTest {

    @Test
    public void itShouldReturnFalseIfNoOfWordsCountNotSameAsPattern() {
        boolean matched = new PattenMatcher().match("red blue red", "ab");

        assertFalse(matched);
    }

    @Test
    public void itShouldReturnTrueWhenPatternMatches() {

        boolean matched = new PattenMatcher().match("red blue red", "aba");
        assertTrue(matched);

        matched = new PattenMatcher().match("red blue blue", "abb");
        assertTrue(matched);

        matched = new PattenMatcher().match("red blue white", "abc");
        assertTrue(matched);

        matched = new PattenMatcher().match("red red red", "ccc");
        assertTrue(matched);
    }

    @Test
    public void itShouldReturnFalseWhenPatternDoesNotMatch() {
        boolean matched = new PattenMatcher().match("red blue blue", "abc");
        assertFalse(matched);

        matched = new PattenMatcher().match("blue blue blue", "abb");
        assertFalse(matched);

        matched = new PattenMatcher().match("blue red blue", "abb");
        assertFalse(matched);

        matched = new PattenMatcher().match("blue red blue", "aab");
        assertFalse(matched);
    }
}
