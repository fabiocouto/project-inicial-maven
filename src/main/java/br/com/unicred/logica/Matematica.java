package br.com.unicred.logica;

/**
 * 
 * @author juliane.bazilewitz
 *
 */
public class Matematica {
    
    private int numero1;
    private int numero2;
    
    public Matematica(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
    
    public int somar() {
        if(this.numero1 == 6 || this.numero2 == 6) {
            throw new RuntimeException("número 6 não pode.");
        }
        return this.numero1 + this.numero2;
    }
    
    public int multiplicar() {
        return this.numero1 * this.numero2;
    }

}
