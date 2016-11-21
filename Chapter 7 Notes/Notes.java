import java.util.GregorianCalendar;


/**
 * Write a description of class Notes here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Notes
{
    public static void createArrayOfEvens()
    {
        /*
         * An array stores multiple elements of the same type. The type
         *      can be a primitve type (e.g,. int) or a class (e.g., Turtle).
         *  
         *  An array is an object that must be declared and initialized.
         *  
         *  Here's an example that creates an array that contains 10 int
         *      values. All elements are initialized to 0.
         */
        int[] evens = new int[ 10 ];
        
        /*
         * Set the values of all the elements in the array to the first 10
         *      positive even integers.
         *  
         *  "length" is used to query the number of elements in the array
         */
        for( int i = 0; i < evens.length; i++ )
        {
            evens[ i ] = ( i + 1 ) * 2;
        }
        
        // print the array
        for( int i = 0; i < evens.length; i++ )
        {
            System.out.println( i + ": " + evens[ i ] );
        }
    }
    
    public static void createArrayOfOdds()
    {
        /*
         * An array literal (i.e., curly brackets and comma-seperated values)
         *      can be used to intialize an array but only when the array
         *      is declared. The size of the array is determined based on
         *      the number of elements in the literal.
         */
        int[] odds = { 1, 3, 5, 7, 9, 11, 13, 15, 17, 19 };
        
        // this won't compile
        //odds = { 1, 3, 5 };
        
        /*
         * Bounds Error:
         *      Arrays have a fixed size once initialized.
         *      The index specified must refer to a valid element.
         *      Otherwise, an ArrayIndexOutOfBounds exception is generated.
         */
        for( int i = 0; i <= odds.length; i++ )
        {
            System.out.println( i + ": " + odds[ i ] );
        }
        
        /*
         * Array References:
         *      variables of type array, contain a reference to the array
         *      assigning one array variable to another, copies the reference,
         *      not the array's elements
         */
        int[] moreOdds = odds;
        
        /*
         * This changes the value of the element in the array, which is
         *      referenced by both variables
         */
        odds[ 2 ] = 6;
        
        System.out.println( moreOdds[ 2 ] ); // prints "6"
        
        /*
         * Enhanced For Loop
         *      similar to the "for ... in" structure in Python
         *      iterates over the values in an array
         */
        for( int number : odds )
        {
            System.out.println( number );
        }
        
        /*
         * Limitations of the Enhanced For Loop
         *      the local variable contains a copy of the value of the element
         *      cannot modify the values of the elements in the array
         *      cannot easily destermine the index of an element
         */
        for( int number : odds )
        {
            number += 1;    // this doesn't change any element in the array
        }
        
        
    }
    
    public static void createArrayOfCalendars()
    {
        /*
         * Create an array of 12 calendars, each calendar initialized for
         *      the start of month.
         *  
         *  When we create an array of objects, each element is initiazlized
         *      to null. We have to explicilty create new objects and
         *      assign to each element.
         */
        GregorianCalendar[] calendars = new GregorianCalendar[ 12 ];
        
        for( int i = 0; i < calendars.length; i++ )
        {
            calendars[ i ] = new GregorianCalendar( 2016, i+1, 1 );
        }
        
    }
}





