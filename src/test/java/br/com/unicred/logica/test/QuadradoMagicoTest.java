package br.com.unicred.logica.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import br.com.unicred.logica.QuadradoMagico;

/**
 * 
 * @author juliane.bazilewitz
 *
 */
public class QuadradoMagicoTest {

    private int[][] quadrado;
    private static final int QUINZE = 15;
    private QuadradoMagico quadradoMagico;
    
    @Before
    public void setUp() {
        quadrado = new int [3][3];
        quadrado[1][1] = 5;
        quadradoMagico = new QuadradoMagico();
    }
    
    @Test
    public void deveRetornarQuinzeNaHorizontal() {
        int[][] horizontal1 = preencheQuadrado();
        int[][] horizontal2 = preencheQuadrado();
        int[][] horizontal3 = preencheQuadrado();
        int soma1 = horizontal1[0][0] + horizontal1[0][1] + horizontal1[0][2];
        int soma2 = horizontal2[1][0] + horizontal2[1][1] + horizontal2[1][2];
        int soma3 = horizontal3[2][0] + horizontal3[2][1] + horizontal3[2][2];
        assertEquals(QUINZE, soma1);
        assertEquals(QUINZE, soma2);
        assertEquals(QUINZE, soma3);
    }
    
    @Test
    public void deveRetornarQuinzeNaVertical() {
        int[][] vertical1 = preencheQuadrado();
        int[][] vertical2 = preencheQuadrado();
        int[][] vertical3 = preencheQuadrado();
        int soma1 = vertical1[0][0] + vertical1[1][0] + vertical1[2][0];
        int soma2 = vertical2[0][1] + vertical2[1][1] + vertical2[2][1];
        int soma3 = vertical3[0][2] + vertical3[1][2] + vertical3[2][2];
        assertEquals(QUINZE, soma1);
        assertEquals(QUINZE, soma2);
        assertEquals(QUINZE, soma3);
    }
    
    @Test
    public void deveRetornarQuinzeNaDiagonal() {
        int[][] diagonal1 = preencheQuadrado();
        int[][] diagonal2 = preencheQuadrado();
        int soma1 = diagonal1[0][0] + diagonal1[1][1] + diagonal1[2][2];
        int soma2 = diagonal2[0][2] + diagonal2[1][1] + diagonal2[2][0];
        assertEquals(QUINZE, soma1);
        assertEquals(QUINZE, soma2);
    }
    
    @Test
    public void deveTerNumeroParNosCantos() {
        int[][] cantos = preencheQuadrado();
        assertEquals(cantos[0][0] % 2 == 0, true);
        assertEquals(cantos[0][2] % 2 == 0, true);
        assertEquals(cantos[2][0] % 2 == 0, true);
        assertEquals(cantos[2][2] % 2 == 0, true);
    }
    
    @Test
    public void deveVerificarPosicaoNumeroCinco() {
        int[][] quadrado = preencheQuadrado();
        assertEquals(5, quadrado[1][1]);
    }
    
    @Test
    public void deveVerificarPosicaoNumeroUm() {
        int[][] quadrado = preencheQuadrado();
        boolean posicaoUm = (quadrado[0][1] == 1 || quadrado[2][1] == 1|| quadrado[1][0] == 1 || quadrado[1][2] == 1);
        assertTrue(posicaoUm);
    }
    
    @Test
    public void deveVerificarPosicaoNumeroDois() {
        int[][] quadrado = preencheQuadrado();
        boolean posicaoDois = (quadrado[0][0] == 2 || quadrado[0][2] == 2|| quadrado[2][0] == 2 || quadrado[2][2] == 2);
        assertTrue(posicaoDois);
    }
    
    @Test
    public void deveVerificarPosicaoNumeroOito() {
        int[][] quadrado = preencheQuadrado();
        boolean posicaoOito = (quadrado[0][0] == 8 || quadrado[0][2] == 8|| quadrado[2][0] == 8 || quadrado[2][2] == 8);
        assertTrue(posicaoOito);
    }
    
    /**
     * mock
     * @return
     */
    private int[][] preencheQuadrado() {
        quadrado[0][0] = 2;
        quadrado[0][1] = 9;
        quadrado[0][2] = 4;
        
        quadrado[1][0] = 7;
        quadrado[1][2] = 3;
        
        quadrado[2][0] = 6;
        quadrado[2][1] = 1;
        quadrado[2][2] = 8;
        
        return quadrado;
    }
}
