package AdapaterDesignPattern;

public class PayUApi {

    public void payAmount(int id,String name,int amount)
    {
        System.out.println("Pau U Pay amount"+" "+name+" "+amount);
    }
    public PayUStatus getStatus(int id)
    {
        return PayUStatus.Succuess;
    }
}
