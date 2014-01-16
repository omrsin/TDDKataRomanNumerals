package com.cleteci.tddtest;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;
import junit.framework.TestCase;

/**
 *
 * @author cleteci
 */
public class RomanNumeralsConverterTest extends TestCase {
    public static final RomanNumeralConverter converter = new RomanNumeralConverter();
    
    public RomanNumeralsConverterTest(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }
         
    public void testConvert1() {
        assertEquals(converter.convert(1), "I");
    }
    
    public void testConvert2() {
        assertEquals(converter.convert(2), "II");
    }
    
    public void testConvert3() {
        assertEquals(converter.convert(3), "III");
    }
    
    public void testConvert4() {
       assertEquals(converter.convert(4),"IV");
    }
    
    public void testConvert5() {
        assertEquals(converter.convert(5), "V");
    }
    
    public void testConvert6() {
        assertEquals(converter.convert(6), "VI");
    }
    
    public void testConvert9(){
        assertEquals(converter.convert(9), "IX");
    }
    
    public void testConvert10(){
        assertEquals(converter.convert(10), "X");
    }
    
    public void testConvert11(){
        assertEquals(converter.convert(11), "XI");
    }
    
    public void testConvert19(){
        assertEquals(converter.convert(19), "XIX");
    }
    
    public void testConvert34(){
        assertEquals(converter.convert(34), "XXXIV");
    }
    
    public void testConvert39(){
        assertEquals(converter.convert(39), "XXXIX");
    }
    
    public void testConvert40(){
        assertEquals(converter.convert(40), "XL");
    }
    
    public void testConvert47(){
        assertEquals(converter.convert(47), "XLVII");
    }
    
    public void testConvert50(){
        assertEquals(converter.convert(50), "L");
    }
    
    public void testConvert90(){
        assertEquals(converter.convert(90), "XC");
    }
    
    public void testConvert100(){
        assertEquals(converter.convert(100), "C");
    }
    
    public void testConvert400(){
        assertEquals(converter.convert(400), "CD");
    }
    
    public void testConvert500(){
        assertEquals(converter.convert(500), "D");
    }
    
    public void testConvert900(){
        assertEquals(converter.convert(900), "CM");
    }
    
    public void testConvert1000(){
        assertEquals(converter.convert(1000), "M");
    }
    
    public void testConvert3999(){
        assertEquals(converter.convert(3999), "MMMCMXCIX");
    }
}
