package usuario.modelo;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name="USUARIO_SEQ", sequenceName="USUARIO_SEQ",
        initialValue=1, allocationSize=1)
public class Usuario implements Serializable {
  private static final long serialVersionUID = -1401404580917752995L;
  
  @Id
  @GeneratedValue(strategy= GenerationType.SEQUENCE, generator="USUARIO_SEQ")
  private Long id;
  private String nome;
  private String login;
  private String senha;
  private String perfil;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getLogin() {
    return login;
  }

  public void setLogin(String login) {
    this.login = login;
  }

  public String getSenha() {
    return senha;
  }

  public void setSenha(String senha) {
    this.senha = senha;
  }

  public String getPerfil() {
    return perfil;
  }

  public void setPerfil(String perfil) {
    this.perfil = perfil;
  }

  @Override
  public String toString() {
    return "Usuario{" + "id=" + id + ", nome=" + nome + ", login=" + login + ", senha=" + senha + ", perfil=" + perfil + '}';
  }
}
