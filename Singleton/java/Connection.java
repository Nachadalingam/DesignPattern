package Singleton.java;

public class Connection {
    private static Connection Instance=null;

    private Connection()// dont allow to create a object on outside
    {

    }
    public static Connection getInstance()
    {
        // double Checking to avoid mutithread issue
        if(Instance==null) {
            synchronized (Instance)
            {
                if (Instance == null) {
                    Instance = new Connection();
                }
            }
        }
        return Instance;
    }

}
