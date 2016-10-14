package pbc.ejb;

import javax.ejb.Stateless;

@Stateless
public class ConversorMoedasBean implements ConversorMoedasRemote {

  private static final String REAL = "BRL";
  private static final String DOLAR = "USD";
  private static final String EURO = "EUR";
  
  private static final double COTACAO_DOLAR_REAL = 2.29;
  private static final double COTACAO_EURO_REAL = 3.03;
  private static final double COTACAO_EURO_DOLAR = 1.33;
  
  @Override
  public double converter(String de, String para, double valor) {
    double total = 0;
    
    //Se tentar converter para tipos de moedas iguais, então devolve o próprio valor.
    if(de.contains(para)) {
      total = valor;
    } else {
      //Realiza a conversão das moedas.
      if(REAL.equals(de) && DOLAR.equals(para)) {
        total = valor / COTACAO_DOLAR_REAL;
      } else if(DOLAR.equals(de) && REAL.equals(para)) {
        total = valor * COTACAO_DOLAR_REAL;
      } else if(REAL.equals(de) && EURO.equals(para)) {
        total = valor / COTACAO_EURO_REAL;
      } else if(EURO.equals(de) && REAL.equals(para)) {
        total = valor * COTACAO_EURO_REAL;
      } else if(DOLAR.equals(de) && EURO.equals(para)) {
        total = valor / COTACAO_EURO_DOLAR;
      } else if(EURO.equals(de) && DOLAR.equals(para)) {
        total = valor * COTACAO_EURO_DOLAR;
      }
    }
    return total;
  }
  
}
