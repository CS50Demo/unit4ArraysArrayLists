import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class CommonArrayAlgorithms
{
    /*
     * Create array of the specified size filled with
     *      random values based on the maximum value.
     */
    public static int[] createRandomArray( int length, int maxValue )
    {
        int[] randomArray = new int[ length ];
        for( int i = 0; i < randomArray.length; i++ )
        {
            randomArray[ i ] = (int)( Math.random() * maxValue );
        }

        return randomArray;
    }

    /*
     * Prints the specified array to System.out
     */
    public static void printArray( int[] array )
    {
        System.out.println( Arrays.toString( array ));
    }

    /*
     * Array Algorithm #1: Sum and Average
     *  creates an array filled with random numbers
     *  calculates the sum and average of the numbers
     *  prints the array and the sum and average
     */
    public static void sumAndAverage()
    {
        double sum = 0;
        double average = 0;
        int count = 0;

        int[] array = createRandomArray( 10, 50 );

        for( int i = 0; i < array.length; i++ )
        {
            sum += array[ i ];
            count++;
        }

        average = sum / count;

        printArray( array );
        System.out.println( "sum: " + sum + " average: " + average );
    }

    /*
     * Array Algorithm #2: Print Element Separators
     *  creates an array filled with random numbers
     *  prints each element of the array with a '|' between each element
     *      but not at the beginning or end of the array
     * 
     * BLUE GROUP
     */
    public static void printElementSeparators()
    {
        int length = 10;
        int maxValue = 10;
        int[] randNums = createRandomArray(length, maxValue);
        for(int i = 0;
        i < randNums.length;
        i++)
        {
            System.out.print(randNums[i]);
            if(i < randNums.length - 1)
            {
                System.out.print(" | ");
            }

        }
    }

    /*
     * Array Algorithm #3: Linear Search
     *  creates an array filled with random numbers
     *  find the index of the first element with the specified value
     *  prints the array and the index
     * 
     * GREEN GROUP
     */
    public static void linearSearch( int valueToFind )
    {

        Scanner s = new Scanner(System.in);

        System.out.print("What is the max number?: ");
        int maxNum = s.nextInt();
        System.out.print("How many items in the array?: ");
        int length = s.nextInt();
        System.out.println();

        int[] array1 = createRandomArray(length, maxNum);
        int numPos = 0;
        int firstTime = 0;

        System.out.print("Array = {");

        for (int i = 0; i < array1.length; i++)
        {
            if (i != array1.length - 1)
            {
                System.out.print(array1[i] + ", ");
            } else {
                System.out.print(array1[i]);
            }
            if (valueToFind == array1[i] && firstTime == 0)
            {
                firstTime++;
                numPos = i;
            }
        }
        System.out.print("}\n\narray1[ " + numPos + " ]");
    }

    /*
     * Array Algorithm #4: Prompting until a Match Is Found
     *  creates an array filled with random numbers
     *  prints the array
     *  swaps the elements at the two specified indexes
     *  prints the array
     * 
     * RED GROUP
     */
    public static void swapElements( int index1, int index2 )
    {
        Random generator = new Random();
        int[] array = new int[5];
        for(int i = 0; i < array.length; i++)
        {
            array[i] = generator.nextInt(5)+1;
        }
        System.out.println("You wanted to switch index " + index1 + 
            " with index " + index2);
        System.out.println(Arrays.toString(array));
        int value;
        value = array[index1];
        array[index1] = array[index2];
        array[index2] = value;
        
        System.out.println(Arrays.toString(array));
    }

    /*
     * Array Algorithm #5.1: findMax
     *  creates an array filled with random numbers
     *  prints the array and the greatest number
     * 
     * PURPLE GROUP
     */
    public static void findMax() 
    {

        int[] randomNums = new int[10];
        Random rand = new Random();

        for (int i = 0; i < randomNums.length; i++)
        {
            randomNums[i] = rand.nextInt(100) + 1;
        }

        int maxNum = randomNums[0];

        for (int i = 0; i < randomNums.length; i++)
        {
            if (randomNums[i] > maxNum)
            {
                maxNum = randomNums[i];
            }
        }

        for (int i = 0; i < randomNums.length; i++)
        {
            System.out.print(randomNums[i] + " ");
        }
        System.out.println("\n" + maxNum);
    }

    /*
     * Array Algorithm #5.2: findMin
     *  creates an array filled with random numbers
     *  prints the array and the least number
     * 
     * YELLOW GROUP
     */
    public static void findMin()
    {
    }

    /*
     * Array Algorithm #6: Copying Arrays
     *  creates an array filled with random numbers
     *  creates a new array of the same size
     *  copies elements from the first array into the new array
     *  prints the original array and the new array
     *  returns the new array
     * 
     * ORANGE GROUP
     */
    public static int[] copyArray()
    {
        final int ELEMENTS_PER_ARRAY = 10;

        // Create the original array
        int[] array1 = createRandomArray(ELEMENTS_PER_ARRAY, 10);

        // Create & copy contents to new array
        int[] array2 = new int[ELEMENTS_PER_ARRAY];
        for ( int i = 0; i < array2.length; i++ )
        {
            array2[i] = array1[i];
        }

        // Print both arrays
        printArray(array1);
        printArray(array2);

        // Return the new array
        return array2;
    }

}
