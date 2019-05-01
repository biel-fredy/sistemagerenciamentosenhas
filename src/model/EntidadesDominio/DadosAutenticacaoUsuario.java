package model.EntidadesDominio;

public class DadosAutenticacaoUsuario extends EntidadeDominio {
    
    private String login;
    private String senhaAcesso;
        
    private Sistema sistema;

    public DadosAutenticacaoUsuario(String login, String senhaAcesso, Sistema sistema) {
        super();
        this.login = login;
        this.senhaAcesso = senhaAcesso;
        this.sistema = sistema;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
    
    public String getSenhaDeAcesso() {
        return senhaAcesso;
    }

    public void setSenhaDeAcesso(String senhaDeAcesso) {
        this.senhaAcesso = senhaDeAcesso;
    }
    
     public Sistema getSistema() {
        return sistema;
    }

    public void setSistema(Sistema sistema) {
        this.sistema = sistema;
    }
}
