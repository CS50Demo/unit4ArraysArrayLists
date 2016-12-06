import java.util.ArrayList;

public class ArrayListExample
{
    public static void main( String[] arg )
    {
        /*
         * Create a new ArrayList object.
         * 
         *  The ArrayList class is a generic class in Java. A generic class
         *      is associated with a specific type that must be specified.
         *      
         *  The ArrayList class can only contain objects, not primitives.
         *  
         *  If we want a list of primitives types (e.g., int), we have to use
         *      the corresponding wrapper class (e.g., Integer)
         * 
         */
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        addValuesToList( list, 20 /* # of values */, 10 /* range of values */ );
        
    }
    
    public static void addValuesToList( ArrayList<Integer> list,
            int numValues, int range )
    {
        for( int i = 0; i < numValues; i++ )
        {
            /*
             * We are passing an int value to a method that expets an
             *      Integer object. The primitive wrapper classes (e.g.,
             *      Integer) supports "autoboxing" which automatically
             *      converts the primitive value into its corresponding object.
             */
            list.add( (int)( Math.random() * range ));
        }
    }
}






