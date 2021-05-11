package main;

import singleton.AClazz;
import singleton.BClazz;
import singleton.SocketClient;

public class SingletonMain {
	public static void main(String[] args) {
		
		AClazz aClazz = new AClazz();
		BClazz bClazz = new BClazz();
		
		SocketClient aClient = aClazz.getSocketClient();
		SocketClient bClient = bClazz.getSocketClient();
		
		System.out.println("�ΰ��� ��ü�� �����Ѱ�?");
		System.out.println(aClient.equals(bClient));
	}
}
