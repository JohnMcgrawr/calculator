public class Main {

    public static void main(String[] args) {
        Arithmetic arithmetic = new Arithmetic();
        int baseVal = 0;

        Calculator calculator = new Calculator(arithmetic, baseVal);
        calculator.doStuff();
    }

}