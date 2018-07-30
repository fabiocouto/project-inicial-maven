package br.com.unicred.logica;


/**
 * 
 * @author juliane.bazilewitz
 *
 */
public class MainQuadradoMagico {

    @SuppressWarnings("static-access")
    public static void main(String[] args) {
//        int[][] quadrado = new int [3][3];
//        quadrado[1][1] = 5;
//        String nome = new JOptionPane().showInputDialog("Informe a posição do número 1: emcima, embaixo, direito ou esquerda");
//        if(nome.equals("emcima"))
//            quadrado[0][1] = 1;
//        if(nome.equals("embaixo"))
//            quadrado[2][1] = 1;
//        if(nome.equals("direita"))
//            quadrado[1][0] = 1;
//        if(nome.equals("esquerda"))
//            quadrado[1][2] = 1;
//        
//        QuadradoMagico quadradoMagico = new QuadradoMagico();
//        quadradoMagico.preencheQuadradoMagico(quadrado);
        int[] i = new int[8];
        i[0] = 2;
        i[1] = 1;
        i[2] = 1;
        i[3] = 10;
        i[4] = 2;
        i[5] = 13;
        i[6] = 3;
        i[7] = -18;
        Groselha tes = new Groselha();
        tes.solution(i);
    }
}
