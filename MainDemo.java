public class MainDemo {
    public static void main(String[] args) {
        
        int num1 = 3;
        int num2 = 5;
        int num3=5;
        int num4=6;
        int num5=7;
        Calculator calc = new Calculator();
        calc.calculatorName = "nkdebug";
        calc.color= "black";
       
        int result = calc.add(num1, num2,num3,num4);
       int result1= calc.add(num1,num2,num3,num4,num5);
        System.out.println(result + " " + calc.calculatorName);
        System.out.println(result1);
    }
}