package usuario.ejb;

import javax.ejb.Remote;
import usuario.modelo.Usuario;

@Remote
public interface UsuarioRemote {
  public Usuario salvar(Usuario usuario) throws Exception;
  public void remover(Long id);
  public Usuario consultarPorId(Long id);
}
