package FacadeDesignPattern;

public class OrderFlow {
    // It is One order means I follow the flow do it some process
     Analytacis a=new Analytacis();
     Inventory o=new Inventory();
     Pay p=new Pay();
     public void flow()
     {
         p.pay();// pay the money first
         o.countproduct();// reduce count of product
         a.track();// track your order
     }

}
