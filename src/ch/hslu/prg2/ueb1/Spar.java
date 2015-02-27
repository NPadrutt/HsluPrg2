package ch.hslu.prg2.ueb1;

public class Spar extends Konto  {
    private double maxOut;
    
    public Spar(double saldo, double rate, double maxOut){
        this.saldo = saldo;
        this.rate = rate;
        this.maxOut = maxOut;
    }
    
    public double getSaldo(){
        return saldo;
    }
    
    @Override
    public void payOut(double amount){
        if(amount > maxOut){
            return;
        }        
        super.payOut(amount);
    }
}
