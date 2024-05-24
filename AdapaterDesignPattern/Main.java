package AdapaterDesignPattern;

public class Main {
    public static void main(String[] args)
    {
        Adapater k=new PayUAdapater();
        k.MakePayment(1,"Ram",2000);
        k.VerifyStatus(1,"Ram");
        Adapater m=new RazorpayAdapater();
        m.MakePayment(2,"Gokul",3000);
        m.VerifyStatus(2,"Gokul");
    }

}
