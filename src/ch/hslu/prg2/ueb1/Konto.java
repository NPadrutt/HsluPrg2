package ch.hslu.prg2.ueb1;

public class Konto {
    
    private static int count;
    
    protected int no;
    protected double saldo;
    protected double rate;
    
    public Konto(){
        this.no = count;
        count++;
    }
    
    public Konto(double saldo, double rate){
        this.no = count;
        this.saldo = saldo;
        this.rate = rate;
        
        count++;
    }
    
    public void payIn(double amount){
        saldo += amount;
    }
    
    public void payOut(double amount){
        saldo -= amount;
    }
    
    public void print(){
        System.out.println("Nr.: " + this.no + ";" + "Saldo: " + this.saldo);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
}
