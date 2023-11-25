package distributedcomputingprogram;

public class ExtendThread extends Thread{
    
    int threadNumber;
    
    public ExtendThread (int num){
        threadNumber = num;
    }

    public void run() {
        System.out.println("Saya Thread ke : " + threadNumber);
        try{
            Thread.sleep(5000);
        }catch (InterruptedException ie){
            System.out.println(threadNumber + "sudah selesai");
        }
        System.out.println(threadNumber + "sudah selesai");
    }
    
    public static void main (String[] args){
        System.out.println("Membuat Thread 1");
        Thread t1 = new ExtendThread(1);
        
        System.out.println("Membuat Thread 1");
        Thread t2 = new ExtendThread(2);
        
        t1.start();
        t2.start();
    }
}
