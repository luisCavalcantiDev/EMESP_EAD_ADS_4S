package usuario.dao;

import javax.persistence.EntityManager;
import usuario.modelo.Usuario;

public class UsuarioDAO {
  private EntityManager em;

  public UsuarioDAO(EntityManager em) {
    this.em = em;
  }
  
  public Usuario salvar(Usuario usuario) throws Exception {
    if(usuario.getId() == null) {
      em.persist(usuario);
    } else {
      if(!em.contains(usuario)) {
        if(consultarPorId(usuario.getId()) == null) {
          throw new Exception("Erro ao atualizar os dados do Usuário!!!");
        }
      }
      usuario = em.merge(usuario);
    }
    
    return usuario;
  }
  
  public Usuario consultarPorId(Long id) {
    return em.find(Usuario.class, id);
  }
  
  public void remover(Long id) {
    Usuario p = consultarPorId(id);
    em.remove(p);
  }
}
