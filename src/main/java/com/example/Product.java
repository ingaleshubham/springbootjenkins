	package com.example;
	
	import jakarta.persistence.Column;
	import jakarta.persistence.Entity;
	import jakarta.persistence.GeneratedValue;
	import jakarta.persistence.GenerationType;
	import jakarta.persistence.Id;
	import jakarta.persistence.Table;
	
	@Entity
	@Table(name = "products")
	public class Product {
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	
	    @Column(nullable = false)
	    private String name;
	
	    private String brand;
	
	    @Column(nullable = false)
	    private Double price;
	
	    @Column(nullable = false)
	    private Integer quantity;
	
	    private String category;
	
		/**
		 * @return the id
		 */
		public synchronized Long getId() {
			return id;
		}
	
		/**
		 * @param id the id to set
		 */
		public synchronized void setId(Long id) {
			this.id = id;
		}
	
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
	
		public Product(Long id, String name, String brand, Double price, Integer quantity, String category) {
			super();
			this.id = id;
			this.name = name;
			this.brand = brand;
			this.price = price;
			this.quantity = quantity;
			this.category = category;
		}
	
		public Product() {
			super();
		}
	    
	    
	}