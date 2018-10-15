import com.centerflag982.launchcode.changeCalculator.Output.USDOutput;
import org.junit.Test;

public class USDOutputTest {

    @Test
    public void PrintsArrayValues(){
        USDOutput usdOutput = new USDOutput();

        int[] testArray = new int[]{1,2,3,4,5,6};
        usdOutput.printCoinAmounts(testArray);
    }

}
