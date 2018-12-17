package Arrays;

public class ShiftRight {

    public Integer[] setShiftRight(Integer[] array, Integer numimteger )
    {
        int k=3;
        for(int j =0; j<k; j++)
        {
            int temp = array[ array.length - 1];
            for(int i=array.length - 1; i>0; i--)
            {
                array[i] = array[i-1];
            }
            array[0] = temp;
        }

        return array;
    }
}
