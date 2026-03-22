package com.example;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class ProductRequest {

    @NotBlank(message = "Product name is required")
    private String name;

    @NotBlank(message = "Brand is required")
    private String brand;

    @NotNull(message = "Price is required")
    @Min(value = 1, message = "Price must be greater than 0")
    private Double price;

    @NotNull(message = "Quantity is required")
    @Min(value = 0, message = "Quantity cannot be negative")
    private Integer quantity;

    @NotBlank(message = "Category is required")
    private String category;

	/**
	 * @return the name
	 */
	public synchronized String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public synchronized void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the brand
	 */
	public synchronized String getBrand() {
		return brand;
	}

	/**
	 * @param brand the brand to set
	 */
	public synchronized void setBrand(String brand) {
		this.brand = brand;
	}

	/**
	 * @return the price
	 */
	public synchronized Double getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public synchronized void setPrice(Double price) {
		this.price = price;
	}

	/**
	 * @return the quantity
	 */
	public synchronized Integer getQuantity() {
		return quantity;
	}

	/**
	 * @param quantity the quantity to set
	 */
	public synchronized void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	/**
	 * @return the category
	 */
	public synchronized String getCategory() {
		return category;
	}

	/**
	 * @param category the category to set
	 */
	public synchronized void setCategory(String category) {
		this.category = category;
	}

	public ProductRequest(@NotBlank(message = "Product name is required") String name,
			@NotBlank(message = "Brand is required") String brand,
			@NotNull(message = "Price is required") @Min(value = 1, message = "Price must be greater than 0") Double price,
			@NotNull(message = "Quantity is required") @Min(value = 0, message = "Quantity cannot be negative") Integer quantity,
			@NotBlank(message = "Category is required") String category) {
		super();
		this.name = name;
		this.brand = brand;
		this.price = price;
		this.quantity = quantity;
		this.category = category;
	}

	public ProductRequest() {
		super();
	}
    
    
}