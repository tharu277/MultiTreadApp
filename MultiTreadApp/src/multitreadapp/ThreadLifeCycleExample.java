package multitreadapp;

public class ThreadLifeCycleExample extends Thread{
    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName()+"- State:"+Thread.currentThread().getState());
        try{
            Thread.sleep(2000);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+"- State after sleep:"+Thread.currentThread().getState());
    }
    public static void main(String[]args){
        ThreadLifeCycleExample thread = new ThreadLifeCycleExample();
        System.out.println(thread.getName()+"- State before start:"+thread.getState());
        thread.start();
        System.out.println(thread.getName()+"- state after start:"+thread.getState());
    }
}
