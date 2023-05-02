package polymoiosphism;


    class P1 {
        public  void show() {
            System.out.println("show method in P1");
        }
    }
    
    class P2 extends P1 {
        public void show() {
            System.out.println("show method in P2");
        }
    }
    
    public class Sample {
       
       public static void main(String[] args) {
            P1 p = new P2();
            p.show();
    
    
            P2 p1 = (P2)p;
    
    
    
             int num = 19;
            num = 21;
            System.out.println(num);
    
            Integer i1 = num; // auto boxing
            int num1 = i1; // auto unboxing
    
        
               
    
            Integer i = Integer.parseInt("10");
    
          System.out.println(i);
    
       }
}
