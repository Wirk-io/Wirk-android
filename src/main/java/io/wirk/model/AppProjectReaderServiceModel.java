package io.wirk.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.wirk.model.QualityReaderServiceModel;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.google.gson.annotations.SerializedName;


/**
 * Model for AppProject Get
 */
@ApiModel(description = "Model for AppProject Get")
public class AppProjectReaderServiceModel   {
  
  @SerializedName("AppName")
  private String appName = null;

  @SerializedName("AppProjectState")
  private Integer appProjectState = null;

  @SerializedName("CreationDate")
  private Date creationDate = null;

  @SerializedName("Credit")
  private Integer credit = null;

  @SerializedName("HasInstruction")
  private Boolean hasInstruction = null;

  @SerializedName("HasQuestionOptions")
  private Boolean hasQuestionOptions = null;

  @SerializedName("IdApp")
  private Integer idApp = null;

  @SerializedName("IdAppProject")
  private Integer idAppProject = null;

  @SerializedName("IdQuality")
  private Integer idQuality = null;

  @SerializedName("Instruction")
  private String instruction = null;

  @SerializedName("NbTaskClosed")
  private Integer nbTaskClosed = null;

  @SerializedName("NbTotalTask")
  private Integer nbTotalTask = null;

  @SerializedName("Qualities")
  private List<QualityReaderServiceModel> qualities = new ArrayList<QualityReaderServiceModel>();

  @SerializedName("QualityName")
  private String qualityName = null;

  @SerializedName("QuestionOptions")
  private List<String> questionOptions = new ArrayList<String>();

  @SerializedName("Title")
  private String title = null;

  @SerializedName("TitleQuestionOptions")
  private String titleQuestionOptions = null;

  @SerializedName("UrlNotification")
  private String urlNotification = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getAppName() {
    return appName;
  }
  public void setAppName(String appName) {
    this.appName = appName;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getAppProjectState() {
    return appProjectState;
  }
  public void setAppProjectState(Integer appProjectState) {
    this.appProjectState = appProjectState;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Date getCreationDate() {
    return creationDate;
  }
  public void setCreationDate(Date creationDate) {
    this.creationDate = creationDate;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getCredit() {
    return credit;
  }
  public void setCredit(Integer credit) {
    this.credit = credit;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getHasInstruction() {
    return hasInstruction;
  }
  public void setHasInstruction(Boolean hasInstruction) {
    this.hasInstruction = hasInstruction;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getHasQuestionOptions() {
    return hasQuestionOptions;
  }
  public void setHasQuestionOptions(Boolean hasQuestionOptions) {
    this.hasQuestionOptions = hasQuestionOptions;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getIdApp() {
    return idApp;
  }
  public void setIdApp(Integer idApp) {
    this.idApp = idApp;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getIdAppProject() {
    return idAppProject;
  }
  public void setIdAppProject(Integer idAppProject) {
    this.idAppProject = idAppProject;
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
  public Integer getNbTaskClosed() {
    return nbTaskClosed;
  }
  public void setNbTaskClosed(Integer nbTaskClosed) {
    this.nbTaskClosed = nbTaskClosed;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getNbTotalTask() {
    return nbTotalTask;
  }
  public void setNbTotalTask(Integer nbTotalTask) {
    this.nbTotalTask = nbTotalTask;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<QualityReaderServiceModel> getQualities() {
    return qualities;
  }
  public void setQualities(List<QualityReaderServiceModel> qualities) {
    this.qualities = qualities;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getQualityName() {
    return qualityName;
  }
  public void setQualityName(String qualityName) {
    this.qualityName = qualityName;
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
  public String getTitleQuestionOptions() {
    return titleQuestionOptions;
  }
  public void setTitleQuestionOptions(String titleQuestionOptions) {
    this.titleQuestionOptions = titleQuestionOptions;
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
    AppProjectReaderServiceModel appProjectReaderServiceModel = (AppProjectReaderServiceModel) o;
    return Objects.equals(this.appName, appProjectReaderServiceModel.appName) &&
        Objects.equals(this.appProjectState, appProjectReaderServiceModel.appProjectState) &&
        Objects.equals(this.creationDate, appProjectReaderServiceModel.creationDate) &&
        Objects.equals(this.credit, appProjectReaderServiceModel.credit) &&
        Objects.equals(this.hasInstruction, appProjectReaderServiceModel.hasInstruction) &&
        Objects.equals(this.hasQuestionOptions, appProjectReaderServiceModel.hasQuestionOptions) &&
        Objects.equals(this.idApp, appProjectReaderServiceModel.idApp) &&
        Objects.equals(this.idAppProject, appProjectReaderServiceModel.idAppProject) &&
        Objects.equals(this.idQuality, appProjectReaderServiceModel.idQuality) &&
        Objects.equals(this.instruction, appProjectReaderServiceModel.instruction) &&
        Objects.equals(this.nbTaskClosed, appProjectReaderServiceModel.nbTaskClosed) &&
        Objects.equals(this.nbTotalTask, appProjectReaderServiceModel.nbTotalTask) &&
        Objects.equals(this.qualities, appProjectReaderServiceModel.qualities) &&
        Objects.equals(this.qualityName, appProjectReaderServiceModel.qualityName) &&
        Objects.equals(this.questionOptions, appProjectReaderServiceModel.questionOptions) &&
        Objects.equals(this.title, appProjectReaderServiceModel.title) &&
        Objects.equals(this.titleQuestionOptions, appProjectReaderServiceModel.titleQuestionOptions) &&
        Objects.equals(this.urlNotification, appProjectReaderServiceModel.urlNotification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appName, appProjectState, creationDate, credit, hasInstruction, hasQuestionOptions, idApp, idAppProject, idQuality, instruction, nbTaskClosed, nbTotalTask, qualities, qualityName, questionOptions, title, titleQuestionOptions, urlNotification);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppProjectReaderServiceModel {\n");
    
    sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
    sb.append("    appProjectState: ").append(toIndentedString(appProjectState)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    credit: ").append(toIndentedString(credit)).append("\n");
    sb.append("    hasInstruction: ").append(toIndentedString(hasInstruction)).append("\n");
    sb.append("    hasQuestionOptions: ").append(toIndentedString(hasQuestionOptions)).append("\n");
    sb.append("    idApp: ").append(toIndentedString(idApp)).append("\n");
    sb.append("    idAppProject: ").append(toIndentedString(idAppProject)).append("\n");
    sb.append("    idQuality: ").append(toIndentedString(idQuality)).append("\n");
    sb.append("    instruction: ").append(toIndentedString(instruction)).append("\n");
    sb.append("    nbTaskClosed: ").append(toIndentedString(nbTaskClosed)).append("\n");
    sb.append("    nbTotalTask: ").append(toIndentedString(nbTotalTask)).append("\n");
    sb.append("    qualities: ").append(toIndentedString(qualities)).append("\n");
    sb.append("    qualityName: ").append(toIndentedString(qualityName)).append("\n");
    sb.append("    questionOptions: ").append(toIndentedString(questionOptions)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    titleQuestionOptions: ").append(toIndentedString(titleQuestionOptions)).append("\n");
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

