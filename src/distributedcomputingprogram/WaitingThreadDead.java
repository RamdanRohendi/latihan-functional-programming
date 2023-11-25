package distributedcomputingprogram;

public class WaitingThreadDead extends Thread{

        public void run(){
            System.out.println("Thread ini sampai...");
            try{
                Thread.sleep(500);
            }catch (InterruptedException ie){
                
            }
        }
    
    public static void main(String[] args) throws java.lang.InterruptedException {
        Thread dying = new WaitingThreadDead();
        dying.start();
        System.out.println("Menunggu thread mati");
        dying.join();
        System.out.println("Thread sudah mati");
    }
}
