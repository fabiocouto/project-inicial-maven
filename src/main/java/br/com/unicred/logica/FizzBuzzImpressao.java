package br.com.unicred.logica;

public class FizzBuzzImpressao {

    public static void main(String[] args) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        
        for(int i = 1; i <= 100; i++) {
            String retorno = fizzBuzz.fizzBuzz(i);
            System.out.println(retorno);
        }
    }
}
