package pbc.teste;

import java.util.Properties;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import pbc.ejb.HelloWorldRemote;

public class TesteEJB {

  public static void main(String[] args) {
    try {
      /* Monta um objeto Properties com as informações para localizar o GlassFish. */ 
      Properties props = new Properties();
      props.put("org.omg.CORBA.ORBInitialHost", "localhost");
      props.put("org.omg.CORBA.ORBInitialPort", "3700");
      /* Método que faz o lookup para encontrar o EJB de HelloWorldRemote. */
      InitialContext ctx = new InitialContext();
      HelloWorldRemote ejb = (HelloWorldRemote) ctx.lookup("pbc.ejb.HelloWorldRemote");
      System.out.println(ejb.ola());
    } catch (NamingException ex) {
      ex.printStackTrace();
      System.out.println("Não encontrou o EJB.");
    } catch (Exception ex) {
      ex.printStackTrace();
      System.out.println(ex.getMessage());
    }
  }
}
