package service;

import java.util.List;

import domains.Order;
import domains.Product;
import repositories.Discount;

public class OrderItem {

	public double calculateTotal(Order order, List<Discount> disconts) {
		double total = 0;
		
		for(Product product: order.getProducts()) {
			double sumTotal = product.getPrice();
			
			for (Discount discount:  disconts) {
					sumTotal = discount.calculate(product);
			}
			
			total += sumTotal * product.getQuantity();
		}
		return total;
	}
}
