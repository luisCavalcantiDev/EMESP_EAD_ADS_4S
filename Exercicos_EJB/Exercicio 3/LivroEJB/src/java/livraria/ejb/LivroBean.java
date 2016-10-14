package livraria.ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import livraria.dao.LivroDAO;
import livraria.modelo.Livro;

@Stateless
public class LivroBean implements LivroRemote {

  @PersistenceContext(unitName="LivrariaPU")
  private EntityManager em;
  
  @Override
  public Livro salvar(Livro livro) throws Exception {
    LivroDAO dao = new LivroDAO(em);
    return dao.salvar(livro);
  }

  @Override
  public void remover(Long id) {
    LivroDAO dao = new LivroDAO(em);
    dao.remover(id);
  }

  @Override
  public Livro consultarPorId(Long id) {
    LivroDAO dao = new LivroDAO(em);
    return dao.consultarPorId(id);
  }

}
