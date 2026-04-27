// ✅ STATIC ADD METHOD (CORE UC6)
public static QuantityLength add(QuantityLength q1, QuantityLength q2) {

    if (q1 == null || q2 == null) {
        throw new IllegalArgumentException("Operands cannot be null");
    }

    if (!Double.isFinite(q1.value) || !Double.isFinite(q2.value)) {
        throw new IllegalArgumentException("Invalid numeric values");
    }

    // Step 1: Convert both to base (feet)
    double q1Feet = q1.unit.toFeet(q1.value);
    double q2Feet = q2.unit.toFeet(q2.value);

    // Step 2: Add
    double sumFeet = q1Feet + q2Feet;

    // Step 3: Convert back to unit of FIRST operand
    double result = q1.unit.fromFeet(sumFeet);

    return new QuantityLength(result, q1.unit);
}