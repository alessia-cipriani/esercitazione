package it.epicode;

public class ComunicazioneHttp extends CanaleComunicazione {
	private String baseurlNotifica;

	public ComunicazioneHttp(String baseurlNotifica) {
		this.baseurlNotifica = baseurlNotifica;
	}

//	invia l'allarme al personale
	public void sendGet(Long id, double latitude, double longitude, int smokeLevel) {
		String url = baseurlNotifica + "?idsonda=" + id + "&lat=" + latitude + "&lon=" + longitude + "&smokelevel="
				+ smokeLevel;
		System.out.println("Chiamata HTTP: " + url);
	}
}
