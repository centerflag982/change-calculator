import com.centerflag982.launchcode.changeCalculator.Output.USDOutput;
import org.junit.Test;

public class USDOutputTest {

    @Test
    public void printsArrayValues(){
        USDOutput usdOutput = new USDOutput();

        int[] testArray = new int[]{1,0,3,1,5,1};
        usdOutput.printCoinAmounts(testArray);
    }

}
