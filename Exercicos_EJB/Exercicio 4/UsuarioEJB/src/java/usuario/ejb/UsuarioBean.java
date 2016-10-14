package usuario.ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import usuario.dao.UsuarioDAO;
import usuario.modelo.Usuario;

@Stateless
public class UsuarioBean implements UsuarioRemote {

  @PersistenceContext(unitName="UsuarioPU")
  private EntityManager em;
  
  @Override
  public Usuario salvar(Usuario usuario) throws Exception {
    UsuarioDAO dao = new UsuarioDAO(em);
    return dao.salvar(usuario);
  }

  @Override
  public void remover(Long id) {
    UsuarioDAO dao = new UsuarioDAO(em);
    dao.remover(id);
  }

  @Override
  public Usuario consultarPorId(Long id) {
    UsuarioDAO dao = new UsuarioDAO(em);
    return dao.consultarPorId(id);
  }

}
