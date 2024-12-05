package service;

import repositories.Message;

public class SendGmail implements Message {


	@Override
	public void sendMenssage(String menssage) {
		System.out.println("Enviando Email" + menssage);
	}

	
}
