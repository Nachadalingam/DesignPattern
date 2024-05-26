package ObserverDesignPattern;

public class BitCoinTracker extends Listofsubscriber {
    private int price;

    public void setPrice(int price) {
        this.price = price;
        notifychange();
    }
}
