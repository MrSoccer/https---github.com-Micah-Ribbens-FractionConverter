public class CalculatorTester {
    public static void main(String[] args) {
        Boolean tenthsResult = false;
        Boolean sixteenthResult = false;
        Boolean reverseMath = false;
        Boolean randomInputResult = false;
        Boolean boundryInputResult = false;
        Boolean negativeInputResult = false;

        tenthsResult = TestTenths();
        sixteenthResult = TestSixteenths();
        reverseMath = TestCalculateInputFromResult();
        randomInputResult = TestRandomValues();
        boundryInputResult = TestBoundryConditions();
        negativeInputResult = TestNegativeValues();
        
        if( tenthsResult &&  sixteenthResult &&  reverseMath &&  randomInputResult &&  boundryInputResult &&  negativeInputResult )
        {
            System.out.println("Congratulations, your Fraction Calculator works as expected");
        }
        else {
            System.out.println("Sorry, your Fraction Calculator or your tests still needs a little work");
        }
    }

    //  This test should call the fraction calculator with a series of negative number and verify the result are accurate
    private static Boolean TestNegativeValues() {
        return false;
    }

    //  This test should call the fraction calculator with inputs that represent calculation boundries and verify the results.
    //  Examples of boundries could be things like 0.1251,  1.06257, 0.0, 1.00003.
    //  Basically a variety of things to test edge conditions and resolution of the result 
    private static Boolean TestBoundryConditions() {
        return false;
    }

    //  This is more of a stress test.  Within a loop generate a large number of random values within the expected input range
    //  and use those inputs to test the fraction convertor.  
    //  
    private static Boolean TestRandomValues() {
        return false;
    }

    //  This test will take any resulting fractions, convert them back into a decimal for comparision with the input.
    //  Passing test will verify the resulting fraction can be converted back to a decimal number equal to the original value.
    //  Example - input of 7.25 would return a value of 7 1/4 which would then be calcuated  as 7+1/4 equaling 7.25 which equals the input
    private static Boolean TestCalculateInputFromResult() {
        return false;
    }

    //  This is similar to the TestTenths example provided.  
    // This test will verify decimals representing a fraction with a denominator of 16 are properly calculated
    //  Anything devisable by 16 should pass, even if it is a simpler number (8/16 should return as 1/2 but and is a passing result)
    private static Boolean TestSixteenths() {
        return false;
    }

    public static Boolean TestTenths() {
        int good = 0;
        int bad = 0;
        Boolean bResult = false;
        String answer = "";

        for (double numberToTest = 0; numberToTest <= 1; numberToTest += 0.1){
            answer = FractionCalculator.ConvertToFraction(numberToTest);
            if (answer == "") {
                bad++;
            }
            else if ( answer.length() >= 1) {
                good++;
            }
        }
        System.out.println("Test result was " + good + " good results and " + bad + " bad results");
        if ( good == 2 && bad == 9) {
            bResult = true;
        }
        return bResult;
    }
}
