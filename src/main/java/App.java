import java.io.Console;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws IOException {

        //taking int array length from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter Length of int array");
        int arrLength = sc.nextInt();

        // create int array
        int[] integerInputArray = new int[arrLength];

        //fetch user input to save into the created array
        System.out.println("Please enter array elements of type int");
        for (int i = 0; i < arrLength; i++) {
            int userInput = sc.nextInt();
            integerInputArray[i] = userInput;
        }

        System.out.println("The inputted int array is: ");
        System.out.println(integerInputArray);
        if (missingInteger(integerInputArray) == 0){
            System.out.println("There is no missing integer in your array");
        }
        else {
            System.out.println("The missing integer is :");
            System.out.println(missingInteger(integerInputArray));
        }
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
