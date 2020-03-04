package br.com.rfernandon.demoswaggercodegen.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Objeto utilizado para representar os dados da mensagem de erro
 */
@ApiModel(description = "Objeto utilizado para representar os dados da mensagem de erro")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-03-03T23:00:40.543-03:00")

public class ErrorDetails   {
  @JsonProperty("timestamp")
  private LocalDateTime timestamp = null;

  @JsonProperty("statusCode")
  private Integer statusCode = null;

  @JsonProperty("statusMessage")
  private String statusMessage = null;

  @JsonProperty("message")
  private String message = null;

  @JsonProperty("path")
  private String path = null;

  @JsonProperty("exception")
  private String exception = null;

  public ErrorDetails timestamp(LocalDateTime timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * Data e hora em que o erro ocorreu
   * @return timestamp
  **/
  @ApiModelProperty(required = true, value = "Data e hora em que o erro ocorreu")
  @NotNull

  @Valid

  public LocalDateTime getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(LocalDateTime timestamp) {
    this.timestamp = timestamp;
  }

  public ErrorDetails statusCode(Integer statusCode) {
    this.statusCode = statusCode;
    return this;
  }

  /**
   * Código do status http
   * @return statusCode
  **/
  @ApiModelProperty(required = true, value = "Código do status http")
  @NotNull


  public Integer getStatusCode() {
    return statusCode;
  }

  public void setStatusCode(Integer statusCode) {
    this.statusCode = statusCode;
  }

  public ErrorDetails statusMessage(String statusMessage) {
    this.statusMessage = statusMessage;
    return this;
  }

  /**
   * Mensagem do código do status http
   * @return statusMessage
  **/
  @ApiModelProperty(required = true, value = "Mensagem do código do status http")
  @NotNull


  public String getStatusMessage() {
    return statusMessage;
  }

  public void setStatusMessage(String statusMessage) {
    this.statusMessage = statusMessage;
  }

  public ErrorDetails message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Mensagem gerada pela aplicação
   * @return message
  **/
  @ApiModelProperty(required = true, value = "Mensagem gerada pela aplicação")
  @NotNull


  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public ErrorDetails path(String path) {
    this.path = path;
    return this;
  }

  /**
   * Path que o erro ocorreu
   * @return path
  **/
  @ApiModelProperty(value = "Path que o erro ocorreu")


  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public ErrorDetails exception(String exception) {
    this.exception = exception;
    return this;
  }

  /**
   * Exception referente ao erro ocorrido
   * @return exception
  **/
  @ApiModelProperty(value = "Exception referente ao erro ocorrido")


  public String getException() {
    return exception;
  }

  public void setException(String exception) {
    this.exception = exception;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorDetails errorDetails = (ErrorDetails) o;
    return Objects.equals(this.timestamp, errorDetails.timestamp) &&
        Objects.equals(this.statusCode, errorDetails.statusCode) &&
        Objects.equals(this.statusMessage, errorDetails.statusMessage) &&
        Objects.equals(this.message, errorDetails.message) &&
        Objects.equals(this.path, errorDetails.path) &&
        Objects.equals(this.exception, errorDetails.exception);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timestamp, statusCode, statusMessage, message, path, exception);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorDetails {\n");
    
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
    sb.append("    statusMessage: ").append(toIndentedString(statusMessage)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    exception: ").append(toIndentedString(exception)).append("\n");
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

