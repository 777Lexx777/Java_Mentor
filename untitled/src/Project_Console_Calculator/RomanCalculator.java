package Project_Console_Calculator;

import java.util.List;

public class RomanCalculator  {

    public  void   romanCalculation(String a,String b, String calculator){

        ListForRomanCalculator listForRomanCalculator = new ListForRomanCalculator();

            if (calculator.contains("-")) {
                Integer s = listForRomanCalculator.calculatorNumberArabic(a) -
                            listForRomanCalculator.calculatorNumberArabic(b);
                String result = arabicToRoman( s);
                System.out.print("   Input: " + "\n\n   " + a + " " + " - " + " " + b);
                System.out.println("\n\n   Output: " + "\n\n   " + result);
            }
            if (calculator.contains("/")) {
                Integer s = listForRomanCalculator.calculatorNumberArabic(a) /
                            listForRomanCalculator.calculatorNumberArabic(b);
                String result = arabicToRoman( s);
                System.out.print("   Input: " + "\n\n   " + a + " " + " / " + " " + b);
                System.out.println("\n\n   Output: " + "\n\n   " + result);
            }
            if (calculator.contains("+")) {
                Integer s = listForRomanCalculator.calculatorNumberArabic(a) +
                            listForRomanCalculator.calculatorNumberArabic(b);
                String result = arabicToRoman( s);
                System.out.print("   Input: " + "\n\n   " + a + " " + " + " + " " + b);
                System.out.println("\n\n   Output: " + "\n\n   " + result);
            }
            if (calculator.contains("*")) {
                Integer s = listForRomanCalculator.calculatorNumberArabic(a) *
                            listForRomanCalculator.calculatorNumberArabic(b);
                String result = arabicToRoman( s);
                System.out.print("   Input: " + "\n\n   " + a + " " + " * " + " " + b);
                System.out.println("\n\n   Output: " + "\n\n   " + result);
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
