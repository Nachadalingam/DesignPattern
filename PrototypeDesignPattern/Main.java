package PrototypeDesignPattern;

import static PrototypeDesignPattern.BackGroundType.Tree;
import static PrototypeDesignPattern.BackGroundType.Mountain;

public class Main {
    static Registry s=new Registry();
    public static void main(String args[])
    {
        BackGroundObject prototype=new BackGroundObject(20,30,40,Tree);
        s.add(prototype);
        BackGroundObject b=prototype.clone();
        b.setType(Mountain);
        System.out.println(prototype.getType());
        System.out.println(b.getType());



    }
    public void createTree()
    {
        BackGroundObject k=s.gettype(Tree);
        k.setX(40);
        s.add(k);

    }
}
