package distributedcomputingprogram;

public class RunnableThread implements Runnable{
    
    public void run(){
        System.out.println("I am an instance of the java.lang.Runnable interface");
    }
    
    public static void main (String[] args){
        System.out.println("Membuat runnable object Thread 1");
        Runnable run = (Runnable) new RunnableThread();
        
        System.out.println("Membuat Thread 1");
        Thread t1 = new Thread(run);
        
        System.out.println("Membuat Thread 2");
        Thread t2 = new Thread(run);
        
        System.out.println("Memulai Thread");
        t1.start();
        t2.start();
    }
}
