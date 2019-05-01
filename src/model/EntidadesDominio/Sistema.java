package model.EntidadesDominio;

public class Sistema {
    
    private String nome;
    
    private ConfiguracaoForcaSenha configuracaoForcaSenha;

    public Sistema(String nome, ConfiguracaoForcaSenha configuracaoForcaSenha) {
        super();
        this.nome = nome;
        this.configuracaoForcaSenha = configuracaoForcaSenha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ConfiguracaoForcaSenha getConfiguracaoForcaSenha() {
        return configuracaoForcaSenha;
    }

    public void setConfiguracaoForcaSenha(ConfiguracaoForcaSenha configuracaoForcaSenha) {
        this.configuracaoForcaSenha = configuracaoForcaSenha;
    }   
}
