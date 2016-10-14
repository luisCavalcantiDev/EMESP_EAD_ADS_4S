package livraria.cliente;

import javax.naming.InitialContext;
import livraria.ejb.LivroRemote;
import livraria.modelo.Livro;

public class LivroTeste {
  public static void main(String[] args) throws Exception {
    InitialContext ctx = new InitialContext();
    LivroRemote ejb = (LivroRemote) ctx.lookup("livraria.ejb.LivroRemote");
    
    Livro l1 = new Livro();
    l1.setAutor("Rafael Sakurai");
    l1.setTitulo("Café com Java");
    l1.setIsbn("0123456789123");
    l1.setPaginas(82);
    l1.setPreco(35.90);
    
    l1 = ejb.salvar(l1);
    System.out.println("Livro salvo: " + l1);

    Livro l2 = ejb.consultarPorId(l1.getId());
    System.out.println("Titulo: " + l2.getTitulo());
    
    l2.setAutor("Rafael Guimarães Sakurai");
    
    l2 = ejb.salvar(l2);
    
    ejb.remover(l2.getId());
    System.out.println("Livro removido do BD.");
  }
}
