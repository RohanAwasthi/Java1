package InnerClass;

class A{
    String Name;
public void display(){
 System.out.println("in display");

}
static class B{
    public void show(){
        System.out.println("in show");
    }

   
 }


}




public class InnerDemo {
    public static void main(String[] args) {
        A obj=new A();
        obj.display();

       // A.B obj1= obj.new B();
       A.B obj1= new A.B();
        obj1.show();


    }
}
