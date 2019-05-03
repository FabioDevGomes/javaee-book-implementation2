package br.com.loja.managedbeans;

import java.math.BigDecimal;

public class Book {
	private Integer id;
	private String title;
	private String description;
	private int numberPages;
	private BigDecimal price;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getNumberPages() {
		return numberPages;
	}

	public void setNumberPages(int numberPages) {
		this.numberPages = numberPages;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", description=" + description + ", numberPages=" + numberPages
				+ ", price=" + price + "]";
	}

}
