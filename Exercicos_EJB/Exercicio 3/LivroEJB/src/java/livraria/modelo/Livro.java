package livraria.modelo;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name="LIVRO_SEQ", sequenceName="LIVRO_SEQ",
        initialValue=1, allocationSize=1)
public class Livro implements Serializable {
  private static final long serialVersionUID = 8085445022942584428L;
  @Id
  @GeneratedValue(strategy= GenerationType.SEQUENCE, generator="PES_SEQ")
  private Long id;
  private String titulo;
  private String autor;
  private String isbn;
  private Integer paginas;
  private Double preco;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getTitulo() {
    return titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public String getAutor() {
    return autor;
  }

  public void setAutor(String autor) {
    this.autor = autor;
  }

  public String getIsbn() {
    return isbn;
  }

  public void setIsbn(String isbn) {
    this.isbn = isbn;
  }

  public Integer getPaginas() {
    return paginas;
  }

  public void setPaginas(Integer paginas) {
    this.paginas = paginas;
  }

  public Double getPreco() {
    return preco;
  }

  public void setPreco(Double preco) {
    this.preco = preco;
  }

  @Override
  public String toString() {
    return "Livro{" + "id=" + id + ", titulo=" + titulo + ", autor=" + autor + ", isbn=" + isbn + ", paginas=" + paginas + ", preco=" + preco + '}';
  }
  
}
