package lambdaexpression;

public class Interface1 implements MyInterface1 {
    @Override
    public double getValue() {
        return 3.14;
    }

    public static void main(String[] args) {
        Interface1 hasil = new Interface1();
        System.out.println(hasil.getValue());
    }
}
