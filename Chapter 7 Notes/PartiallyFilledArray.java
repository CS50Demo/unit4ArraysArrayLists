
/**
 * A partially filled array has more elements than are needed. It
 *      keeps track of which elements contain values and which are
 *      currently extra. If it becomes full, it grows itself to make room.
 * 
 * @author gcschmit
 * @version 21 November 2016
 */
public class PartiallyFilledArray
{
    private double[] values;
    private int currentSize;
    private static final int DEFAULT_CAPACITY = 100;

    /**
     * Constructor for objects of class PartiallyFilledArray
     */
    public PartiallyFilledArray()
    {
        this( DEFAULT_CAPACITY );
    }
    
    /**
     * Constructor for objects of class PartiallyFilledArray
     */
    public PartiallyFilledArray( int initialCapacity )
    {
        this.values = new double[ initialCapacity ];
        this.currentSize = 0;
    }
    
    public void add( double value )
    {
        if( this.currentSize == this.values.length )
        {
            this.grow();
        }
        
        this.values[ this.currentSize ] = value;
        this.currentSize++;
    }
    
    public void grow()
    {
        double[] newValues = new double[ this.values.length * 2 ];
        
        // copy all the values from the old array to the new one
        for( int i = 0; i < this.values.length; i++ )
        {
            newValues[ i ] = this.values[ i ];
        }
        
        // update the instance variable to refer to the new array
        this.values = newValues;
    }
    
    public void remove( int index )
    {
        for( int i = index; i < this.values.length - 1; i++ )
        {
            this.values[ i ] = this.values[ i + 1 ];
        }
        
        this.currentSize--;
    }
    
    public void insert( double value, int index )
    {
        if( this.currentSize == this.values.length )
        {
            this.grow();
        }
        
        for( int i = this.currentSize - 1; i >= index; i-- )
        {
            this.values[ i + 1 ] = this.values[ i ];
        }
        
        this.values[ index ] = value;
        this.currentSize++;
    }
}



