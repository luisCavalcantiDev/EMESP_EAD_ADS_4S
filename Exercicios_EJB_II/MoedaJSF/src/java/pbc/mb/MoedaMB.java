package pbc.mb;

import java.math.BigDecimal;
import java.math.RoundingMode;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import pbc.ejb.ConversorMoedasRemote;

@ManagedBean
public class MoedaMB {
  private String de;
  private String para;
  private double valor;
  private BigDecimal resultado;
  
  @EJB
  private ConversorMoedasRemote ejb;

  public String converter() {
    //Chama o EJB para realizar a conversão
    double total = ejb.converter(de, para, valor);
    
    //Arredonda para duas casas decimais
    resultado = new BigDecimal(total).setScale(2, RoundingMode.HALF_UP);
    return null;
  }
  
  public String getDe() {
    return de;
  }

  public void setDe(String de) {
    this.de = de;
  }

  public String getPara() {
    return para;
  }

  public void setPara(String para) {
    this.para = para;
  }

  public double getValor() {
    return valor;
  }

  public void setValor(double valor) {
    this.valor = valor;
  }

  public BigDecimal getResultado() {
    return resultado;
  }

  public void setResultado(BigDecimal resultado) {
    this.resultado = resultado;
  }
}
