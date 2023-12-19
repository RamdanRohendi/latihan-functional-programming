package prakmultithread.sinkronisasi;

public class Counter {
    private int countValue;

    public Counter () {
        countValue = 0;
    }

    public Counter (int start) {
        countValue = start;
    }

    //metode sinkronisasi utk perhitungan counter
    public synchronized void increaseCount() {
        int count = countValue;

        try {
            Thread.sleep(1000);
        } catch (InterruptedException ie){
        }

        count = count + 1;
        countValue = count;
    }

    public synchronized int getCount() {
        return countValue;
    }
}
class hitungThread implements Runnable {
    Counter myCounter;
    int countAmount;

    public hitungThread(Counter counter, int amount) {
        myCounter = counter;
        countAmount = amount;
    }

    @Override
    public void run() {
        for (int i = 1; i <= countAmount; i++) {
            myCounter.increaseCount();
            System.out.println(Thread.currentThread().getName() + " " + myCounter.getCount());
        }
    }
}
