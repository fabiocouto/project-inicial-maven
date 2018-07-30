package br.com.unicred.logica;

/**
 * 
 * @author juliane.bazilewitz
 *
 */
public class FizzBuzz {

    public String fizzBuzz(int i) {
        
        String retorno = "";
        
        if (i % 5 == 0) 
            retorno += "Buzz";
        if (i % 3 == 0)
            retorno += "Fizz";
        
        return retorno.isEmpty() ? String.valueOf(i) : retorno;
    }
}
