package multitreadapp;

public class SimpleTread extends Thread{
    @Override
    public void run(){
        System.out.println(Thread.currentThread().getId()+" is executing the thread.");
    }
    public static void main(String[] args){
        SimpleTread thread1 = new SimpleTread();
        SimpleTread thread2= new SimpleTread();
        thread1.start();
        thread2.start();
    }
    
}
