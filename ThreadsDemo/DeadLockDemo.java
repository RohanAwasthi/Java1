package ThreadsDemo;

public class DeadLockDemo {
    static int initialvalue;
    public static void increase(){
        initialvalue=initialvalue+1;
    } 

    public static void main(String[] args) {
        Runnable ch1=()->{
          for(int i=0;i<=100;i++){
            increase();
          }
        };
        Runnable ch2 = () -> {
            for(int i =0;i<=100;i++) {
                increase();
            }
        };

        Thread t1=new Thread(ch1);
        Thread t2 =new Thread(ch2);

        t1.start();
        t2.start();
        System.out.println(initialvalue);

    }

    
}
