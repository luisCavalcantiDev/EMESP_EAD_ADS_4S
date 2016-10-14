package pbc.ejb;

import java.util.HashMap;
import java.util.Map;
import javax.ejb.Stateless;

@Stateless
public class AutenticacaoBean implements AutenticacaoRemote {

  private static final Map<String, String> usuarios = new HashMap<String, String>();
  
  static {
    usuarios.put("administrador", "admin");
    usuarios.put("sakurai", "123456");
    usuarios.put("visitante", "abc123");
  }
  
  @Override
  public boolean autenticar(String login, String senha) {
    String senhaUsuario = usuarios.get(login);
    
    return senhaUsuario != null && senhaUsuario.equals(senha);
  }
  
}
