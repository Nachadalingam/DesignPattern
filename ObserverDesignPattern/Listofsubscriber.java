package ObserverDesignPattern;

import java.util.ArrayList;
import java.util.List;

public abstract class Listofsubscriber implements publisher{
    List<subscriber> sub=new ArrayList<>();
    @Override
    public void notifychange() {
        for(subscriber s:sub)
        {
            s.takeaction();
        }
    }

    @Override
    public void addsubscriber(subscriber s) {
       sub.add(s);
    }

    @Override
    public void removesubscriber(subscriber s) {
      sub.remove(s);
    }
}
