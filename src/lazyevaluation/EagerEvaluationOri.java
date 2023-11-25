package lazyevaluation;

public class EagerEvaluationOri {
    public static void main(String[] args)
    {
        System.out.printf("%d%n", ifThenElse(true, fungsi1(4), fungsi2(4,3)));
        System.out.printf("%d%n", ifThenElse(false, fungsi1(4), fungsi2(4, 3)));
    }

    static int fungsi1(int x)
    {
        System.out.println("jalankan fungsi 1");
        return x;
    }

    static int fungsi2(int x, int y)
    {
        System.out.println("jalankan fungsi 2");
        return x + y;
    }

    static int ifThenElse(boolean predicate, int onTrue, int onFalse)
    {
        return (predicate) ? onTrue : onFalse;
    }
}
