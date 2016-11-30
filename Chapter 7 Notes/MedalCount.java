public class MedalCount
{
    final int COUNTRIES = 7;
    final int MEDAL_TYPES = 3;
    
    private int[][] counts = 
        {
            { 1, 0, 1 },
            { 1, 1, 0 },
            { 0, 0, 1 },
            { 2, 0, 0 },
            { 0, 1, 1 },
            { 0, 1, 1 },
            { 1, 2, 0 }
        };

    public MedalCount()
    {
        // use the new operator to create a 2D array
        //counts = new int[COUNTRIES][MEDAL_TYPES];
    }
    
    public void printTable()
    {
        // good: for( int row = 0; row < COUNTRIES; row++ )
        for( int row = 0; row < counts.length; row++ )
        {
            // good: for( int col = 0; col < MEDAL_TYPES; col++ )
            // better: for( int col = 0; col < counts[0].length; col++ )
            // best:
            for( int col = 0; col < counts[row].length; col++ )
            {
                System.out.print( counts[row][col] + "\t" );
            }
            
            System.out.println();
        }
    }
    
    public int countMedals( int countryIndex )
    {
        int total = 0;
        
        for( int col = 0; col < counts[countryIndex].length; col++ )
        {
            total += counts[countryIndex][col];
        }
        
        return total;
    }
    
    public int countPerMedalType( int medalIndex )
    {
        int total = 0;
        
        for( int row = 0; row < counts.length; row++ )
        {
            total += counts[row][medalIndex];
        }
        
        return total;
    }
}








