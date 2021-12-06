import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App {

    public static void main(String[] args) throws Exception {
        String answer = "";
    
        // Create a buffer, prompt the user for information and read in the line of text they type
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a decimal number, it will be converted to a fraction");
        String sNumberInput = reader.readLine();
        double dNumberInput = Double.parseDouble(sNumberInput);

        answer = FractionCalculator.ConvertToFraction(dNumberInput);

        if ( answer != "" ){
            System.out.println("Your number as a fraction is " + answer);
        }
        else {
            System.out.println("Your number did not contain a fraction accurate within 1/16 of an inch");
        }
    }                              
    
    public static void main_Q1(String[] args) throws Exception {

        final int largestDenominator = 16;
        int wholePart = 0;
        int numerator = 0;
        int denominator = 0;
        
        // Create a buffer, prompt the user for information and read in the line of text they type
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a decimal number, it will be converted to a fraction");
        String sNumberInput = reader.readLine();
        double dNumberInput = Double.parseDouble(sNumberInput);

        wholePart = (int)dNumberInput;
        double remainder = Math.round((dNumberInput - wholePart) * 10000.0) / 10000.0;
        int[] fractions = {1,2,4,8,16};
        for (int i : fractions) {
        //for (int i = 1; i <= largestDenominator; i++) {
            double roundedWholeNumber = (remainder * i) % 1;
            if ( roundedWholeNumber == 0.00000) {
                numerator = (int)(remainder * i );
                denominator = i;
                break;    
            }
        }

        if ( numerator != 0 && denominator != 0 ){
            System.out.println("Your number as a fraction is " + wholePart + " " + numerator + "/" + denominator);
        }
        else {
            System.out.println("Your number did not contain a fraction accurate within 1/16 of an inch");
        }
    }                              
}

