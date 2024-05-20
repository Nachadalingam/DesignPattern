package Singleton.java;

public class Main {
    public static void main(String[] args)
    {
        Connection c1=Connection.getInstance();// first call Checak Instance is not created return Connection object
        Connection c2=Connection.getInstance();//next call instance is already created so that return same instance
        System.out.println(c1==c2); //Both oject have same reference so that print true;
    }
}
