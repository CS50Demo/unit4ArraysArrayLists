import java.util.ArrayList;

public class ArrayListExample
{
    public static void main( String[] args )
    {
        /*
         *  Create a new ArrayList object.
         *  
         *  The ArrayList class is a generic class in Java. A generic class
         *      is associated with a specific type that must be specified.
         *      
         *  The ArrayList class can only contain objects, not primitives.
         *  
         *  If we want a list of primitive types (e.g., int), we have to use
         *      the corresponding wrapper class (e.g., Integer).
         */
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        addValuesToList( list, 20 /* # of values */, 10 /* range of values */ );
        
        System.out.println( list );
        
        removeEvensFromList( list );
        
        System.out.println( list );
    }
    
    public static void removeEvensFromList( ArrayList<Integer> list )
    {
        /*
         * To get the number of elements in the list, invoke the size method
         */
        for( int i = 0; i < list.size(); i++ )
        {
            /*
             * To get the value of an element in the list, invoke the get
             *      method and pass the element's index
             */
            int value = list.get( i );
            
            // check if value is even
            if( value % 2 == 0 )
            {
                /*
                 * To remove an element from the list, invoke the remove
                 *      method and pass the element's index
                 */
                list.remove( i );
                i--;
            }
        }
    }

    public static void removeEvensFromList2( ArrayList<Integer> list )
    {
        /*
         * To get the number of elements in the list, invoke the size method
         */
        for( int i = list.size() - 1; i >= 0; i-- )
        {
            /*
             * To get the value of an element in the list, invoke the get
             *      method and pass the element's index
             */
            int value = list.get( i );
            
            // check if value is even
            if( value % 2 == 0 )
            {
                /*
                 * To remove an element from the list, invoke the remove
                 *      method and pass the element's index
                 */
                list.remove( i );
            }
        }
    }
    
    public static void addValuesToList( ArrayList<Integer> list,
            int numValues, int range )
    {
        for( int i = 0; i < numValues; i++ )
        {
            /*
             * We are passing an int value to a method that expects an
             *      Integer obejct. The primitive wrapper classes (e.g., 
             *      Integer) supports "autoboxing" which automatically
             *      converts primitive values to their corresponding objects.
             */
            list.add( (int)( Math.random() * range ));
        }
    }
}







