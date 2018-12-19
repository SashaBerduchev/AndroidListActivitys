package Cycles;

public class ContinueRunner {
    public Integer setRunner(Integer num)
    {
        for(int i = 1; i < num; i++)
        {
            if(i % 3 == 0 || i % 5 == 0 || i % 2 == 0){
                continue;
            }
            return i;
        }
        return 0;
    }
}
