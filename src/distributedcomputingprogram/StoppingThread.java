package distributedcomputingprogram;

public class StoppingThread extends Thread{
    
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
        Thread counter = new StoppingThread();

        counter.start();
        System.out.println("tekan enter untuk menghentikan penghitungan Thread!");
        System.in.read();
        counter.stop();
    }
}
