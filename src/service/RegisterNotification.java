package service;

import domains.Order;
import repositories.Message;

public class RegisterNotification {

	public void register (Order order, Message message) {
		message.sendMenssage("Pedido registrado para " + order.getClient().getName() + " com sucesso");
	}
}
