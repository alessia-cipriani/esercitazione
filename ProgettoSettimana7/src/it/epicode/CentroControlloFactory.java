package it.epicode;

public class CentroControlloFactory {

	// metodo createCentroControllo(): decide quale tipo di CentroControllo
	// costruire
	public CentroControlloInterface createCentroControllo(String tipoControllo) {
		if (tipoControllo == null) {
			return null;
		} else if (tipoControllo.equals("HTTP")) {
			return new CentroControlloHttp();
		}
		return null;
	}
}
