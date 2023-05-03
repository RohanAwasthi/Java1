package InnerClass;

class P1{
    public void display(){
        System.out.println("in P1 dispaly");
    }
}
/*
 * 
 * class P2 extends P1{
    public void display(){
        System.out.println("in P2 display");
    }
}
 * 
 */



public class InnerDemo1 {
    public static void main(String[] args) {
        P1 p =new P1(){
           public void display(){
            System.out.println("in new display");
           }
        

        };

        p.display();

    }
}
