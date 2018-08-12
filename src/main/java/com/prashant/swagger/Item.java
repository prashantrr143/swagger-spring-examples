package com.prashant.swagger;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Item
 */
@Validated

public class Item   {
  @JsonProperty("itemId")
  private String itemId = null;

  @JsonProperty("itemName")
  private String itemName = null;

  @JsonProperty("itemDescription")
  private String itemDescription = null;

  @JsonProperty("price")
  private BigDecimal price = null;

  public Item itemId(String itemId) {
    this.itemId = itemId;
    return this;
  }

  /**
   * A String representing ID of an Item in the Order Management System
   * @return itemId
  **/
  @ApiModelProperty(value = "A String representing ID of an Item in the Order Management System")


  public String getItemId() {
    return itemId;
  }

  public void setItemId(String itemId) {
    this.itemId = itemId;
  }

  public Item itemName(String itemName) {
    this.itemName = itemName;
    return this;
  }

  /**
   *  Name of the Item
   * @return itemName
  **/
  @ApiModelProperty(value = " Name of the Item")


  public String getItemName() {
    return itemName;
  }

  public void setItemName(String itemName) {
    this.itemName = itemName;
  }

  public Item itemDescription(String itemDescription) {
    this.itemDescription = itemDescription;
    return this;
  }

  /**
   * Small descrption of the item
   * @return itemDescription
  **/
  @ApiModelProperty(value = "Small descrption of the item")


  public String getItemDescription() {
    return itemDescription;
  }

  public void setItemDescription(String itemDescription) {
    this.itemDescription = itemDescription;
  }

  public Item price(BigDecimal price) {
    this.price = price;
    return this;
  }

  /**
   * Get price
   * @return price
  **/
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getPrice() {
    return price;
  }

  public void setPrice(BigDecimal price) {
    this.price = price;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Item item = (Item) o;
    return Objects.equals(this.itemId, item.itemId) &&
        Objects.equals(this.itemName, item.itemName) &&
        Objects.equals(this.itemDescription, item.itemDescription) &&
        Objects.equals(this.price, item.price);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemId, itemName, itemDescription, price);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Item {\n");
    
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    itemName: ").append(toIndentedString(itemName)).append("\n");
    sb.append("    itemDescription: ").append(toIndentedString(itemDescription)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
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

