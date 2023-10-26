package exercicio3;

public class RevistaCientifica {
    private String titulo;
    private long issn;
    private String peridiocidade;
    private Edicao edicoes;

    public RevistaCientifica(String titulo, long issn, String peridiocidade) {
        this.titulo = titulo;
        this.issn = issn;
        this.peridiocidade = peridiocidade;
    }

    public void adicionaEdicao(Edicao edicao) {
        this.edicoes = edicao;
    }

    public String getTitulo() {
        return titulo;
    }

    public long getIssn() {
        return issn;
    }

    public String getPeridiocidade() {
        return peridiocidade;
    }

    public Edicao getEdicoes() {
        return edicoes;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setIssn(long issn) {
        this.issn = issn;
    }

    public void setPeridiocidade(String peridiocidade) {
        this.peridiocidade = peridiocidade;
    }

    public void setEdicoes(Edicao edicoes) {
        this.edicoes = edicoes;
    }

    @Override
    public String toString() {
        return "RevistaCientifica{" +
                "titulo='" + titulo + '\'' +
                ", issn=" + issn +
                ", peridiocidade='" + peridiocidade + '\'' +
                ", edicoes=" + edicoes+
                "artigo= "+ edicoes.getArtigos()+
                '}';
    }
}
