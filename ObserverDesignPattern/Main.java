package ObserverDesignPattern;

public class Main {
    public static void main(String[] args)
    {
        BitCoinTracker b=new BitCoinTracker();
        b.addsubscriber(new Email());
        b.setPrice(10);
    }
}
