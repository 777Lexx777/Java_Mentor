package Project_Console_Calculator;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class RomanCalculator  {

    ListForRomanCalculator listForRomanCalculator = new ListForRomanCalculator();
    private String[] subRom;
    private String a;
    private String b;
    private String strRom = null;
    private String contRom ;

    public  void   romanCalculation(){

        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("\n  Введите операцию с двумя числами: a + b, a - b, a * b или a / b " +
                    "\n  ВНИМАНИЕ: числа от  'I'<-(эта буква I) до 'X' (ВСЕ БУКВЫ ЗАГЛАВНЫЕ) ;");

            strRom = scanner.nextLine();

            if (strRom.contains("-")) subRom = strRom.split("-");

            if (strRom.contains("/")) subRom = strRom.split("/");

            if (strRom.contains("+")) subRom = strRom.split("\\+");

            if (strRom.contains("*")) subRom = strRom.split("\\*");

            a = subRom[0];
            b = subRom[1];

            try {
                if (! (a.equals(listForRomanCalculator.calculatorNumberRoman(a)))){
                    throw new Exception("Числa  должны быть от  'I'<-(эта буква I) до 'X' (ВСЕ БУКВЫ ЗАГЛАВНЫЕ) ");
                }
            } catch (Exception e) {
                e.printStackTrace();
                break;
            }
            try {
                if (! (b.equals(listForRomanCalculator.calculatorNumberRoman(b)))){
                    throw new Exception("Числa  должны быть от  'I'<-(эта буква I) до 'X' (ВСЕ БУКВЫ ЗАГЛАВНЫЕ) ");
                }
            } catch (Exception e) {
                e.printStackTrace();
                break;
            }

            if (strRom.contains("-")) {
                int s = listForRomanCalculator.calculatorNumberArabic(a) -
                        listForRomanCalculator.calculatorNumberArabic(b);
                String result = arabicToRoman( s);
                System.out.print("   Input: " + "\n\n   " + a + " " + " - " + " " + b);
                System.out.println("\n\n   Output: " + "\n\n   " + result);
            }
            if (strRom.contains("/")) {
                int s = listForRomanCalculator.calculatorNumberArabic(a) /
                        listForRomanCalculator.calculatorNumberArabic(b);
                String result = arabicToRoman( s);
                System.out.print("   Input: " + "\n\n   " + a + " " + " / " + " " + b);
                System.out.println("\n\n   Output: " + "\n\n   " + result);
            }
            if (strRom.contains("+")) {
                int s = listForRomanCalculator.calculatorNumberArabic(a) +
                        listForRomanCalculator.calculatorNumberArabic(b);
                String result = arabicToRoman( s);
                System.out.print("   Input: " + "\n\n   " + a + " " + " + " + " " + b);
                System.out.println("\n\n   Output: " + "\n\n   " + result);
            }
            if (strRom.contains("*")) {
                int s = listForRomanCalculator.calculatorNumberArabic(a) *
                        listForRomanCalculator.calculatorNumberArabic(b);
                String result = arabicToRoman( s);
                System.out.print("   Input: " + "\n\n   " + a + " " + " * " + " " + b);
                System.out.println("\n\n   Output: " + "\n\n   " + result);
            }

            System.out.print("\n  Закончить вычисления нажмите - q или Q ; " +
                    "\n  Для продолжения вычисления, нажмите любую другую клавишу;  ");

            contRom = scanner.next();
            if (contRom.equalsIgnoreCase("q")) break;
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
