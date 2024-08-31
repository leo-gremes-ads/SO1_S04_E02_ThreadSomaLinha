package view;

import controller.*;
import java.util.Random;

public class Main
{
    public static void main(String[] args)
    {
        int linhas = 3;
        int colunas = 5;
        ThreadSomaLinha[] t = new ThreadSomaLinha[linhas];
        Random r = new Random();
        int [][] matriz = new int[linhas][colunas];
        //Preencher Matriz
        for (int l = 0; l < linhas; l++) {
            for (int c = 0; c < colunas; c++) {
                matriz[l][c] = r.nextInt(99);
            }
        }
        //Imprimindo a matriz
        for (int l = 0; l < linhas; l++) {
            for (int c = 0; c < colunas; c++) {
                System.out.print("[" + String.format("%2d", matriz[l][c]) + "] ");
            }
            System.out.println();
        }
        //Somando e exibindo
        System.out.println("----- Soma das linhas pelas threads -----");
        for (int i = 0; i < linhas; i++) {
            t[i] = new ThreadSomaLinha(i, matriz[i]);
            t[i].start();
        }
    }
}