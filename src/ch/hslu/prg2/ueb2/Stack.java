package ch.hslu.prg2.ueb2;

import java.util.ArrayList;

public class Stack {
    
    private ArrayList<String> _stackList = new ArrayList();
    
    public void push(String item){
        _stackList.add(item);
    }
    
    public String pop(){
        return _stackList.get(_stackList.size() -1);
    }
}
