package ObserverDesignPattern;

public interface publisher {
    public void notifychange();
    public void addsubscriber(subscriber s);
    public void removesubscriber(subscriber s);
}
