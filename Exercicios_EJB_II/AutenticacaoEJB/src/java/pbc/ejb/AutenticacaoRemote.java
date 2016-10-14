package pbc.ejb;

import javax.ejb.Remote;

@Remote
public interface AutenticacaoRemote {
  public boolean autenticar(String login, String senha);
}
