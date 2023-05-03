package Abstract;

abstract class car{

     public abstract void drivecar();

    public void switchONAc(){
        System.out.println("Ac is On");
    }

}

class Maruti  extends car{

    @Override
    public void drivecar() {
        // TODO Auto-generated method stub
       System.out.println("maruti car");
    }

     
  

    

    
}

class Hyundai extends car{

    @Override
    public void drivecar() {
        // TODO Auto-generated method stub
        System.out.println("hyundai car");
    }
    
}




public class AbstractClass {
    public static void main(String[] args) {
        car obj = new Hyundai();
        obj.drivecar();
        obj.switchONAc();
    }
}
