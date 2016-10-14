package livraria.dao;

import javax.persistence.EntityManager;
import livraria.modelo.Livro;

public class LivroDAO {
  private EntityManager em;

  public LivroDAO(EntityManager em) {
    this.em = em;
  }
  
  public Livro salvar(Livro livro) throws Exception {
    if(livro.getId() == null) {
      em.persist(livro);
    } else {
      if(!em.contains(livro)) {
        if(consultarPorId(livro.getId()) == null) {
          throw new Exception("Erro ao atualizar os dados do Livro!!!");
        }
      }
      livro = em.merge(livro);
    }
    
    return livro;
  }
  
  public Livro consultarPorId(Long id) {
    return em.find(Livro.class, id);
  }
  
  public void remover(Long id) {
    Livro livro = consultarPorId(id);
    em.remove(livro);
  }
}
