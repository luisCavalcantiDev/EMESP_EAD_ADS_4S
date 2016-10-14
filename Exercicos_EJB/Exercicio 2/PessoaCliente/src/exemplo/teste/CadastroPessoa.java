package exemplo.teste;

import exemplo.ejb.PessoaRemote;
import exemplo.modelo.Pessoa;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.naming.InitialContext;

public class CadastroPessoa {
  public static void main(String[] args) throws Exception {
    InitialContext ctx = new InitialContext();
    PessoaRemote ejb = (PessoaRemote) ctx.lookup("exemplo.ejb.PessoaRemote");
    DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
    
    Pessoa p1 = new Pessoa();
    p1.setNome("Rafael Sakurai");
    p1.setNascimento(df.parse("26/12/1983"));
    
    p1 = ejb.salvar(p1);
    System.out.println("Pessoa salva com o id: " + p1.getId());

    Pessoa p2 = ejb.consultarPorId(p1.getId());
    System.out.println("Nome: " + p2.getNome());
    
    p2.setNome("Rafael Guimarães Sakurai");
    
    p2 = ejb.salvar(p2);
    
    ejb.remover(p2.getId());
    System.out.println("Pessoa removido do BD.");
  }
}
