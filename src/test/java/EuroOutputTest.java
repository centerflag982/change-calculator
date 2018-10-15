import com.centerflag982.launchcode.changeCalculator.Output.EuroOutput;
import org.junit.Test;

public class EuroOutputTest {

    @Test
    public void printsArrayValues(){
        EuroOutput euroOutput = new EuroOutput();

        int[] testArray = new int[]{1,2,3,4,5,6,7,8};
        euroOutput.printCoinAmounts(testArray);
    }

}
