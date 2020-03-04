package br.com.rfernandon.demoswaggercodegen.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Objeto utilizado para representar os dados do usuário
 */
@ApiModel(description = "Objeto utilizado para representar os dados do usuário")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-03-03T23:00:40.543-03:00")

public class Usuario   {
  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("nome")
  private String nome = null;

  @JsonProperty("username")
  private String username = null;

  @JsonProperty("email")
  private String email = null;

  /**
   * Define o perfil do usuário
   */
  public enum PerfilEnum {
    ADMIN("ADMIN"),
    
    VISITANTE("VISITANTE");

    private String value;

    PerfilEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static PerfilEnum fromValue(String text) {
      for (PerfilEnum b : PerfilEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("perfil")
  private PerfilEnum perfil = null;

  public Usuario id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Identificador unico do usuário
   * @return id
  **/
  @ApiModelProperty(value = "Identificador unico do usuário")


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Usuario nome(String nome) {
    this.nome = nome;
    return this;
  }

  /**
   * Nome do usuário
   * @return nome
  **/
  @ApiModelProperty(required = true, value = "Nome do usuário")
  @NotNull

@Size(min=5,max=60) 
  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public Usuario username(String username) {
    this.username = username;
    return this;
  }

  /**
   * Username do usuário
   * @return username
  **/
  @ApiModelProperty(required = true, value = "Username do usuário")
  @NotNull


  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public Usuario email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Email do usuário
   * @return email
  **/
  @ApiModelProperty(required = true, value = "Email do usuário")
  @NotNull


  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Usuario perfil(PerfilEnum perfil) {
    this.perfil = perfil;
    return this;
  }

  /**
   * Define o perfil do usuário
   * @return perfil
  **/
  @ApiModelProperty(value = "Define o perfil do usuário")


  public PerfilEnum getPerfil() {
    return perfil;
  }

  public void setPerfil(PerfilEnum perfil) {
    this.perfil = perfil;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Usuario usuario = (Usuario) o;
    return Objects.equals(this.id, usuario.id) &&
        Objects.equals(this.nome, usuario.nome) &&
        Objects.equals(this.username, usuario.username) &&
        Objects.equals(this.email, usuario.email) &&
        Objects.equals(this.perfil, usuario.perfil);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, nome, username, email, perfil);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Usuario {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    perfil: ").append(toIndentedString(perfil)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

