package FunctionalInterface;
@FunctionalInterface
interface P1 {
    int display(int i, int j);
}
public class FunctionalInterface1 {
    public static void main(String[] args) {
        /* 
        P1 p =  (int i) ->  System.out.println("display" + " " +i);
        p.display(76);
*/
         P1 p1 = new P1()
        {
            public int display(int i, int j) {
                    return i+j;
            }
        };
        P1 p2 = (int i, int j) ->  i+j;
        int res = p1.display(10, 34 );
        System.out.println(res);
        int res1 = p2.display(9, 1 );
        System.out.println(res1);
    
        P1 p3=(int i,int j)->i*j;
        int res3=p3.display(10,20);
        System.out.println(res3);

        P1 p4=(int i,int j)->i/j;
        int res4=p4.display(20,10);
        System.out.println(res4);
    }
}