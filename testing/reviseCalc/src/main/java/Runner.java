public class Runner {

    public static void main(String[] args) {
        
        Calculator calc = new Calculator();
        double currentVal;

        currentVal = calc.add(204352);
        System.out.printf("Current value = %.2f\n", currentVal);

        currentVal = calc.squareRoot();
        System.out.printf("Current value = %.2f\n", currentVal);


        currentVal = calc.add(78);
        System.out.printf("Current value = %.2f\n", currentVal);

        calc.pushMemory();
        System.out.println("Pushed to memory");

        currentVal = calc.multiply(20);
        System.out.printf("Current value = %.2f\n", currentVal);

        currentVal = calc.add(13);
        System.out.printf("Current value = %.2f\n", currentVal);

        currentVal = calc.subtract(50);
        System.out.printf("Current value = %.2f\n", currentVal);

        currentVal = calc.divide(calc.popMemory());
        System.out.printf("Current value = %.2f\n", currentVal);

        currentVal = calc.squareRoot();
        System.out.printf("Current value = %.2f\n", currentVal);

        currentVal = calc.divide(0);
        System.out.printf("Current value = %.2f\n", currentVal);
    }
}