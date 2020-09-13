package ssss;

public class B implements Runnable{
	Thread t;
    B() {
        t = new Thread(this,"Hello");
        t.start();
    }
    public void run() {
        System.out.println(t.getName());
    }
}
