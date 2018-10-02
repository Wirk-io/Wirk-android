package io.wirk.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;


/**
 * Post taskline model
 */
@ApiModel(description = "Post taskline model")
public class TaskLineWriterServiceModel   {
  
  @SerializedName("IdAppProject")
  private Integer idAppProject = null;

  @SerializedName("Inputs")
  private List<String> inputs = new ArrayList<String>();

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Integer getIdAppProject() {
    return idAppProject;
  }
  public void setIdAppProject(Integer idAppProject) {
    this.idAppProject = idAppProject;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<String> getInputs() {
    return inputs;
  }
  public void setInputs(List<String> inputs) {
    this.inputs = inputs;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskLineWriterServiceModel taskLineWriterServiceModel = (TaskLineWriterServiceModel) o;
    return Objects.equals(this.idAppProject, taskLineWriterServiceModel.idAppProject) &&
        Objects.equals(this.inputs, taskLineWriterServiceModel.inputs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idAppProject, inputs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskLineWriterServiceModel {\n");
    
    sb.append("    idAppProject: ").append(toIndentedString(idAppProject)).append("\n");
    sb.append("    inputs: ").append(toIndentedString(inputs)).append("\n");
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

