import java.util.ArrayList;

public class ArrayListExample
{
    public static void main( String[] args )
    {
        /*
         * Creating a new ArrayList object.
         * 
         *  When specifying the type of an ArrayList, we must specify the
         *      type of the elements in the list (e.g., Integer).
         *  
         *  The ArrayList class is an example of a generic class in Java.
         *  
         *  ArrayLists can only contain objects, not primitives.
         *  
         *  If we want a list of primitve types (e.g., int), we have to use
         *      the corresponding class (e.g., Integer)
         */
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        fillList( list, 20 /* # values */, 10 /* range of values */);
        
        System.out.println( list );
    }
    
    public static void fillList( ArrayList<Integer> list,
            int numValues, int range )
    {
        for( int i = 0; i < numValues; i++ )
        {
            /*
             * We are passing an int to a method that expects an Integer
             *      object. The primitive wrapper classes (e.g., Integer)
             *      support "autoboxing" which automatically converts
             *      primitive values to their corresponding objects.
             */
            list.add( (int)( Math.random() * range ));
        }
    }
}








