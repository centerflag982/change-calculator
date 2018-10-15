import com.centerflag982.launchcode.changeCalculator.Calculators.CoinCalculatorUSD;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class CoinCalculatorUSDTest {

    @Test
    public void zeroChangeMeansYouGetZeroCoins() {
        CoinCalculatorUSD coinCalculator = new CoinCalculatorUSD();

        int[] testResult = coinCalculator.calculateChange("$0.00");

        assertEquals("[0, 0, 0, 0, 0, 0]", Arrays.toString(testResult));
    }

    @Test
    public void dollarsGoInIndexZero() {
        CoinCalculatorUSD coinCalculator = new CoinCalculatorUSD();

        int[] testResult = coinCalculator.calculateChange("$14.00");

        assertEquals("[14, 0, 0, 0, 0, 0]", Arrays.toString(testResult));
    }

    @Test
    public void halfDollarsGoInIndexOne() {
        CoinCalculatorUSD coinCalculator = new CoinCalculatorUSD();

        int[] testResult = coinCalculator.calculateChange("$0.50");

        assertEquals("[0, 1, 0, 0, 0, 0]", Arrays.toString(testResult));
    }

    @Test
    public void quartersGoInIndexTwo() {
        CoinCalculatorUSD coinCalculator = new CoinCalculatorUSD();

        int[] testResult = coinCalculator.calculateChange("$0.25");

        assertEquals("[0, 0, 1, 0, 0, 0]", Arrays.toString(testResult));
    }

    @Test
    public void dimesGoInIndexThree() {
        CoinCalculatorUSD coinCalculator = new CoinCalculatorUSD();

        int[] testResult = coinCalculator.calculateChange("$0.10");

        assertEquals("[0, 0, 0, 1, 0, 0]", Arrays.toString(testResult));
    }

    @Test
    public void nickelsGoInIndexFour() {
        CoinCalculatorUSD coinCalculator = new CoinCalculatorUSD();

        int[] testResult = coinCalculator.calculateChange("$0.05");

        assertEquals("[0, 0, 0, 0, 1, 0]", Arrays.toString(testResult));
    }

    @Test
    public void penniesGoInIndexFive() {
        CoinCalculatorUSD coinCalculator = new CoinCalculatorUSD();

        int[] testResult = coinCalculator.calculateChange("$0.04");

        assertEquals("[0, 0, 0, 0, 0, 4]", Arrays.toString(testResult));
    }

    @Test
    public void mixedTest() {
        CoinCalculatorUSD coinCalculator = new CoinCalculatorUSD();

        int[] testResult = coinCalculator.calculateChange("$0.76");

        assertEquals("[0, 1, 1, 0, 0, 1]", Arrays.toString(testResult));
    }
}
