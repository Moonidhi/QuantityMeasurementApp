package com.apps.quantitymeasurement;

public class Length {

    private final double value;
    private final LengthUnit unit;

    public enum LengthUnit {
        FEET(12.0),
        INCHES(1.0),
        YARDS(36.0),
        CENTIMETERS(0.393701);

        private final double conversionFactor;

        LengthUnit(double conversionFactor) {
            this.conversionFactor = conversionFactor;
        }

        public double getConversionFactor() {
            return conversionFactor;
        }
    }

    public Length(double value, LengthUnit unit) {
        if (unit == null) {
            throw new IllegalArgumentException("Unit cannot be null");
        }
        if (!Double.isFinite(value)) {
            throw new IllegalArgumentException("Invalid value");
        }
        this.value = value;
        this.unit = unit;
    }

    private double toInches() {
        return this.value * this.unit.getConversionFactor();
    }

    public Length convertTo(LengthUnit targetUnit) {
        if (targetUnit == null) {
            throw new IllegalArgumentException("Target unit cannot be null");
        }

        double inches = this.toInches();
        double converted = inches / targetUnit.getConversionFactor();

        return new Length(converted, targetUnit);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Length other = (Length) obj;
        return Double.compare(this.toInches(), other.toInches()) == 0;
    }

    @Override
    public int hashCode() {
        return Double.hashCode(toInches());
    }

    @Override
    public String toString() {
        return String.format("%.2f %s", value, unit);
    }
}