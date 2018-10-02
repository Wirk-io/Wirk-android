package io.wirk.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.wirk.model.TaskReaderServiceModel;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;


/**
 * Model for TaskLineReaderServiceModel
 */
@ApiModel(description = "Model for TaskLineReaderServiceModel")
public class TaskLineReaderServiceModel   {
  
  @SerializedName("IdAppProject")
  private Integer idAppProject = null;

  @SerializedName("IdTaskLine")
  private Integer idTaskLine = null;

  @SerializedName("Inputs")
  private List<String> inputs = new ArrayList<String>();

  @SerializedName("Tasks")
  private List<TaskReaderServiceModel> tasks = new ArrayList<TaskReaderServiceModel>();

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
  public Integer getIdTaskLine() {
    return idTaskLine;
  }
  public void setIdTaskLine(Integer idTaskLine) {
    this.idTaskLine = idTaskLine;
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

  /**
   **/
  @ApiModelProperty(value = "")
  public List<TaskReaderServiceModel> getTasks() {
    return tasks;
  }
  public void setTasks(List<TaskReaderServiceModel> tasks) {
    this.tasks = tasks;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskLineReaderServiceModel taskLineReaderServiceModel = (TaskLineReaderServiceModel) o;
    return Objects.equals(this.idAppProject, taskLineReaderServiceModel.idAppProject) &&
        Objects.equals(this.idTaskLine, taskLineReaderServiceModel.idTaskLine) &&
        Objects.equals(this.inputs, taskLineReaderServiceModel.inputs) &&
        Objects.equals(this.tasks, taskLineReaderServiceModel.tasks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idAppProject, idTaskLine, inputs, tasks);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskLineReaderServiceModel {\n");
    
    sb.append("    idAppProject: ").append(toIndentedString(idAppProject)).append("\n");
    sb.append("    idTaskLine: ").append(toIndentedString(idTaskLine)).append("\n");
    sb.append("    inputs: ").append(toIndentedString(inputs)).append("\n");
    sb.append("    tasks: ").append(toIndentedString(tasks)).append("\n");
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

