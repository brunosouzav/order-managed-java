package domains;

import java.util.ArrayList;
import java.util.List;

public class Order {

	private Client client;
	private List<Product> products;
	
	public Order () {
		
	}
	
	public Order(Client client) {
		
		this.client = client;
		this.products = new ArrayList<>();
	}


	public Client getClient() {
		return client;
	}


	public void setClient(Client client) {
		this.client = client;
	}


	public List<Product> getProducts() {
		return products;
	}


	public void setProducts(List<Product> products) {
		this.products = products;
	}
	
	public void addProduct (Product product) {
		products.add(product);
	}
	
}
