package Cycles;

public class ForRunner {
    public Integer Runner()

    {
        for (int counter = 0; counter < 5; counter++) {
            System.out.println(counter);
        }

        int counter = 0;
        for (; counter < 5; counter++) {
            System.out.println(counter);
        }

        counter = 0;
        for (; counter < 5; ) {
            System.out.println(counter);
            counter++;
        }

        for (counter = 0; counter < 5; System.out.println(counter++)) ;
        {

        }
        counter = 0;
        for (; ; ) {
            if (counter < 5) {
                return counter;
            }
            System.out.println(counter);

            counter++;


        }
    }
}
