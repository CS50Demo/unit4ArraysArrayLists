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
        Random ran = new Random();
        int[] blue = new int[10];
        for (int count = 0; count < blue.length; count++)
        {
            blue[count] = ran.nextInt(100);
        }
        for (int i = 0; i < blue.length; i++)
        {
            System.out.print(blue[i]);
            if( i != (blue.length-1))
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
        int[] randomArray = createRandomArray(100, 11);
        boolean valueFound = false;
        for( int index = 0; index < randomArray.length; index++ ) {
            if(randomArray[index] == valueToFind) {
                System.out.println("The value is at: " + index);
                printArray(randomArray);
                valueFound = true;
                break;
            }
        }
        if(!valueFound) {
            System.out.println("The value was not found!");
            printArray(randomArray);
        }
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
    public static void swapElements( int length, int maxValue )
    {
        int[] randomArray = new int[ length ];
        for( int i = 0; i < randomArray.length; i++ )
        {
            randomArray[ i ] = (int)( Math.random() * maxValue );
            System.out.print( randomArray[i] );
        }

        Scanner scan = new Scanner( System.in );
        System.out.println( "\nEnter two indexes from the array above: " );
        int index1 = scan.nextInt();
        int index2 = scan.nextInt();
        int num = randomArray[index1];
        randomArray[index1] = randomArray[index2];
        randomArray[index2] = num;

        for( int i = 0; i < randomArray.length; i++ )
        {
            System.out.print( randomArray[i] );
        }

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
        int[] array = createRandomArray(10, 25);
        int max = array[0];

        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }

        System.out.println("The maximum value of array");
        printArray(array);
        System.out.println("is " + max);
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
        int[] array = createRandomArray(10, 25);
        int min = array[0];

        for (int num : array) {
            if (num < min) {
                min = num;
            }
        }

        System.out.println("The minimum value of array");
        printArray(array);
        System.out.println("is " + min);
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

        int[] array = new int[10];
        for (int i = 0; i < array.length; i++)
        {
            array[i] = (int)(Math.random()*10);
        }
        int [] newArray = new int[array.length];
        for (int i = 0; i < array.length; i++)
        {
            newArray[i] = array[i];
        }
        System.out.println( "Original Array: ");
        for (int i = 0; i < array.length; i++)
        {
            System.out.println(array[i]);
        }
        System.out.println("New Array:");
        for (int i = 0; i < array.length; i++)
        {
            System.out.println(newArray[i]);
        }
        return newArray;
    }

}
