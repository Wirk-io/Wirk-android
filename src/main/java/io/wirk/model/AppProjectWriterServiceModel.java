package io.wirk.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;


/**
 * Model for AppProject
 */
@ApiModel(description = "Model for AppProject")
public class AppProjectWriterServiceModel   {
  
  @SerializedName("IdApp")
  private Integer idApp = null;

  @SerializedName("IdQuality")
  private Integer idQuality = null;

  @SerializedName("Instruction")
  private String instruction = null;

  @SerializedName("QuestionOptions")
  private List<String> questionOptions = new ArrayList<String>();

  @SerializedName("Title")
  private String title = null;

  @SerializedName("UrlNotification")
  private String urlNotification = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Integer getIdApp() {
    return idApp;
  }
  public void setIdApp(Integer idApp) {
    this.idApp = idApp;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getIdQuality() {
    return idQuality;
  }
  public void setIdQuality(Integer idQuality) {
    this.idQuality = idQuality;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getInstruction() {
    return instruction;
  }
  public void setInstruction(String instruction) {
    this.instruction = instruction;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<String> getQuestionOptions() {
    return questionOptions;
  }
  public void setQuestionOptions(List<String> questionOptions) {
    this.questionOptions = questionOptions;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getUrlNotification() {
    return urlNotification;
  }
  public void setUrlNotification(String urlNotification) {
    this.urlNotification = urlNotification;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppProjectWriterServiceModel appProjectWriterServiceModel = (AppProjectWriterServiceModel) o;
    return Objects.equals(this.idApp, appProjectWriterServiceModel.idApp) &&
        Objects.equals(this.idQuality, appProjectWriterServiceModel.idQuality) &&
        Objects.equals(this.instruction, appProjectWriterServiceModel.instruction) &&
        Objects.equals(this.questionOptions, appProjectWriterServiceModel.questionOptions) &&
        Objects.equals(this.title, appProjectWriterServiceModel.title) &&
        Objects.equals(this.urlNotification, appProjectWriterServiceModel.urlNotification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idApp, idQuality, instruction, questionOptions, title, urlNotification);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppProjectWriterServiceModel {\n");
    
    sb.append("    idApp: ").append(toIndentedString(idApp)).append("\n");
    sb.append("    idQuality: ").append(toIndentedString(idQuality)).append("\n");
    sb.append("    instruction: ").append(toIndentedString(instruction)).append("\n");
    sb.append("    questionOptions: ").append(toIndentedString(questionOptions)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    urlNotification: ").append(toIndentedString(urlNotification)).append("\n");
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

