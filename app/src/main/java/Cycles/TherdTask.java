package Cycles;

public class TherdTask {
    public Integer Task(Integer num){
        int i=2;
        while (i<=num){
            if (i != num) System.out.println(i + "; ");
            else return i;
            i*=2;
        }
        return null;
    }

}
