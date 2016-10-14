package pbc.ejb;

import javax.ejb.Remote;

@Remote
public interface ConversorMoedasRemote {
  public double converter(String de, String para, double valor);
}
