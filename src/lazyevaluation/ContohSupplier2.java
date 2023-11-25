package lazyevaluation;

import java.util.function.Supplier;

public class ContohSupplier2 {
    public static void main(String[] args) {
        testEagerEvaluation();
        testLazyEvaluation();
    }

    static void testLazyEvaluation() {
        Supplier b1 = () -> execute("bb");
        Supplier b2 = () -> execute("aa");
        System.out.println(match(b1, b2));
    }

    static String match(Supplier<Boolean> b1, Supplier<Boolean> b2) {
        return b1.get() && b2.get() ? "Match " : "Non Match";
    }

    static void testEagerEvaluation() {
        boolean b1 = execute("bb");
        boolean b2 = execute("aa");
        System.out.println(match(b1, b2));
    }

    static String match(boolean b1, boolean b2) {
        return b1 && b2 ? "Match " : "Non Match";
    }

    static boolean execute(String str) {
        System.out.println("method dijalankan ... ");
        return str.contains("b");
    }
}
