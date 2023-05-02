public class Employee {
    
    int eID;
    String Name;
    int Salary;
}


class ArrayDemo{
 public static void main(String[] args) {
    int num[]={1,2,3,4,5};
    int nums1[]=new int[10];
    for(int i=0;i<num.length;i++){
     System.out.println(num[i]);
    }

    Employee e1=new Employee();
    e1.eID=1;
    e1.Name="Rohan";
    e1.Salary=30;

    Employee e2=new Employee();
    e2.eID=3;
    e2.Name="Bhanu";
    e2.Salary=30;

    Employee e3=new Employee();
    e3.eID=3;
    e3.Name="Awasthi";
    e3.Salary=30;

    Employee empArr[]=new Employee[3];
    empArr[0]=e1;
    empArr[1]=e2;
    empArr[2]=e3;

    for (Employee employee : empArr) {
        System.out.println(employee);
        System.out.println(employee.eID + " " + employee.Name + " "+ employee.Salary);
    }



}}