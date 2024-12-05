package service;

import repositories.Message;

public class SendSMS implements Message {

	@Override
	public void sendMenssage(String menssage) {
		System.out.println("Enviando SMS" + menssage);
		
	}

}
