package com.cleteci.tddtest;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author cleteci
 */
public class RomanNumeralConverter {
    
    private String[] ROMAN_DIGITS = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
    private int[] NUMERIC_DIGIT = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
    
    public RomanNumeralConverter() {
    }

    public String convert(int numeral) {
        String romanNumeral = "";
        
        for(int i=0; i< ROMAN_DIGITS.length; i++){
            while(numeral >= NUMERIC_DIGIT[i]){
                romanNumeral += ROMAN_DIGITS[i];
                numeral -= NUMERIC_DIGIT[i];
            }
        }       
        
        return romanNumeral;
    }
}
