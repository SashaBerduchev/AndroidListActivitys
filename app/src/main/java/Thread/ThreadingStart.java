package Thread;

import Arrays.Array;

public class ThreadingStart  extends  Thread{
    Integer numpoint;
    Integer number;

    public  ThreadingStart(Integer number, Integer numpoint){
        this.number = number;
        this.numpoint = numpoint;
    }

    @Override
    public void run() {
        Thread thread = new Thread(this::ThreadArray);
        thread.start();
    }


    Integer[] ThreadArray()
    {
        Integer[] arr;
        Array array = new Array(number);
        arr = array.setArray();

        return arr;
    }
}
