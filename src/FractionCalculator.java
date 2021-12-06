
public class FractionCalculator {

    public FractionCalculator()
    {

    }

    public FractionCalculator(double num2Convert) {

    }

    public static String ConvertToFraction (double num2Convert) {
        String result = "";
        //final int largestDenominator = 16;
        int wholePart = 0;
        int numerator = 0;
        int denominator = 0;
        int[] fractions = {1,2,4,8,16};
          

        wholePart = (int)num2Convert;
        double remainder = Math.round((num2Convert - wholePart) * 10000.0) / 10000.0;
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
            result = wholePart + " " + numerator + "/" + denominator;
        }
        return result;
    }
}