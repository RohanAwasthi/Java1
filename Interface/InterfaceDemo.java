package Interface;

interface ProcessorVendor{
    void chipDetails();
}

interface vendor{
    void vendorDetails();
}

interface Machine extends ProcessorVendor,vendor{
    void code();
}

class Deskptop implements Machine,vendor{

    @Override
    public void chipDetails() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'chipDetails'");
    }

    @Override
    public void vendorDetails() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'vendorDetails'");
    }

    @Override
    public void code() {
        System.out.println("code --->compile -->execute --> Desktop");
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'code'");
    }
    
}

class Programer{
    public void buildApp(Machine machine){
        machine.code();
    }
}


public class InterfaceDemo {
    public static void main(String[] args) {
        Machine m =new Deskptop();
        Programer p=new Programer();
        p.buildApp(m);


    }
}
