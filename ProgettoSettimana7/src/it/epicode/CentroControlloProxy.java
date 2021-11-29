package it.epicode;

public class CentroControlloProxy implements CentroControlloInterface{
	CentroControlloInterface concreteCentroControllo;

//	Inizializza concreteCentroControllo mediante il Factory
	public CentroControlloProxy() {
		concreteCentroControllo = new CentroControlloFactory().createCentroControllo("HTTP");
	}

//	utilizza il metodo  rilevaIncendio di concreteCentroControllo
	public void rilevaIncendio(InfoSonda infoSonda) {
		System.out.println("proxy.rilevaIncendio");
		concreteCentroControllo.rilevaIncendio(infoSonda);
	}

}
