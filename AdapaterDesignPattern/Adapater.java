package AdapaterDesignPattern;

public interface Adapater {
    public void MakePayment(int id,String name,int amount);
    public Adapatertype VerifyStatus(int id,String name);
}
