package io.wirk.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;


/**
 * Model for Outputs
 */
@ApiModel(description = "Model for Outputs")
public class Outputs   {
  
  @SerializedName("IdOutput")
  private Integer idOutput = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Integer getIdOutput() {
    return idOutput;
  }
  public void setIdOutput(Integer idOutput) {
    this.idOutput = idOutput;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Outputs outputs = (Outputs) o;
    return Objects.equals(this.idOutput, outputs.idOutput);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idOutput);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Outputs {\n");
    
    sb.append("    idOutput: ").append(toIndentedString(idOutput)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

