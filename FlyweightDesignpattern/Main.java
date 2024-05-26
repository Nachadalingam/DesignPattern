package FlyweightDesignpattern;

public class Main {
    public static void main(String[] args) {
        Bullet b = new Bullet("image");
        Flyweight f = new Flyweight(1, 2, 3, 2.0, b);
        System.out.println(f.getBullet().getImage());
    }

}
