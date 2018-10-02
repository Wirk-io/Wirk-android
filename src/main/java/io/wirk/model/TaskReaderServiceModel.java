package io.wirk.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.wirk.model.Outputs;
import java.util.Date;

import com.google.gson.annotations.SerializedName;


/**
 * Model for TaskReaderServiceModel
 */
@ApiModel(description = "Model for TaskReaderServiceModel")
public class TaskReaderServiceModel   {
  
  @SerializedName("IdTask")
  private Integer idTask = null;

  @SerializedName("Outputs")
  private Outputs outputs = null;

  @SerializedName("UpdateDate")
  private Date updateDate = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Integer getIdTask() {
    return idTask;
  }
  public void setIdTask(Integer idTask) {
    this.idTask = idTask;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Outputs getOutputs() {
    return outputs;
  }
  public void setOutputs(Outputs outputs) {
    this.outputs = outputs;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Date getUpdateDate() {
    return updateDate;
  }
  public void setUpdateDate(Date updateDate) {
    this.updateDate = updateDate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskReaderServiceModel taskReaderServiceModel = (TaskReaderServiceModel) o;
    return Objects.equals(this.idTask, taskReaderServiceModel.idTask) &&
        Objects.equals(this.outputs, taskReaderServiceModel.outputs) &&
        Objects.equals(this.updateDate, taskReaderServiceModel.updateDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idTask, outputs, updateDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskReaderServiceModel {\n");
    
    sb.append("    idTask: ").append(toIndentedString(idTask)).append("\n");
    sb.append("    outputs: ").append(toIndentedString(outputs)).append("\n");
    sb.append("    updateDate: ").append(toIndentedString(updateDate)).append("\n");
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

