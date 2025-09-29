public class Calculator {
    private double result;

    public Calculator() {
        this.result = 0;
    }

    public double add(double num) {
        this.result += num;
        return this.result;
    }

    public double subtract(double num) {
        this.result -= num;
        return this.result;
    }

    public double multiply(double num) {
        this.result *= num;
        return this.result;
    }

    public double divide(double num) {
        if (num == 0) {
            throw new ArithmeticException("Cannot divide by zero!");
        }
        this.result /= num;
        return this.result;
    }

    public void clear() {
        this.result = 0;
    }

    public double getResult() {
        return this.result;
    }
}