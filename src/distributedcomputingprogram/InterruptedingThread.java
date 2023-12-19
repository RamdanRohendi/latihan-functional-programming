package distributedcomputingprogram;

public class InterruptedingThread extends Thread {
    
    public void run(){
        System.out.println("Sudah mulai lelah, ingatkan saya dalam 7 jam");
        try{
            Thread.sleep(1000 * 60 * 60 * 7);
            System.out.println("terimakasih sudah diingatkan");
        } catch(InterruptedException ie){
             System.out.println("hanya 5 menit saja...");
        }
    }

    public static void main(String[] args) throws java.io.IOException {
        Thread sleepy = new InterruptedingThread();
        sleepy.start();
        
        System.out.println("Tekan enter untuk menginterupsi Thread!");
        System.in.read();
        sleepy.interrupt();
    }
}
