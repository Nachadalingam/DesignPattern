package AdapaterDesignPattern;


public class PayUAdapater implements  Adapater{
    PayUApi api=new PayUApi();
    @Override
    public void MakePayment(int id, String name, int amount) {
        api.payAmount(id,name,amount);
    }

    @Override
    public Adapatertype VerifyStatus(int id, String name) {
        PayUStatus k=api.getStatus(id);
        return findstatus(k);
    }
    public Adapatertype findstatus(PayUStatus k)
    {
        if(k==PayUStatus.Succuess)
        {
            return Adapatertype.ok;
        }
        throw new RuntimeException("Failure Payment");
    }
}
