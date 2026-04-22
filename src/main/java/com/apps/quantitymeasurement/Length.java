package com.apps.quantitymeasurement;

public class Length {

    private double value;
    private LengthUnit unit;

    // Enum for units
    public enum LengthUnit {
        FEET(12.0),
        INCHES(1.0);

        private final double conversionFactor;

        LengthUnit(double conversionFactor) {
            this.conversionFactor = conversionFactor;
        }

        public double getConversionFactor() {
            return conversionFactor;
        }
    }

    // Constructor
    public Length(double value, LengthUnit unit) {
        this.value = value;
        this.unit = unit;
    }

    // Convert to base unit (inches)
    private double toInches() {
        return this.value * unit.getConversionFactor();
    }

    // Compare method
    public boolean compare(Length other) {
        return Double.compare(this.toInches(), other.toInches()) == 0;
    }

    // equals override
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Length other = (Length) obj;
        return this.compare(other);
    }

    @Override
    public int hashCode() {
        return Double.hashCode(toInches());
    }
}