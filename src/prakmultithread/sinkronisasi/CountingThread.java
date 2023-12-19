package prakmultithread.sinkronisasi;

public class CountingThread {
    public static void main(String[] args) throws Exception {
        Counter c = new Counter ();

        //instace Runnable akan menghitung 10x utk msg2 thread
        Runnable runner = new hitungThread (c,10);
        System.out.println ("Mulai perhitungan threads");
        Thread t1 = new Thread (runner);
        Thread t2 = new Thread (runner);
        Thread t3 = new Thread (runner);

        t1.start();
        t2.start();
        t3.start();

        //menunggu 3 thread selesai menjalankannya
        t1.join();
        t2.join();
        t3.join();
        System.out.println ("Nilai counter: " + c.getCount());
    }
}
