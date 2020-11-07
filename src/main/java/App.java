import java.io.Console;
import java.io.IOException;
import java.util.Arrays;

public class App {
    public static void main(String[] args) throws IOException {

    }

    public static  int missingInteger(int[] arr) {
        //sort the array so as to loop through it
        Arrays.sort(arr);

        int missingInt = 0;

        //initialize integer that increments each time the array is looped through
        // so as to equate with each array int to find missing number
        int count = 0;
        for (int value : arr) {
            //increment count by 1 then check if value is not equals to count, then count is the missing integer
            count += 1;
            if (count != value) {
                missingInt = count;
            }
        }

        return missingInt;
    }
}
