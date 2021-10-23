package com.github.singleton06.rotational.cipher;

public class CharacterRotation {
    private static final int A = (int)'A';
    private static final int Z = (int)'Z';
    private static final int a = (int)'a';
    private static final int z = (int)'z';
    private static final int zero = (int)'0';
    private static final int nine = (int)'9';
    
    
    public String rotateCipher(String input, int rotation) { 
        return "";
    }
    
    public char rotateCharacter(char c, int rotation) { 
        int charVal = (int) c;
        int lowerBounds = getLowerBoundsOfCharset(charVal); 
        
        charVal = charVal + rotation - lowerBounds;
        
        return (char) charVal;
    }
    
    private int getLowerBoundsOfCharset(int charVal) { 
        if (isNumerical(charVal)) { 
            return zero;
        } else if(isUpperAlphabetical(charVal)) {
            return A;
        } else if(isLowerAlphabetical(charVal)) {
            return a;
        }
        
        return -1;
    }
    
    private boolean isNumerical(int charVal) { 
        return charVal > zero && charVal < nine;
    }
    
    private boolean isLowerAlphabetical(int charVal) { 
        return charVal > a && charVal < z;
    }
    
    private boolean isUpperAlphabetical(int charVal) {
        return charVal > A && charVal < Z;
    }
}
