package FlyweightDesignpattern;
 // it is a Externic class Every attribute change every time
public class Flyweight {
    private int x;
    private int y;
    private int z;
    private double radius;
    private Bullet bullet;
    public Flyweight(int x,int y,int z,double radius,Bullet bullet)
    {
        this.x=x;
        this.y=y;
        this.z=z;
        this.radius=radius;
        this.bullet=bullet;

    }

    public Bullet getBullet() {
        return bullet;
    }

    public double getRadius() {
        return radius;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }
}
