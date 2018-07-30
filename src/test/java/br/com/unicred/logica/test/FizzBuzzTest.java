package br.com.unicred.logica.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import br.com.unicred.logica.FizzBuzz;

public class FizzBuzzTest {
    
    private FizzBuzz fizzBuzz;

    @Before
    public void setUp() {
        fizzBuzz = new FizzBuzz();
    }
    
    @Test
    public void verificaRetornoNumero() {
        assertEquals("1", fizzBuzz.fizzBuzz(1));
        
    }
    
    @Test
    public void verificaMultiplosTres() {
        assertEquals("Fizz", fizzBuzz.fizzBuzz(3));
    }
    
    @Test
    public void verificarMultiploCinco() {
        assertEquals("Buzz", fizzBuzz.fizzBuzz(5));
    }
}
