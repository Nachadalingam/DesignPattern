package AdapaterDesignPattern;

public class RazorpayAdapater implements Adapater{
    RozarPayApi api=new RozarPayApi();
    @Override
    public void MakePayment(int id, String name, int amount) {
        api.pay(name,amount);
    }

    @Override
    public Adapatertype VerifyStatus(int id, String name) {
       int p=api.Checkstatus(name);
       return StatusCheck(p);
    }
    public Adapatertype StatusCheck(int p)
    {
        if(p==1)
        {
            return Adapatertype.ok;
        }
        throw new RuntimeException("Fail the Payment");
    }

}
