package br.com.loja.managedbeans;

import javax.enterprise.inject.Model;

@Model
public class AdminBooksBean {

	private Book product = new Book();
	
	public void save() {
		System.out.println("método q irá salvar o livro"+ product);
	}

	public Book getProduct() {
		return product;
	}

	public void setProduct(Book product) {
		this.product = product;
	}

	
}
