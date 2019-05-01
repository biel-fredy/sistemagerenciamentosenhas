package model.EntidadesDominio;

public class ConfiguracaoForcaSenha extends EntidadeDominio {
    
    private Integer tamanhoMinimoSenha;
    private Integer numeroMinimoMinusculas;
    private Integer numeroMinimoMaiusculas;
    private Integer numeroMinimoDigitos;
    private Integer numeroMinimoSimbolos;

    public ConfiguracaoForcaSenha(Integer tamanhoMinimoSenha, Integer numeroMinimoMinusculas, Integer numeroMinimoMaiusculas, Integer numeroMinimoDigitos, Integer numeroMinimoSimbolos) {
        super();
        this.tamanhoMinimoSenha = tamanhoMinimoSenha;
        this.numeroMinimoMinusculas = numeroMinimoMinusculas;
        this.numeroMinimoMaiusculas = numeroMinimoMaiusculas;
        this.numeroMinimoDigitos = numeroMinimoDigitos;
        this.numeroMinimoSimbolos = numeroMinimoSimbolos;
    }
    
    public Integer getTamanhoMinimoSenha() {
        return tamanhoMinimoSenha;
    }

    public void setTamanhoMinimoSenha(Integer tamanhoMinimoSenha) {
        this.tamanhoMinimoSenha = tamanhoMinimoSenha;
    }

    public Integer getNumeroMinimoMinusculas() {
        return numeroMinimoMinusculas;
    }

    public void setNumeroMinimoMinusculas(Integer numeroMinimoMinusculas) {
        this.numeroMinimoMinusculas = numeroMinimoMinusculas;
    }

    public Integer getNumeroMinimoMaiusculas() {
        return numeroMinimoMaiusculas;
    }

    public void setNumeroMinimoMaiusculas(Integer numeroMinimoMaiusculas) {
        this.numeroMinimoMaiusculas = numeroMinimoMaiusculas;
    }

    public Integer getNumeroMinimoDigitos() {
        return numeroMinimoDigitos;
    }

    public void setNumeroMinimoDigitos(Integer numeroMinimoDigitos) {
        this.numeroMinimoDigitos = numeroMinimoDigitos;
    }

    public Integer getNumeroMinimoSimbolos() {
        return numeroMinimoSimbolos;
    }

    public void setNumeroMinimoSimbolos(Integer numeroMinimoSimbolos) {
        this.numeroMinimoSimbolos = numeroMinimoSimbolos;
    }            
}
