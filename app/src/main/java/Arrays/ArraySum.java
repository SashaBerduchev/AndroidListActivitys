package Arrays;

public class ArraySum {

    Integer[] array;
    Integer numlength;
    public ArraySum(Integer[] arr, int num){
        numlength = num;
        array = new Integer[numlength];
        array = arr;
    }

    public Integer arraySum(){
        Integer sum = 0;
        for (int j=0; j < array.length; j++){
            sum +=array[j];
        }

        return sum;
    }
}
