package singleton;

public class SocketClient {

	private static SocketClient socketClient = null;
	
	//�⺻ �����ڸ� private�� ����
	private SocketClient() {
		
	}
	
	public static SocketClient getInstance() {
		if(socketClient == null) {
			socketClient  = new SocketClient();
		}
		return socketClient;
	}
	
	public void connect() {
		System.out.println("connect.");
	}
	
}
