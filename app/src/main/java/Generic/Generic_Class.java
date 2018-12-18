package Generic;

public class Generic_Class {
    public Integer SetGenericInt(Integer number)
    {
        BoxPainter<Integer> valueInt = new BoxPainter<>(new Integer(number));
        Integer valueInt2 = valueInt.getVal();
        return valueInt2;

    }

    public  String SetGenericString(String str)
    {
        BoxPainter<String> value2 = new BoxPainter<>( new String(str));
        String intVelye2 = value2.getVal();
        return intVelye2;
    }


    static class BoxPainter<T>
    {
        private T val;

        public BoxPainter(T arg){this.val = arg;}

        public String toString(){return "{" + val + "}";};

        public T getVal() {return val;}
    }
}
