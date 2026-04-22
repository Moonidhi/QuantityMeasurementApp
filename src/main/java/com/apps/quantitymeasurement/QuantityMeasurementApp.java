package com.apps.quantitymeasurement;

public class QuantityMeasurementApp {

    public static Length demonstrateLengthConversion(double value,
                                                     Length.LengthUnit fromUnit,
                                                     Length.LengthUnit toUnit) {

        Length length = new Length(value, fromUnit);
        return length.convertTo(toUnit);
    }

    public static Length demonstrateLengthConversion(Length length,
                                                     Length.LengthUnit toUnit) {

        return length.convertTo(toUnit);
    }

    public static boolean demonstrateLengthEquality(Length l1, Length l2) {
        return l1.equals(l2);
    }
}