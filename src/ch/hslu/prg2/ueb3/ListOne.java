package ch.hslu.prg2.ueb3;

import java.util.ArrayList;

/**
 *
 * @author Nino
 */
public class ListOne implements IList {

    private final ArrayList<Integer> _list;
    
    public ListOne(){
        _list = new ArrayList();
    }
    
    @Override
    public void add(int item) {
        _list.add(item);
    }

    @Override
    public boolean remove(int item) {
        return _list.remove((Integer)item);
    }

    @Override
    public boolean removeValue(int value) {
        return _list.remove((Integer) value);
    }

    @Override
    public boolean removeValues(int value) {
        while(_list.contains(value)){
            _list.remove((Integer)value);
        }        
        return _list.contains(value);
    }

    @Override
    public int size() {
        return _list.size();
    }

    @Override
    public boolean exists(int item) {
        return _list.contains(item);
    }

    @Override
    public void print() {
        for(int i : _list){
            System.out.println(i);
        }
    }
    
}
