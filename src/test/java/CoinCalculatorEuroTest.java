import com.centerflag982.launchcode.changeCalculator.CoinCalculatorEuro;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class CoinCalculatorEuroTest {

    @Test
    public void zeroChangeMeansYouGetZeroCoins() {
        CoinCalculatorEuro coinCalculator = new CoinCalculatorEuro();

        int[] testResult = coinCalculator.calculateChange("€0.00");

        assertEquals("[0, 0, 0, 0, 0, 0, 0, 0]", Arrays.toString(testResult));
    }

    @Test
    public void twoEuroGoInIndexZero() {
        CoinCalculatorEuro coinCalculator = new CoinCalculatorEuro();

        int[] testResult = coinCalculator.calculateChange("€10.00");

        assertEquals("[5, 0, 0, 0, 0, 0, 0, 0]", Arrays.toString(testResult));
    }

    @Test
    public void oneEuroGoInIndexOne() {
        CoinCalculatorEuro coinCalculator = new CoinCalculatorEuro();

        int[] testResult = coinCalculator.calculateChange("€1.00");

        assertEquals("[0, 1, 0, 0, 0, 0, 0, 0]", Arrays.toString(testResult));
    }

    @Test
    public void fiftyECGoInIndexTwo() {
        CoinCalculatorEuro coinCalculator = new CoinCalculatorEuro();

        int[] testResult = coinCalculator.calculateChange("€0.50");

        assertEquals("[0, 0, 1, 0, 0, 0, 0, 0]", Arrays.toString(testResult));
    }

    @Test
    public void twentyECGoInIndexThree() {
        CoinCalculatorEuro coinCalculator = new CoinCalculatorEuro();

        int[] testResult = coinCalculator.calculateChange("€0.40");

        assertEquals("[0, 0, 0, 2, 0, 0, 0, 0]", Arrays.toString(testResult));
    }

    @Test
    public void tenECGoInIndexFour() {
        CoinCalculatorEuro coinCalculator = new CoinCalculatorEuro();

        int[] testResult = coinCalculator.calculateChange("€0.10");

        assertEquals("[0, 0, 0, 0, 1, 0, 0, 0]", Arrays.toString(testResult));
    }

    @Test
    public void fiveECGoInIndexFive() {
        CoinCalculatorEuro coinCalculator = new CoinCalculatorEuro();

        int[] testResult = coinCalculator.calculateChange("€0.05");

        assertEquals("[0, 0, 0, 0, 0, 1, 0, 0]", Arrays.toString(testResult));
    }

    @Test
    public void twoECGoInIndexSix() {
        CoinCalculatorEuro coinCalculator = new CoinCalculatorEuro();

        int[] testResult = coinCalculator.calculateChange("€0.04");

        assertEquals("[0, 0, 0, 0, 0, 0, 2, 0]", Arrays.toString(testResult));
    }

    @Test
    public void onECGoInIndexSeven() {
        CoinCalculatorEuro coinCalculator = new CoinCalculatorEuro();

        int[] testResult = coinCalculator.calculateChange("€0.01");

        assertEquals("[0, 0, 0, 0, 0, 0, 0, 1]", Arrays.toString(testResult));
    }


    @Test
    public void mixedTest() {
        CoinCalculatorEuro coinCalculator = new CoinCalculatorEuro();

        int[] testResult = coinCalculator.calculateChange("€0.73");

        assertEquals("[0, 0, 1, 1, 0, 0, 1, 1]", Arrays.toString(testResult));
    }
}
