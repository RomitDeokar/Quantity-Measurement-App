package com.quantity;

public class QuantityMeasurementApp {

    public static void main(String[] args) {

        QuantityLength q1 = new QuantityLength(1.0, LengthUnit.FEET);
        QuantityLength q2 = new QuantityLength(12.0, LengthUnit.INCHES);

        // Convert
        System.out.println(q1.convertTo(LengthUnit.INCHES));

        // Add (default)
        System.out.println(q1.add(q2));

        // Add with target
        System.out.println(QuantityLength.add(q1, q2, LengthUnit.YARDS));

        // Equality
        System.out.println(q1.equals(q2));
    }
}