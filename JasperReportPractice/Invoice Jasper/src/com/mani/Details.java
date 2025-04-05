package com.mani;



public class Details {

	private String productName;
	private String category;
	private int quantity;
	private int unitPrice;
	private int adjustment;

	public Details(String productName, String category, int quantity,
			int unitPrice) {
		super();
		this.productName = productName;
		this.category = category;
		this.quantity = quantity;
		this.unitPrice = unitPrice;
	}

	public Details() {
		// TODO Auto-generated constructor stub
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(int unitPrice) {
		this.unitPrice = unitPrice;
	}

	public int getAdjustment() {
		return adjustment;
	}

	public void setAdjustment(int adjustment) {
		this.adjustment = adjustment;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

}
