package Project_Console_Calculator;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class RomanCalculator  {

    ListForRomanCalculator listForRomanCalculator = new ListForRomanCalculator();
    Scanner scanner = new Scanner(System.in);
    private String operation = null;
    private String y = null;
    private String z = null;
    private int cont = 0;

    public  void   romanCalculation(){

        while (true) {
            System.out.println("Введите первое число от 'I'<-(эта буква I) до 'X' (ВСЕ БУКВЫ ЗАГЛАВНЫЕ) ;");
                try {
                    y = scanner.next();
                        while (! (y.equals(listForRomanCalculator.calculatorNumberRoman(y)))){
                            System.out.println("Вы ввели не верное значение... ");
                            System.out.println("Введите первое число от 'I'<-(эта буква I) до 'X' (ВСЕ БУКВЫ ЗАГЛАВНЫЕ) ;");
                            y = scanner.next();
                        }
                } catch (InputMismatchException e) { }

            System.out.println("\nДалее выберите действие: +, -, * или / ;");
                operation = scanner.next();
                    while (! (operation.equals("+") || operation.equals("-") ||
                            operation.equals("*") || operation.equals("/"))) {
                        System.out.println("Вы ввели не верное значение ");
                        System.out.println("Введите действие: +, -, * или / ;");
                        operation = scanner.next();
                    }

            System.out.println("Введите второе число от 'I'<-(эта буква I) до 'X' (ВСЕ БУКВЫ ЗАГЛАВНЫЕ) ");
                try {
                    z = scanner.next();
                        while (! (z.equals(listForRomanCalculator.calculatorNumberRoman(z)))){
                            System.out.println("Вы ввели не верное значение... ");
                            System.out.println("Введите второе число от 'I'<-(эта буква I) до 'X' (ВСЕ БУКВЫ ЗАГЛАВНЫЕ) ;");
                            z = scanner.next();
                        }
                } catch (InputMismatchException e) {  }

            System.out.print("\n   Input: " + "\n\n   " + y + " " + operation + " " + z );

            if (operation.equals("+")) {
                int s = listForRomanCalculator.calculatorNumberArabic(y) +
                        listForRomanCalculator.calculatorNumberArabic(z);
                String result = arabicToRoman( s);
                System.out.println("\n\n   Output: " + "\n\n   " + result);
            }
            if (operation.equals("-")) {
                int s = listForRomanCalculator.calculatorNumberArabic(y) -
                        listForRomanCalculator.calculatorNumberArabic(z);
                String result = arabicToRoman( s);
                System.out.println("\n\n   Output: " + "\n\n   " + result);
            }
            if (operation.equals("*")) {
                int s = listForRomanCalculator.calculatorNumberArabic(y) *
                        listForRomanCalculator.calculatorNumberArabic(z);
                String result = arabicToRoman( s);
                System.out.println("\n\n   Output: " + "\n\n   " + result);
            }
            if (operation.equals("/")) {
                int s = listForRomanCalculator.calculatorNumberArabic(y) /
                        listForRomanCalculator.calculatorNumberArabic(z);
                String result = arabicToRoman( s);
                System.out.println("\n\n   Output: " + "\n\n   " + result);
            }

            System.out.print("\n  Закончить вычисления нажмите - 2 ; " +
                    "\n  Для продолжения вычисления, нажмите любую другую клавишу;  ");

            cont = scanner.nextInt();
            if (cont == 2) {break;}
        }
    }

    public  String arabicToRoman(int number) {
        if ((number <= 0) || (number > 4000)) {
            throw new IllegalArgumentException(number + " is not in range (0,4000]");
        }
        List<RomanNumber> romanNumerals = RomanNumber.getReverseSortedValues();
        int i = 0;
        StringBuilder sb = new StringBuilder();

        while ((number > 0) && (i < romanNumerals.size())) {
            RomanNumber currentSymbol = romanNumerals.get(i);
            if (currentSymbol.getValue() <= number) {
                sb.append(currentSymbol.name());
                number -= currentSymbol.getValue();
            } else {
                i++;
            }
        }
        return sb.toString();
    }
}
