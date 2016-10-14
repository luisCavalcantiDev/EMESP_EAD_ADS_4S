package pbc.ejb;

import javax.ejb.Stateless;

@Stateless
public class HelloWorldBean implements HelloWorldRemote {

  @Override
  public String ola() {
    return "Ola mundo com EJB.";
  }
  
}
