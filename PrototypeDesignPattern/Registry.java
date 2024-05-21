package PrototypeDesignPattern;

import java.util.HashMap;

public class Registry {
    private HashMap<BackGroundType,BackGroundObject>map=new HashMap<>();
    public void add(BackGroundObject obj)
    {
        map.put(obj.getType(),obj);
    }
    public BackGroundObject gettype(BackGroundType type)
    {
        return map.get(type);
    }
}
