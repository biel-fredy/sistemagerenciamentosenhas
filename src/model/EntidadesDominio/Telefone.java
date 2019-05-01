package model.EntidadesDominio;

public class Telefone extends EntidadeDominio {
    
    private String numero;
    private Integer codigoOperadora;
    private String descricao;

    public Telefone(String numero, Integer codigoOperadora, String descricao) {
        super();
        this.numero = numero;
        this.codigoOperadora = codigoOperadora;
        this.descricao = descricao;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Integer getCodigoOperadora() {
        return codigoOperadora;
    }

    public void setCodigoOperadora(Integer codigoOperadora) {
        this.codigoOperadora = codigoOperadora;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    } 
}
