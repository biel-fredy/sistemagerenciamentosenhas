package model.EntidadesDominio;

import java.util.ArrayList;
import java.util.List;

public class Usuario extends EntidadeDominio{
   
    private String nome;
    private String email;
    private Boolean status;
    
    private List<Telefone> telefone = new ArrayList();
    private List<DadosAutenticacaoUsuario> dadosAutenticacao = new ArrayList();

    public Usuario(String nome, String email) {
        super();
        this.nome = nome;
        this.email = email;
        this.status = true;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public List<Telefone> getTelefone() {
        return telefone;
    }
    
    public void addTelefone(Telefone telefone){
        this.telefone.add(telefone);
    }

    public List<DadosAutenticacaoUsuario> getSenha() {
        return dadosAutenticacao;
    }  
    
    public void addDadosAutenticacao(DadosAutenticacaoUsuario dadosAutenticacao){
        this.dadosAutenticacao.add(dadosAutenticacao);
    }
}
