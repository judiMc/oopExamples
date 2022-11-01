public class Calculator {

    private double memory;
    private double currentVal;

    public Calculator() {
        memory = 0.0;
        currentVal = 0.0;
    }

    public double getValue() {
        return currentVal;
    }

    public void pushMemory() {
        memory = currentVal;
    }

    public double popMemory() {
        double currMemory = memory;
        memory = 0;
        return currMemory;
    }

    public double add(double toAdd) {
        currentVal += toAdd;
        return currentVal;
    }

    public double subtract(double toSubtract) {
        currentVal -= toSubtract;
        return currentVal;
    }

    public double multiply(double toMultiply) {
        currentVal *= toMultiply;
        return currentVal;
    }

    public double divide(double divisor) {
        if (divisor != 0) {
            currentVal /= divisor;
        }
        return currentVal;
    }

    // sqrt to 2 decimal places any number >= 1
    public double squareRoot() {
        
        if (currentVal < 1) {
            currentVal = 0;
            return currentVal;
        }

        double high = currentVal;
        double low = 0;
        double middle;

        while (low <= high) {
            middle = low + (high - low) / 2;

            if (middle * middle < currentVal) {
                low = middle + 0.001;
            } else if (middle * middle > currentVal) {
                high = middle - 0.001;
            }
        }
        
        currentVal = high;
        return currentVal;
    }
}