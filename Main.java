//Lab-21
//Write a program to create thread life cycle.

class ThreadLifeCycle implements Runnable
{
    public void run(){}
}
class Main
{
    public static void main(String args[])
    { 
        ThreadLifeCycle tlc = new ThreadLifeCycle();
        Thread t = new Thread(tlc);
        System.out.println("Thread State : "+t.getState());
    }
}
