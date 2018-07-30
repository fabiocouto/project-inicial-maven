package br.com.unicred.logica;

public class Groselha {

    public String solution(int[] T) {
        String result = "";
        int summer = T[0] - T[1];
        int autum = T[2] - T[3];
        int winter = T[4] - T[5];
        int spring = T[7] - T[6];

        int[] i = new int[4];
        i[0] = summer;
        i[1] = autum;
        i[2] = winter;
        i[3] = spring;

        int maior = 0;
        int tamanho = i.length;

        for (int j = 0; j < tamanho; j++) {
            if (i[j] > maior) {
                maior = (int) i[j];
            }
        }

        if (summer == maior) {
            result = "SUMMER";
        } 
        if (autum == maior) {
            result = "AUTUM";
        } 
        if (winter == maior) {
            result = "WINTER";
        } 
        if (spring == maior) {
            result = "SPRING";
        } 
        System.out.println(result);
        return result;
    }
}
