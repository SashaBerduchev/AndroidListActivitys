package Generic;


import java.util.ArrayList;
import java.util.List;

public class Generic_Mask {

    public Object setMask(Integer num, String str, Double dobnum)
    {
        List<Integer> listint = new ArrayList<>();
        listint.add(num);

        List<String> strin = new ArrayList<>();
        strin.add(str);

        List<Double> doubval = new ArrayList<Double>();
        doubval.add(dobnum);

        List<Object> obj = new ArrayList<>();
        obj.add(num);
        obj.add(str);
        obj.add(dobnum);

        return  obj;
    }
}
