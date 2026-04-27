package com.quantity;

public enum LengthUnit {

    FEET(1.0),
    INCHES(1.0 / 12.0),
    YARDS(3.0),
    CENTIMETERS(1.0 / 30.48);

    private final double conversionFactorToFeet;

    LengthUnit(double factor) {
        this.conversionFactorToFeet = factor;
    }

    // Convert ANY unit → BASE (feet)
    public double convertToBaseUnit(double value) {
        return value * conversionFactorToFeet;
    }

    // Convert BASE (feet) → ANY unit
    public double convertFromBaseUnit(double baseValue) {
        return baseValue / conversionFactorToFeet;
    }

    public double getConversionFactor() {
        return conversionFactorToFeet;
    }
}