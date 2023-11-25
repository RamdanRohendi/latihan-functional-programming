package lazyevaluation;

interface Function1Ori<T, R>
{
    R apply1(T t);
}
interface Function2Ori<T, R>
{
    R apply2(T t, T n);
}

public class LazyEvaluationOri {
    public static void main(String[] args)
    {
        Function1Ori<Integer, Integer> fungsi1 = new Function1Ori<Integer, Integer>()
        {
            @Override
            public Integer apply1(Integer x)
            {
                System.out.println("jalankan fungsi 1");
                return x;
            }
        };

        Function2Ori<Integer, Integer> fungsi2 = new Function2Ori<Integer, Integer>()
        {
            @Override
            public Integer apply2(Integer x, Integer y)
            {
                System.out.println("in cube");
                return x + y;
            }
        };

        System.out.printf("%d%n", ifThenElse(true, fungsi1, fungsi2, 4, 3));
        System.out.printf("%d%n", ifThenElse(false, fungsi1, fungsi2, 4, 3));
    }

    static <T, R> R ifThenElse(boolean predicate, Function1Ori<T, R> onTrue, Function2Ori<T, R> onFalse, T t, T n)
    {
        return (predicate ? onTrue.apply1(t) : onFalse.apply2(t,n));
    }
}
