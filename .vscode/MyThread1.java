public class MyThread1 {
    public static void main(String[] args) {
        int n = 5 ;
        Runnable obj1 = new MyThread();

        Thread t1 = new Thread(obj1);

        t1.start();
    
       }
    
}
