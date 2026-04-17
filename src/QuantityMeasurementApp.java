public class QuantityMeasurementApp {

    // ✅ Inner Class
    static class Feet {
        private final double value;

        // Constructor
        public Feet(double value) {
            this.value = value;
        }

        // Getter (optional but useful)
        public double getValue() {
            return value;
        }

        // ✅ Override equals()
        @Override
        public boolean equals(Object obj) {

            // 1. Same reference
            if (this == obj) return true;

            // 2. Null or different type
            if (obj == null || getClass() != obj.getClass()) return false;

            // 3. Cast safely
            Feet other = (Feet) obj;

            // 4. Compare using Double.compare
            return Double.compare(this.value, other.value) == 0;
        }

        // (Optional but recommended)
        @Override
        public int hashCode() {
            return Double.hashCode(value);
        }
    }

    // ✅ Main method
    public static void main(String[] args) {

        Feet f1 = new Feet(1.0);
        Feet f2 = new Feet(1.0);

        System.out.println("Are equal? " + f1.equals(f2));
    }
}