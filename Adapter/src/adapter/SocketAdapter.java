package adapter;

public class SocketAdapter implements Electronic110V {
	
	private Electronic220V electronic220V;

	public SocketAdapter(Electronic220V electronic220v) {
		this.electronic220V = electronic220v;
	}
	
	@Override
	public void powerOn() {
		electronic220V.connect();
	}

}
