package pbc.mb;

import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import pbc.ejb.AutenticacaoRemote;

@ManagedBean
public class LoginMB {
  private String login;
  private String senha;
  
  @EJB
  private AutenticacaoRemote ejb;
  
  public String autenticar() {
    boolean autenticado = ejb.autenticar(login, senha);
    if(autenticado) {
      return "principal";
    } else {
      FacesMessage fm = new FacesMessage("Usuário ou senha inválido!!!");
      FacesContext.getCurrentInstance().addMessage("erro", fm);
      return null;
    }
  }

  public String getLogin() {
    return login;
  }

  public void setLogin(String login) {
    this.login = login;
  }

  public String getSenha() {
    return senha;
  }

  public void setSenha(String senha) {
    this.senha = senha;
  }
}
