package model.EntidadesDominio;

import java.util.Date;

public class EntidadeDominio {
    
    private Integer id;
    private Date dataCadastro;

    public EntidadeDominio() {
        super();
        this.dataCadastro = new Date();
    }   

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    
    public Integer getId() {
        return id;
    }   
}
