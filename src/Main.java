public class Main {
    public static void main(String[] args) {
        Counter c1=new Counter();
        Counter c2=new Counter();
        Thread t1=new Thread(c1);
        Thread t2=new Thread(c2);
        t1.start();
        t2.start();

    }
}
