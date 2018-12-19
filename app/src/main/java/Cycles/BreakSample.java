package Cycles;

public class BreakSample {
    public Integer breakSample(Integer num)
    {
        int i=2;
        while (i<=num)
        {
            if (i != num) System.out.println(i+"; ");
            else return i;
            i*=2;

        }
        return 0;
    }

}
