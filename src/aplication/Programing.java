package aplication;

import java.util.List;

import domains.Client;
import domains.Order;
import domains.Product;
import repositories.Discount;
import repositories.Message;
import service.DiscontQuantity;
import service.OrderItem;
import service.RegisterNotification;
import service.SeasonalDiscount;
import service.SendGmail;

public class Programing {

	public static void main(String[] args) {
		
		
		Product product1 = new Product("Caderno", 30.0, 5);
		
		Client client = new Client("Bruno Souza", "brunocloud78@gmail.com");
		
		Order order1  = new Order(client);
		order1.addProduct(product1);
		
		Discount discount1 = new SeasonalDiscount(0.10);
		Discount discount2 = new DiscontQuantity(product1.getQuantity(),0.15); 
		
		OrderItem orderItem = new OrderItem();
		double total = orderItem.calculateTotal(order1, List.of(discount1, discount2));
			System.out.println("Total do pedido com desconto " + total);
			
		Message message = new SendGmail();
		RegisterNotification notification = new RegisterNotification();
		notification.register(order1, message);
	}

}
