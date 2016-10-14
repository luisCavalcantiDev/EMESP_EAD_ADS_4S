package pbc.ejb;

import javax.ejb.Remote;

@Remote
public interface CalculadoraRemote {
  public double somar(double a, double b);
  public double subtrair(double a, double b);
  public double multiplicar(double a, double b);
  public double dividir(double a, double b);
}
