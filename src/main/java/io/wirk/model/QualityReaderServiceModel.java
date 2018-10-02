package io.wirk.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;


/**
 * Model for Quality
 */
@ApiModel(description = "Model for Quality")
public class QualityReaderServiceModel   {
  
  @SerializedName("Credit")
  private Integer credit = null;

  @SerializedName("IdQuality")
  private Integer idQuality = null;

  @SerializedName("Name")
  private String name = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Integer getCredit() {
    return credit;
  }
  public void setCredit(Integer credit) {
    this.credit = credit;
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
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QualityReaderServiceModel qualityReaderServiceModel = (QualityReaderServiceModel) o;
    return Objects.equals(this.credit, qualityReaderServiceModel.credit) &&
        Objects.equals(this.idQuality, qualityReaderServiceModel.idQuality) &&
        Objects.equals(this.name, qualityReaderServiceModel.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(credit, idQuality, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QualityReaderServiceModel {\n");
    
    sb.append("    credit: ").append(toIndentedString(credit)).append("\n");
    sb.append("    idQuality: ").append(toIndentedString(idQuality)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

