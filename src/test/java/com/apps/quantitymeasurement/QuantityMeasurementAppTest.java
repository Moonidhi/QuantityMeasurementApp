package com.apps.quantitymeasurement;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class QuantityMeasurementAppTest {

    @Test
    public void testFeetEquality() {
        Length l1 = new Length(1.0, Length.LengthUnit.FEET);
        Length l2 = new Length(1.0, Length.LengthUnit.FEET);
        assertTrue(l1.equals(l2));
    }

    @Test
    public void testFeetToInchesEquality() {
        Length l1 = new Length(1.0, Length.LengthUnit.FEET);
        Length l2 = new Length(12.0, Length.LengthUnit.INCHES);
        assertTrue(l1.equals(l2));
    }

    @Test
    public void testYardToFeetEquality() {
        Length l1 = new Length(1.0, Length.LengthUnit.YARDS);
        Length l2 = new Length(3.0, Length.LengthUnit.FEET);
        assertTrue(l1.equals(l2));
    }

    @Test
    public void testYardToInchesEquality() {
        Length l1 = new Length(1.0, Length.LengthUnit.YARDS);
        Length l2 = new Length(36.0, Length.LengthUnit.INCHES);
        assertTrue(l1.equals(l2));
    }

    @Test
    public void testCentimeterToInchesEquality() {
        Length l1 = new Length(1.0, Length.LengthUnit.CENTIMETERS);
        Length l2 = new Length(0.393701, Length.LengthUnit.INCHES);
        assertTrue(l1.equals(l2));
    }

    @Test
    public void testNotEqual() {
        Length l1 = new Length(1.0, Length.LengthUnit.FEET);
        Length l2 = new Length(2.0, Length.LengthUnit.FEET);
        assertFalse(l1.equals(l2));
    }

    @Test
    public void testConversionFeetToInches() {
        Length result = QuantityMeasurementApp
                .demonstrateLengthConversion(1.0,
                        Length.LengthUnit.FEET,
                        Length.LengthUnit.INCHES);

        assertTrue(result.equals(new Length(12.0, Length.LengthUnit.INCHES)));
    }

    @Test
    public void testConversionYardsToInches() {
        Length result = QuantityMeasurementApp
                .demonstrateLengthConversion(2.0,
                        Length.LengthUnit.YARDS,
                        Length.LengthUnit.INCHES);

        assertTrue(result.equals(new Length(72.0, Length.LengthUnit.INCHES)));
    }

    @Test
    public void testOverloadedConversion() {
        Length input = new Length(1.0, Length.LengthUnit.FEET);
        Length result = QuantityMeasurementApp
                .demonstrateLengthConversion(input,
                        Length.LengthUnit.INCHES);

        assertTrue(result.equals(new Length(12.0, Length.LengthUnit.INCHES)));
    }

    @Test
    public void testNullComparison() {
        Length l1 = new Length(1.0, Length.LengthUnit.FEET);
        assertFalse(l1.equals(null));
    }

    @Test
    public void testSameReference() {
        Length l1 = new Length(1.0, Length.LengthUnit.FEET);
        assertTrue(l1.equals(l1));
    }

    @Test
    public void testDifferentClass() {
        Length l1 = new Length(1.0, Length.LengthUnit.FEET);
        assertFalse(l1.equals("test"));
    }
}