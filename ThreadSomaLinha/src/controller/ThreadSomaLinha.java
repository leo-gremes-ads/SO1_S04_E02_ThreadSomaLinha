package controller;

public class ThreadSomaLinha extends Thread
{
    private int numLinha;
    private int [] linha;
    private int total;

    public ThreadSomaLinha(int numLinha, int[] linha)
    {
        this.numLinha = numLinha;
        this.linha = linha;
    }

    @Override
    public void run()
    {
        int tam = linha.length;
        for (int i = 0; i < tam; i++)
            this.total += this.linha[i];
        System.out.println("Linha " + this.numLinha + " --> soma = " + this.total);
    }
}