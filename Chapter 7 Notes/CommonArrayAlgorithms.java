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

        int[] array = createRandomArray( 10, 50 );

        for( int i = 0; i < array.length; i++ )
        {
            sum += array[ i ];
        }

        average = sum / array.length;

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
        Random rand = new Random();
        int[] randomNumbers = new int[5];
        int num;
        for( int i = 0; i < 5; i++ )
        {
            num = rand.nextInt(101);
            randomNumbers[i] = num;
        }

        for( int i = 0; i < randomNumbers.length - 1; i++ )
        {
            System.out.print( randomNumbers[i] + " | " );
        }
        System.out.print( randomNumbers[randomNumbers.length - 1] );
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
        int index = 0;
        boolean isTrue = true;

        int[] array = createRandomArray( 50, 10 );

        for( int i = 0 ; i < array.length && isTrue; i++ )
        {
            if( array[ i ] == valueToFind )
            {
                isTrue = false;
            }
            else
            {
                index++;
            }
        }
        printArray( array );
        System.out.println( "value: " + valueToFind + " index: " + index );
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
        int[] randoNumbo = { 123, 2 ,423, 512341, 23,17,9878 ,34 ,23};
        for ( int i = 0;
        i < randoNumbo.length;
        i++)
        {
            System.out.print(randoNumbo[i]+" ");
        }

        int tempVar = randoNumbo[index1];
        randoNumbo[index1] = randoNumbo[index2];
        randoNumbo[index2] = tempVar;

        System.out.println(" ");

        for ( int i = 0;
        i < randoNumbo.length;
        i++)
        {
            System.out.print(randoNumbo[i]+" ");
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
    {Random random = new Random();
        int[] randomArray = new int[10];
        for (int i = 0; i < 10; i++) {
            int a = random.nextInt();
            randomArray[i] = a;
        }

        int largestInt = randomArray[0];
        for (int i = 0; i < 10; i++) {
            if (randomArray[i] > largestInt) {
                largestInt = randomArray[i];
            }
        }

        for(int i = 0; i < randomArray.length; i++) {
            System.out.println(randomArray[i]);
        }
        System.out.println("The largest number in the array is " + largestInt);
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
        int[] numbers = new int[5];
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number");
        int val = s.nextInt();
        int min = val;
        numbers[0] += val;
        for (int i = 1; i <=4; i++)
        {
            System.out.print("Enter a positive integer: ");
            val = s.nextInt();
            numbers[i] += val;

            if (val<min)
            {
                min = val;
            }
        }

        for(int i = 0; i < numbers.length; i++)
        {
            System.out.println(numbers[i] + " ");
        }
        System.out.println("The minimum value is " + min);
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

        int [] array =  new int[5];
        for (int i = 0;i<array.length;i++){
            array[i] =(int) (Math.random()*100);
        }
        int [] copy = new int[array.length];
        for( int i = 0; i < copy.length; i++)
        { 
            copy[i] = array[i];
        }
        for( int i = 0; i < copy.length; i++)
        { 
            System.out.println(i+": "+ array[i]+" "+copy[i]);
        }
        return copy;

    }
}
