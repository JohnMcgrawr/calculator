import java.util.Scanner;

public class Calculator {

    private Arithmetic arithmetic;
    private int baseVal;
    Scanner scanner = new Scanner(System.in);

    public Calculator(Arithmetic arithmetic, int baseVal) {
        this.arithmetic = arithmetic;
        this.baseVal = baseVal;
    }

    public void doStuff() {
        System.out.println(baseVal);
        System.out.println("Ange ett räknesätt");
        do {
            String answer = scanner.nextLine();
            switch (answer) {
                case "+":
                    System.out.println("ange en siffra");
                    int inputPlus = scanner.nextInt();
                    arithmetic.plus(inputPlus);
                    System.out.println("Ange räknesätt");
                    break;

                case "-":
                    System.out.println("ange en siffra");
                    int inputMinus = scanner.nextInt();
                    arithmetic.minus(inputMinus);
                    System.out.println("Ange räknesätt");
                    break;

                case "*":
                    System.out.println("ange en siffra");
                    int inputGgr = scanner.nextInt();
                    arithmetic.ggr(inputGgr);
                    System.out.println("Ange räknesätt");
                    break;

                case "/":
                    System.out.println("ange en siffra");
                    int inputDelat = scanner.nextInt();
                    arithmetic.delat(inputDelat);
                    System.out.println("Ange räknesätt");
                    break;

                case "=":
                    System.out.println("The awesome miniräknär of doom har räknat ut att slutsumman är" + " " + arithmetic.holderOfNums);
                    return;
            }
        } while (true);

    }
}