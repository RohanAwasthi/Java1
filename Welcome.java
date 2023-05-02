

class Welcome{

 public static void main(String[] args) {

    System.out.println("null");
    int a =10;
    int b=20;
    int sum = a+b;
    sum--;
     

    byte by=108;
    long l=111111;

    double d=9.99;

    float num=12.2f;
    int sum2=a+by;
    int sum1=a%b;
    long sum3=by+l;
    double sum4=d+by;
    double sum5=num+d;
    char c='p';
    boolean t=true;
    System.out.println(sum);
        System.out.println(sum2);
        System.out.println(sum3);
        System.out.println(sum4);
        System.out.println(sum5);
        
       byte b1=123;
       int a1=555;
        


    a1=b1;
    b1=(byte)a1;
    by=(byte)d;

      int x=10;
      int y=20;
       
      boolean res=x<y;
      System.out.println(res);

      int p1=10;
      if(p1==10){
        System.out.println("the number is ten");
      }
      else{
        System.out.println("the number is not ten");
      }

      int num5=10;
      String numtype =num5%2==0?"even":"odd";
      System.out.println(numtype
        
      );
      int day= 1;
        
      switch(day) {
          case 1: 
              System.out.println("Monday");
          case 2: 
                  System.out.println("Tues");
          case 3: 
              System.out.println("Wed");
          case 4: 
              System.out.println("Thur");
          case 5: 
              System.out.println("Fri");
          case 6: 
              System.out.println("Sat");

               for(int i=0;i<5;i++){
                System.out.println(i);
               }

      }
    }
}