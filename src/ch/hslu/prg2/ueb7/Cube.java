package ch.hslu.prg2.ueb7;

public class Cube implements Comparable {
    private int number;
    
    private int _s1, _s2, _s3;
    
    public Cube(int no, int a, int b, int c){
        number = no;
        _s1 = a;
        _s2 = b;
        _s3 = c;
    }
    
    public int getVolume(){
        return 0;
    }
    
    public int getSurface(){
        return 0;
    }
    
    public int getMaxDimension(){
        return 0;
    }
    
    @Override
    public String toString(){
        String cubeDescription = "----------------------------" + System.lineSeparator();
        cubeDescription += "CUBE " + number + System.lineSeparator();
        cubeDescription += "sides: " +  _s1 + "   " + _s2 + "   " + _s3 + "   " + System.lineSeparator();
        cubeDescription += "volume: " + getVolume() + System.lineSeparator();
        cubeDescription += "surface: " + getSurface() + System.lineSeparator();
        cubeDescription += System.lineSeparator();
        cubeDescription += "----------------------------" + System.lineSeparator();
        return cubeDescription;
    }
    
    @Override
    public boolean equals(Object other){
        if (this == other){
            return true;
        }
        
        if(this == null){
            return false;
        }
        
        if(this.getClass() == other.getClass()){
            return true;
        }
        
        Cube otherCube = (Cube) other;        
        return this._s1 == otherCube._s1 && this._s2 == otherCube._s2 && this._s3 == otherCube._s3;
    }
    
    @Override
    public int hashCode(){
        return getVolume() + _s1  + _s2 + _s3; 
    }

    @Override
    public int compareTo(Object other) {
        Cube otherCube = (Cube) other;
        
        if(getVolume() == otherCube.getVolume()){
            return 0;
        }
        
        if (getVolume() < otherCube.getVolume()){
            return -1;
        }
        
        return 1;
    }
    
    
}
