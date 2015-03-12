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
        return _list.remove((Object)item);
    }

    @Override
    public boolean removeValue(int value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean removeValues(int value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int size() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean exists(int item) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void print() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
