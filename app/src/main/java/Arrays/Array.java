package Arrays;

import java.util.Random;

public class Array {

    Integer num;
    Integer[] arrayl;
    Integer[] array2;
    public Array (Integer num )
    {
        this.num = num;
        arrayl = new Integer[this.num];
        array2 = new Integer[this.num];
    }

    public Integer[] setArray()
    {
        Random random = new Random();
        for(int i=0; i<arrayl.length; i++)
        {
            arrayl[i] = random.nextInt(50)+1;
        }
        return arrayl;
    }

    public Integer[] PereborIndexArray() {

        for (int i=0; i<array2.length; i++)
        {
            if (i%2==0)
                array2[i] = array2[i];
        }
        return  array2;
    }

}
