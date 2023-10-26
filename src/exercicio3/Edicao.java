package exercicio3;

import java.util.ArrayList;

public class Edicao {
    private int numero;
    private int volume;
    private String dataEdicao;
    private int tiragem;
    private ArrayList<Artigo> artigos;

    public Edicao(int numero, int volume, String dataEdicao, int tiragem) {
        this.numero = numero;
        this.volume = volume;
        this.dataEdicao = dataEdicao;
        this.tiragem = tiragem;
        this.artigos = new ArrayList<>();
    }

    public void adicionaArtigo(Artigo artigo) {
        artigos.add(artigo);
    }

    public int getNumero() {
        return numero;
    }

    public int getVolume() {
        return volume;
    }

    public String getDataEdicao() {
        return dataEdicao;
    }

    public int getTiragem() {
        return tiragem;
    }

    public ArrayList<Artigo> getArtigos() {
        return artigos;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setDataEdicao(String dataEdicao) {
        this.dataEdicao = dataEdicao;
    }

    public void setTiragem(int tiragem) {
        this.tiragem = tiragem;
    }

    public void setArtigos(ArrayList<Artigo> artigos) {
        this.artigos = artigos;
    }



}
