package br.com.unicred.logica.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import br.com.unicred.logica.Matematica;

/**
 * 
 * @author juliane.bazilewitz
 *
 */
public class MatematicaTest {
    
    private Matematica matematica;
    
    @Before
    public void setUp() {
        matematica = new Matematica(2, 5); 
    }

    @Test
    public void verificaSeSomaFunciona() {
        
        int retornoSoma = matematica.somar();
        
        assertNotNull(retornoSoma);
        assertEquals(7, retornoSoma);
    }
    
    @Test
    public void verificaSeMultiplicacaoFunciona() {
        
        int retornoSoma = matematica.multiplicar();
        
        assertNotNull(retornoSoma);
        assertEquals(10, retornoSoma);
    }
    
    @Test
    public void verificaSeSomaNaoFunciona() {
        
        int retornoSoma = matematica.somar();
        
        assertNotNull(retornoSoma);
        assertNotEquals(17, retornoSoma);
    }
    
    @Test
    public void verificaSeMultiplicacaoNaoFunciona() {
        
        int retornoSoma = matematica.multiplicar();
        
        assertNotNull(retornoSoma);
        assertNotEquals(110, retornoSoma);
    }
    
    @Test
    public void verificarOperacoesMatematicas() {
        int soma = matematica.somar();
        int multiplicacao = matematica.multiplicar();
        assertEquals(7, soma);
        assertEquals(10, multiplicacao);
    }
    
    @Test(expected=Exception.class)
    public void numeroSeisNaoPodeSomar() {
        new Matematica(6,2).somar();
    }
}
