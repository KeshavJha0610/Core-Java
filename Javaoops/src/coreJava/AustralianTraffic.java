package coreJava;

public class AustralianTraffic implements CentralTraffic,ContinentTraffic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Interface - class
		//Interface will have methods but not body
		CentralTraffic a = new AustralianTraffic();
		a.redStop();
		a.flashYellow();
		a.greenGO();
		
		AustralianTraffic at = new AustralianTraffic();
		ContinentTraffic ct = new AustralianTraffic();
		at.walkonsymbol();
		ct.Trainsymbol();
		
	}

	@Override
	public void greenGO() {
		// TODO Auto-generated method stub
		//code
		System.out.println("greengo implementation");
	}

	@Override
	public void redStop() {
		// TODO Auto-generated method stub
		//code
		System.out.println("redstop implementation");

	}
	public void walkonsymbol()
	{
		System.out.println("walking");
	}

	@Override
	public void flashYellow() {
		// TODO Auto-generated method stub
		System.out.println("flashyellow implementation");

	}

	@Override
	public void Trainsymbol() {
		// TODO Auto-generated method stub
		System.out.println("Train");
	}

	
		
	}

