package school.mjc.stage0.conditions.finalTask;

public class IntegerDivider {
    public void printCompletelyDivided(int dividend, int divider) {
        int res = (dividend/divider) * divider;

        if (divider == 0) {
            System.out.println("division by zero");
        } if (res == dividend) {
            System.out.println("can be divided completely");
        } else {
            System.out.println( "cannot be divided completely");
        }
    }
}
