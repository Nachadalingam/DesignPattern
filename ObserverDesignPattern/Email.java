package ObserverDesignPattern;

public class Email implements subscriber{
    @Override
    public void takeaction() {
        System.out.println("send a email");
    }
}
