package livraria.ejb;

import javax.ejb.Remote;
import livraria.modelo.Livro;

@Remote
public interface LivroRemote {
  public Livro salvar(Livro livro) throws Exception;
  public void remover(Long id);
  public Livro consultarPorId(Long id);
}
