package Project_Console_Calculator;


import java.util.Scanner;

public class CalculatorMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArabicCalculator arabicCalculator = new ArabicCalculator();
        RomanCalculator romanCalculator = new RomanCalculator();
        int a = 0;

        System.out.println("\nВыбирите какой алькулятор хотите использовать, нажмите цифру 1 - если арабский " +
                "или цифру 2 - если римский ;");
        a = scanner.nextInt();

        if (a == 1){ arabicCalculator.arabicCalculation();}

        if (a == 2){ romanCalculator.romanCalculation();}

    }
}
