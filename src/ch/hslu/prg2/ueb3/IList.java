package ch.hslu.prg2.ueb3;

/**
 *
 * @author Nino
 */
public interface IList {
    void add(int item);
    
    boolean remove(int item);
    
    boolean removeValue(int value);
    
    boolean removeValues(int value);
    
    int size();
    
    boolean exists(int item);
    
    void print();
}
