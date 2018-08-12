package com.prashant.swagger;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Order
 */
@Validated

public class Order {
	@JsonProperty("orderId")
	private Long orderId = null;

	@JsonProperty("orderDate")
	private OffsetDateTime orderDate = null;

	@JsonProperty("orderAmount")
	private Long orderAmount = null;

	/**
	 * Status of Order placed
	 */
	public enum StatusEnum {
		PLACED("PLACED"),

		APPROVED("APPROVED"),

		DELIVERED("DELIVERED");

		private String value;

		StatusEnum(String value) {
			this.value = value;
		}

		@Override
		@JsonValue
		public String toString() {
			return String.valueOf(value);
		}

		@JsonCreator
		public static StatusEnum fromValue(String text) {
			for (StatusEnum b : StatusEnum.values()) {
				if (String.valueOf(b.value).equals(text)) {
					return b;
				}
			}
			return null;
		}
	}

	@JsonProperty("status")
	private StatusEnum status = null;

	@JsonProperty("items")
	@Valid
	private List<Item> items = null;

	@JsonProperty("complete")
	private Boolean complete = false;

	public Order orderId(Long orderId) {
		this.orderId = orderId;
		return this;
	}

	/**
	 * Get orderId
	 * 
	 * @return orderId
	 **/
	@ApiModelProperty(value = "")

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public Order orderDate(OffsetDateTime orderDate) {
		this.orderDate = orderDate;
		return this;
	}

	/**
	 * Get orderDate
	 * 
	 * @return orderDate
	 **/
	@ApiModelProperty(value = "")

	@Valid

	public OffsetDateTime getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(OffsetDateTime orderDate) {
		this.orderDate = orderDate;
	}

	public Order orderAmount(Long orderAmount) {
		this.orderAmount = orderAmount;
		return this;
	}

	/**
	 * Get orderAmount
	 * 
	 * @return orderAmount
	 **/
	@ApiModelProperty(value = "")

	public Long getOrderAmount() {
		return orderAmount;
	}

	public void setOrderAmount(Long orderAmount) {
		this.orderAmount = orderAmount;
	}

	public Order status(StatusEnum status) {
		this.status = status;
		return this;
	}

	/**
	 * Status of Order placed
	 * 
	 * @return status
	 **/
	@ApiModelProperty(value = "Status of Order placed")

	public StatusEnum getStatus() {
		return status;
	}

	public void setStatus(StatusEnum status) {
		this.status = status;
	}

	public Order items(List<Item> items) {
		this.items = items;
		return this;
	}

	public Order addItemsItem(Item itemsItem) {
		if (this.items == null) {
			this.items = new ArrayList<>();
		}
		this.items.add(itemsItem);
		return this;
	}

	/**
	 * Get items
	 * 
	 * @return items
	 **/
	@ApiModelProperty(value = "")

	@Valid

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	public Order complete(Boolean complete) {
		this.complete = complete;
		return this;
	}

	/**
	 * Get complete
	 * 
	 * @return complete
	 **/
	@ApiModelProperty(value = "")

	public Boolean isComplete() {
		return complete;
	}

	public void setComplete(Boolean complete) {
		this.complete = complete;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Order order = (Order) o;
		return Objects.equals(this.orderId, order.orderId) && Objects.equals(this.orderDate, order.orderDate)
				&& Objects.equals(this.orderAmount, order.orderAmount) && Objects.equals(this.status, order.status)
				&& Objects.equals(this.items, order.items) && Objects.equals(this.complete, order.complete);
	}

	@Override
	public int hashCode() {
		return Objects.hash(orderId, orderDate, orderAmount, status, items, complete);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Order {\n");

		sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
		sb.append("    orderDate: ").append(toIndentedString(orderDate)).append("\n");
		sb.append("    orderAmount: ").append(toIndentedString(orderAmount)).append("\n");
		sb.append("    status: ").append(toIndentedString(status)).append("\n");
		sb.append("    items: ").append(toIndentedString(items)).append("\n");
		sb.append("    complete: ").append(toIndentedString(complete)).append("\n");
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
