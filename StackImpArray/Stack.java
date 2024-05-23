package StackImpArray;

import java.lang.module.FindException;
import java.util.ArrayList;

public class Stack {
    int top=-1;
    ArrayList<Integer>ans=new ArrayList<>();
    public void push(int x)
    {
        ans.add(x);
        top++;
    }
    public int pop()
    {
        int v=0;
        if(top!=-1) {
            v=ans.remove(ans.size() - 1);
            top--;
        }
        if(top==-1) {
            throw new RuntimeException("no element in stack");
        }

        return v;
    }
    public int size()
    {
        int k=0;
        k= ans.size();
        return k;
    }
    public boolean Empty()
    {
        if(top==-1)
        {
            return false;
        }
        else {
            return true;
        }
    }

}
