package br.com.rfernandon.demoswaggercodegen.model;

import java.util.Objects;
import br.com.rfernandon.demoswaggercodegen.model.Usuario;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Objeto utilizado para representar os dados da publicação
 */
@ApiModel(description = "Objeto utilizado para representar os dados da publicação")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-01-08T20:38:48.807-02:00")

public class Postagem   {
  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("data")
  private LocalDateTime data = null;

  @JsonProperty("titulo")
  private String titulo = null;

  @JsonProperty("mensagem")
  private String mensagem = null;

  @JsonProperty("usuario")
  private Usuario usuario = null;

  public Postagem id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Identificador unica da publicação
   * @return id
  **/
  @ApiModelProperty(value = "Identificador unica da publicação")


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Postagem data(LocalDateTime data) {
    this.data = data;
    return this;
  }

  /**
   * Data e hora em que a postagem foi publicada
   * @return data
  **/
  @ApiModelProperty(required = true, value = "Data e hora em que a postagem foi publicada")
  @NotNull

  @Valid

  public LocalDateTime getData() {
    return data;
  }

  public void setData(LocalDateTime data) {
    this.data = data;
  }

  public Postagem titulo(String titulo) {
    this.titulo = titulo;
    return this;
  }

  /**
   * Titulo da publicação
   * @return titulo
  **/
  @ApiModelProperty(required = true, value = "Titulo da publicação")
  @NotNull


  public String getTitulo() {
    return titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public Postagem mensagem(String mensagem) {
    this.mensagem = mensagem;
    return this;
  }

  /**
   * Mensagem da publicação
   * @return mensagem
  **/
  @ApiModelProperty(required = true, value = "Mensagem da publicação")
  @NotNull


  public String getMensagem() {
    return mensagem;
  }

  public void setMensagem(String mensagem) {
    this.mensagem = mensagem;
  }

  public Postagem usuario(Usuario usuario) {
    this.usuario = usuario;
    return this;
  }

  /**
   * Get usuario
   * @return usuario
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public Usuario getUsuario() {
    return usuario;
  }

  public void setUsuario(Usuario usuario) {
    this.usuario = usuario;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Postagem postagem = (Postagem) o;
    return Objects.equals(this.id, postagem.id) &&
        Objects.equals(this.data, postagem.data) &&
        Objects.equals(this.titulo, postagem.titulo) &&
        Objects.equals(this.mensagem, postagem.mensagem) &&
        Objects.equals(this.usuario, postagem.usuario);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, data, titulo, mensagem, usuario);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Postagem {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    titulo: ").append(toIndentedString(titulo)).append("\n");
    sb.append("    mensagem: ").append(toIndentedString(mensagem)).append("\n");
    sb.append("    usuario: ").append(toIndentedString(usuario)).append("\n");
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

