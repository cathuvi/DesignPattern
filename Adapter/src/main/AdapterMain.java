package main;

import adapter.AirConditioner;
import adapter.Cleaner;
import adapter.Electronic110V;
import adapter.HairDryer;
import adapter.SocketAdapter;

public class AdapterMain {
	public static void main(String[] args) {
		
		HairDryer hairDryer = new HairDryer();
		connect(hairDryer);
		
		Cleaner cleaner = new Cleaner();
		//connect(clearner); 100v�� ����
		
		Electronic110V adapter = new SocketAdapter(cleaner);
		connect(adapter);
		
		AirConditioner airConditioner = new AirConditioner();
		//connect(airConditioner); 100v�� ����
		
		Electronic110V airAdapter = new SocketAdapter(airConditioner);
		connect(airAdapter);
	}
	//�ܼ�Ʈ
	public static void connect(Electronic110V electronic110v) {
		electronic110v.powerOn();
	}
}
