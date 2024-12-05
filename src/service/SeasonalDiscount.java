package service;

import domains.Product;
import repositories.Discount;

public class SeasonalDiscount implements Discount{

	
	private double porcent;
	
	public SeasonalDiscount(double porcent) {
		super();
		this.porcent = porcent;
	}


	@Override
	public double calculate(Product product) {
	
		return product.getPrice() * (1 - porcent);
	}

	
}
