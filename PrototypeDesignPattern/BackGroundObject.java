package PrototypeDesignPattern;

public class BackGroundObject implements GraphicalObject {
    private Integer x;
    private Integer y;
    private Integer z;
    private BackGroundType type;
    public BackGroundObject(Integer x,Integer y,Integer z,BackGroundType type)
    {
        this.x=x;
        this.y=y;
        this.z=z;
        this.type=type;
    }

    public void setType(BackGroundType type) {
        this.type = type;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public void setY(Integer y) {
        this.y = y;
    }

    public void setZ(Integer z) {
        this.z = z;
    }

    public BackGroundType getType() {
        return type;
    }

    public Integer getX() {
        return x;
    }

    public Integer getY() {
        return y;
    }

    public Integer getZ() {
        return z;
    }

    @Override
    public BackGroundObject clone() {
        return new BackGroundObject(x,y,z,type);
    }
}
