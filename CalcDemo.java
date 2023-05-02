public class CalcDemo {
    public static void main(String[] args) {
        Calc a=new Calc();
        System.out.println(a.add(2, 3));
        
        System.out.println(a.sub(5, 4));

        AdvCalc b =new AdvCalc();
        System.out.println(b.add(6,7));
         
        BasicCalc c=new BasicCalc();
        System.out.println(c.add(10,20));
        b.show();
        c.display();
        

    }
}
