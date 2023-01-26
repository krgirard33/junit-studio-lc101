package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    // brackets in the correct order, "[]", return true.
    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }
    @Test
    public void bookendBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[Word up]"));
    }
    @Test
    public void threeBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[]["));
    }
    @Test
    public void middleOfWordsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("The score was [18-23] in the last quarter"));
    }
    @Test
    public void multipleBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[I want a dog] No [But mom!]"));
    }
    @Test
    public void multipleLinesBracketsReturnsTru() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[\n]"));
    }
    @Test
    public void outOfOrderBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[Have you seen something like this '['? I got these ']]', but 0 '['.]"));
    }
    @Test
    public void outOfOrderBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[Have you seen something like this ']'? I got these ']]', but 0 '['.]"));
    }
    @Test
    public void lotsOfOtherBracketTypeThings() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[{}[))(]//?]1234rdnr[/]"));
    }
    @Test
    public void noIdea() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[ [] ] ] [[]"));
    }
    @Test
    public void whyNot() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }
    @Test
    public void nope() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[[[][[]]]]"));
    }
}
