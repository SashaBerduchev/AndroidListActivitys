package Arrays;

public class ArrayFind {

    Integer numindex;
    Integer[] array;
    Integer elem;
    public ArrayFind(Integer[]  arr, int num, int elem)
    {
        numindex = num;
        this.elem = elem;
        array = new Integer[numindex];
        array = arr;
    }

    public Integer findIndex()
    {
        for (int i = 0; i<array.length; i++)
        {
           if( array[i] == elem)
               return array[i];
        }

        return 0;
    }


}


