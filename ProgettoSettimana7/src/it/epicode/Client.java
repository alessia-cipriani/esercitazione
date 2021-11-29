package it.epicode;

public class Client {

	public static void main(String[] args) {
		CentroControlloProxy centrocontrollo= new CentroControlloProxy();
		Sonda sonda=new Sonda(1l, 41.53, 29.32);
		ControlloSonda c=new ControlloSonda(1L, centrocontrollo);
		sonda.addObserver(c);
		sonda.setSmokeLevel(8);
		
	}

}
