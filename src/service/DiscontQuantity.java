package service;

import domains.Product;
import repositories.Discount;

public class DiscontQuantity implements Discount {

	private int quantityMin;
	private double porcent;
	
	
	@Override
	public double calculate(Product product) {
		if (product.getQuantity()>= quantityMin) {
			return product.getPrice() * (1-porcent);
		}
		
		return product.getPrice();
	}

}
