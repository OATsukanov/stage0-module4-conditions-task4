package school.mjc.stage0.conditions.task4;

public class TernaryMaxNumberPrinter {
    public void printGreatest(int first, int second, int third) {
        int i = first > second && first > third? first :
                (i = second > first && second > third? second :
                    (i = third > first && third > second? third :
                            (i = first == second && first > third? first :
                                    (i = first == third && first > second? first :
                                            (i = second == third && second > first? second :
                                                    (i = first == second && first == third? first : 0))))));
        System.out.println(i);
    }
}
