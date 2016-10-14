package usuario.mb;

import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import usuario.ejb.UsuarioRemote;
import usuario.modelo.Usuario;

@ManagedBean
@SessionScoped
public class UsuarioMB {
  private Usuario usuario;
  private Long usuarioId;
  
  @EJB
  private UsuarioRemote ejb;
  
  public UsuarioMB() {
    usuario = new Usuario();
  }
  
  public String pesquisar() {
    usuario = ejb.consultarPorId(usuarioId);
    
    if(usuario == null) {
      usuario = new Usuario();
    }
    
    return "index";
  }
  
  public String salvar() {
    try {
      ejb.salvar(usuario);
      
      usuario = new Usuario();
    } catch (Exception ex) {
      FacesMessage fm = new FacesMessage(ex.getMessage());
      FacesContext.getCurrentInstance().addMessage("erro", fm);
    }
    
    return "index";
  }
  
  public String remover() {
    ejb.remover(usuario.getId());
    usuario = new Usuario();
    
    return "index";
  }

  public String novo() {
     usuario = new Usuario();
     
     return "index";
  }

  public Usuario getUsuario() {
    return usuario;
  }

  public void setUsuario(Usuario usuario) {
    this.usuario = usuario;
  }

  public Long getUsuarioId() {
    return usuarioId;
  }

  public void setUsuarioId(Long usuarioId) {
    this.usuarioId = usuarioId;
  }
}
