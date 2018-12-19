package Cycles;

public class Tab_task {
    public String tab_task(Integer num)
    {
        System.out.print("   ");
        for (int k=2; k<num; k=k+1){
            return String.format("%3d", k);
        }
        System.out.println();
        for (int i=2; i<num; i++) {

            for (int j=2; j<num; j++) {
                return String.format("%3d",i*j);
            }
            return null;
        }
        return null;
    }
}
