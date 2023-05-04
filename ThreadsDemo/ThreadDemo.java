package ThreadsDemo;

class ChildThreadTwo extends Thread{
   public void run(){
    for(int i=0;i<=5;i++){
        System.out.println("Child Thread Two");
    }
    try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
   }

}


public class ThreadDemo {
    public static void main(String[] args) {
        Runnable ch1= ()->{
         for(int i=0;i<=5;i++){
            System.out.println("Child Thread One Show");
         }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

         };


         /*Runnable ch2=()->{
            for(int i=0;i<=5;i++){
                System.out.println("Child Thread Two Show ");
            }
              try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
         };*/
           ChildThreadTwo ch2=new ChildThreadTwo();
         System.out.println(Thread.currentThread().getName());

           ch2.setPriority(Thread.MAX_PRIORITY);

         Thread t1=new Thread(ch1);
         Thread t2=new Thread(ch2);
           
         t1.start();
         t2.start();


        }
    }

