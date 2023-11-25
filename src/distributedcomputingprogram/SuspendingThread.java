package distributedcomputingprogram;

public class SuspendingThread extends Thread{

    public void run(){
        int count = 1;
        System.out.println("saya tidak bisa menghitung, perhatikan");
        for(;;){
            System.out.print(count++ + " ");
            try{
                Thread.sleep(500);
            }catch (InterruptedException ie){
                
            }
        }
    }

    public static void main(String[] args) throws java.io.IOException {
        Thread counter = new SuspendingThread();

        counter.start();
        System.out.println("Tekan enter untuk mensuspend perhitungan Thread!");
        System.in.read();

        counter.suspend();
        System.out.println("Tekan enter untuk meresume perhitungan Thread!");
        System.in.read();

        counter.resume();
        System.out.println("Tekan enter untuk meghentikan perhitungan Thread!");
        System.in.read();

        counter.suspend();
        System.out.println("Tekan enter untuk meresume perhitungan Thread!");
        System.in.read();

        counter.resume();
        System.out.println("Tekan enter untuk meghentikan perhitungan Thread!");
        System.in.read();

        counter.stop();

    }
}
