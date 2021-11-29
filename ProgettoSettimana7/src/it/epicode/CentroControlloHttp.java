package it.epicode;

public class CentroControlloHttp implements CentroControlloInterface {
	ComunicazioneHttp canaleComunicazione;
	private String baseUrlNotifica = "http://host/alarm";

	public CentroControlloHttp() {
		this.canaleComunicazione = new ComunicazioneHttp(baseUrlNotifica);
	}

	@Override
//	Usa canaleComunicazione per inviare l'allarme
	public void rilevaIncendio(InfoSonda info) {
		canaleComunicazione.sendGet( info.getId(), info.getLatitude(), info.getLongitude(), info.getSmokeLevel());
	}

}
