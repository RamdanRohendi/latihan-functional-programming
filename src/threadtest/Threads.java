package threadtest;

public class Threads extends Thread {
    public void run() {
        System.out.println("MyThread running");
    }

    public static void main(String[] args) {
        Threads thread1 = new Threads();
        thread1.start();
    }
}

