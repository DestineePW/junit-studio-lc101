package test;

import org.junit.Test;

import main.BalancedBrackets;
import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here

//Test 1
    @Test
    public void missingClosingBracket() {
        String spec = "Returns false if missing a closing bracket";
        String testString = "[Hello World";
        Boolean expected = BalancedBrackets.hasBalancedBrackets(testString);
        assertFalse(spec,expected);
    }

    //Test 2
    @Test
    public void extraOpeningBracket() {
        String spec = "Returns false if there is an extra opening bracket";
        String testString = "[[Lift off!]";
        boolean expected = BalancedBrackets.hasBalancedBrackets(testString);
        assertFalse(spec,expected);
    }

    //Test 3
    @Test
    public void bracketsBeforeChars(){
        String spec = "a pair of brackets before all characters returns true";
        String testString = "[] Hello we are characters";
        boolean result = BalancedBrackets.hasBalancedBrackets(testString);
        assertTrue(spec,result);
    }

    //Test 4
    @Test
    public void hasBalancedBrackets(){
        String spec = "An even amount of bracket pairs returns true";
        String testString = "[Even amount][of bracket][pairssss]";
        boolean result = BalancedBrackets.hasBalancedBrackets(testString);
        assertTrue(spec,result);
    }

    //Test 5
    @Test
    public void onlyBracketsReturnsTrue(){
        String spec = "a pair of brackets returns true";
        String testString = "[]";
        boolean result = BalancedBrackets.hasBalancedBrackets(testString);
        assertTrue(spec,result);
    }

    //Test 6
    @Test
    public void mixedInPairsOfBrackets(){
        String spec = "balanced brackets mixed into a string returns true ";
        String testString = "aa]ss[[dd[[ss[dd]]dd[[dd]]ff]]";
        boolean result = BalancedBrackets.hasBalancedBrackets(testString);
        assertTrue(spec,result);
    }

    //Test 7
    @Test
    public void mixedInBrackets(){
        String spec = "uneven brackets mixed into a string returns false";
        String testString = "[d[a[aa]ss[d[dd[[ss[]s]d]ddd]d]dd[d[dd";
        boolean result = BalancedBrackets.hasBalancedBrackets(testString);
        assertFalse(spec,result);
    }
    //Test 8
    @Test
    public void consecutiveBalancedBracketsOnly(){
        String spec = "consecutive balanced brackets returns true";
        String testString = "[][][][]";
        boolean result = BalancedBrackets.hasBalancedBrackets(testString);
        assertTrue(spec,result);
    }

    //Test 9
    @Test
    public void beginsWithClosingBracket(){
        String spec = "A string that begins with a closing bracket and ends with an opening bracket returns false";
        String testString = "][";
        boolean result = BalancedBrackets.hasBalancedBrackets(testString);
        assertFalse(spec,result);
    }

    @Test
    public void unBalancedBracketsOnly(){
        String spec = "unbalanced brackets returns false";
        String testString = "]]";
        boolean result = BalancedBrackets.hasBalancedBrackets(testString);
        assertFalse(spec,result);
    }


    //Test 10
    @Test
    public void balancedBracketsAmongChars(){
        String spec = "balanced brackets among characters returns true";
        String testString = "Theseare[ ]allcharacters";
        boolean result = BalancedBrackets.hasBalancedBrackets(testString);
        assertTrue(spec,result);
    }


    //Test 11
    @Test
    public void noBrackets(){
        String spec = "no brackets at all returns true";
        String testString = "Missouri";
        boolean result = BalancedBrackets.hasBalancedBrackets(testString);
        assertTrue(spec,result);
    }


    //Test 12
 @Test
    public void emptyString(){
       String spec = "empty string returns true";
       String testString = "";
       boolean result = BalancedBrackets.hasBalancedBrackets(testString);
       assertTrue(spec,result);
     }

}
