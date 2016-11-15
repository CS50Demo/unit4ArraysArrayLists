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
         *      can be a primitive type (e.g., int) or a class (e.g., Turtle).
         *  
         *  An array is an object that must be declared and initialized.
         *  
         *  For example, this creates an array that contains 10 ints. All
         *      elements are initialized to 0.
         */
        int[] evens = new int[10];
        
        /*
         * Set the values of all the elements in the array to the first 10
         *      positive even integers.
         *      
         *  length can be used to query the length of an array
         */
        for( int i = 0; i < evens.length; i++ )
        {
            evens[ i ] = ( i + 1 ) * 2;
        }
        
        for( int i = 0; i < evens.length; i++ )
        {
            System.out.println( i + ": " + evens[i] );
        }
    }
    
    public static void createArrayOfOdds()
    {
        /*
         * An array literal (deonted by curly brackets and comma-seperated
         *      values) can be used to initialize an array but only when
         *      the array is declared. The size of the array is determined
         *      based on the number of elements in the literal.
         */
        int[] odds = { 1, 3, 5, 7, 9, 11, 13, 15, 17, 19 };
        
        // this won't compile
        //odds = { 1, 3, 5 };
        
        /*
         * Bounds Error:
         *      Arrays have a fixed size once intialized.
         *      The index specified must refer to a valid element.
         *      Otherwise, an ArrayIndexOutOfBoundsException is generated
         */
        for( int i = 0; i <= odds.length; i++ )
        {
            System.out.println( i + ": " + odds[ i ] );
        }
        
        /*
         * Array References:
         *      variables of type array contain a reference to the array
         *      assigning one array variable to another copies the reference,
         *          not the array's elements
         */
        int[] moreOdds = odds;
        
        /*
         * This changes the value of the element in the array which is
         *      referened by both variables
         */
        odds[ 2 ] = 6;
        
        
    }
    
    public static void createArrayOfCalendars()
    {
        /*
         * Create an array of 12 calendars, each calendar initialized for
         *      the start of a month.
         *      
         *  When we create an array of objects, each element is initalized to
         *      null. We have to explicitly create new objects and assign
         *      to each element.
         */
        GregorianCalendar[] calendars = new GregorianCalendar[ 12 ];
        
        for( int i = 0; i < calendars.length; i++ )
        {
            calendars[ i ] = new GregorianCalendar( 2016, i+1, 1 );
        }
        
        for( int i = 0; i < calendars.length; i++ )
        {
            System.out.println( i + ": " + calendars[ i ] );
        }
        
    }
}




