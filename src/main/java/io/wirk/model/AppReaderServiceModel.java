package io.wirk.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.wirk.model.QualityReaderServiceModel;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;


/**
 * Model for App
 */
@ApiModel(description = "Model for App")
public class AppReaderServiceModel   {
  
  @SerializedName("AppName")
  private String appName = null;

  @SerializedName("HasInstruction")
  private Boolean hasInstruction = null;

  @SerializedName("HasQuestionOptions")
  private Boolean hasQuestionOptions = null;

  @SerializedName("IdApp")
  private Integer idApp = null;

  @SerializedName("Qualities")
  private List<QualityReaderServiceModel> qualities = new ArrayList<QualityReaderServiceModel>();

  @SerializedName("TitleQuestionOptions")
  private String titleQuestionOptions = null;

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
  public List<QualityReaderServiceModel> getQualities() {
    return qualities;
  }
  public void setQualities(List<QualityReaderServiceModel> qualities) {
    this.qualities = qualities;
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppReaderServiceModel appReaderServiceModel = (AppReaderServiceModel) o;
    return Objects.equals(this.appName, appReaderServiceModel.appName) &&
        Objects.equals(this.hasInstruction, appReaderServiceModel.hasInstruction) &&
        Objects.equals(this.hasQuestionOptions, appReaderServiceModel.hasQuestionOptions) &&
        Objects.equals(this.idApp, appReaderServiceModel.idApp) &&
        Objects.equals(this.qualities, appReaderServiceModel.qualities) &&
        Objects.equals(this.titleQuestionOptions, appReaderServiceModel.titleQuestionOptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appName, hasInstruction, hasQuestionOptions, idApp, qualities, titleQuestionOptions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppReaderServiceModel {\n");
    
    sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
    sb.append("    hasInstruction: ").append(toIndentedString(hasInstruction)).append("\n");
    sb.append("    hasQuestionOptions: ").append(toIndentedString(hasQuestionOptions)).append("\n");
    sb.append("    idApp: ").append(toIndentedString(idApp)).append("\n");
    sb.append("    qualities: ").append(toIndentedString(qualities)).append("\n");
    sb.append("    titleQuestionOptions: ").append(toIndentedString(titleQuestionOptions)).append("\n");
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

