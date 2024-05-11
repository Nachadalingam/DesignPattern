public class Main {
    public static void main(String[] args)
    {
        Builder b=Builder.build()
                .setAge("thirteen")
                .setEmil("nachadalingam2018@gmail.com")
                .setFirstname("Name")
                .setLastname("Nachu")
                .createobject();
        System.out.println(b);
    }
}
