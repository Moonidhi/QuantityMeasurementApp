package com.apps.quantitymeasurement;

public class QuantityMeasurementApp {

    public static void demonstrateLengthEquality(Length l1, Length l2) {
        System.out.println("Are equal? " + l1.equals(l2));
    }

    public static void main(String[] args) {

        Length length1 = new Length(1.0, Length.LengthUnit.FEET);
        Length length2 = new Length(12.0, Length.LengthUnit.INCHES);

        demonstrateLengthEquality(length1, length2);
    }
}