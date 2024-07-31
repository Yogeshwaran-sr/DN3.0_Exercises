package FinancialForecasting;

public class TestClass {
    public static double calculate(double currentValue, double growth, int time) {
        if (time == 0) {
            return currentValue;
        }

        return calculate(currentValue * (1 + growth), growth, time - 1);
    }

    public static void main(String[] args) {
        double initial = 4000.0;
        double growth = 0.05;
        int time = 10;

        double futureValue = calculate(initial, growth, time);
        System.out.println("the future value of investment " + futureValue);
    }
}
