package model;


public class Task {
    
    private int origem;
    private int destino;
    private int plano;
    private int duracao;

    public Task(int origem, int destino, int plano, int duracao) {
        this.origem = origem;
        this.destino = destino;
        this.plano = plano;
        this.duracao = duracao;
    }

    public Task(){
    }

    public void setOrigem(int origem) {
        this.origem = origem;
    }
    public Number getOrigem() {
        return origem;
    }
    public void setDestino(int destino) {
        this.destino = destino;
    }
    public int getDestino() {
        return destino;
    }
    public void setPlano(int plano) {
        this.plano = plano;
    }
    public int getPlano() {
        return plano;
    }
    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }
    public int getDuracao() {
        return duracao;
    }
    
}
