package model;


public class Task {
    
    private Number origem;
    private Number destino;
    private Number plano;
    private Number duracao;

    public Task(Number origem, Number destino, Number plano, Number duracao) {
        this.origem = origem;
        this.destino = destino;
        this.plano = plano;
        this.duracao = duracao;
    }

    public Task(){
    }

    public void setOrigem(Number origem) {
        this.origem = origem;
    }
    public Number getOrigem() {
        return origem;
    }
    public void setDestino(Number destino) {
        this.destino = destino;
    }
    public Number getDestino() {
        return destino;
    }
    public void setPlano(Number plano) {
        this.plano = plano;
    }
    public Number getPlano() {
        return plano;
    }
    public void setDuracao(Number duracao) {
        this.duracao = duracao;
    }
    public Number getDuracao() {
        return duracao;
    }
    
}
