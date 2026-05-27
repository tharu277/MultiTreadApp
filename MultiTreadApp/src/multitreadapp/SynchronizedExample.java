package multitreadapp;

public class counter {
    private int count = 0;
    
    public synchronized void increament(){
        count++;
    }
    public int getCount(){
        return count;
    }
}
public class SynchronizedExample extends Thread{
    private counter counter;
    public SynchronizedExample(counter counter){
        this.counter = counter;
    }
    @Override
    public void run(){
        for(int i = 0; i<1000; i++){
            counter.increament();
        }
    }
    public static void main(String[]args) throws InterruptedException{
        counter counter = new counter();
        
        Thread thread1 = new SynchronizedExample(counter);
        Thread thread2 = new SynchronizedExample(counter);
        
        thread1.start();
        thread2.start();
        
        thread1.join();
        thread2.join();
        
        System.out.println("Final counter value:"+counter.getCount());
    }
}
