package it.epicode;

import java.util.List;

public class Sonda extends Subject {
	private static int SMOKE_TRESHOLD = 5;
	private Long id;
	private double latitude;
	private double longitude;
	private int smokeLevel;

	public Sonda(Long id, double latitude, double longitude) {
		this.id = id;
		this.latitude = latitude;
		this.longitude = longitude;

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public List<Observer> getObservers() {
		return observers;
	}


	public int getSmokeLevel() {
		return smokeLevel;
	}

	// metodo setSmokeLevel: se SL > di ST, notifica i processi di controllo
	// (Observer)
	public void setSmokeLevel(int smokeLevel) {
		this.smokeLevel = smokeLevel;
		if (smokeLevel > SMOKE_TRESHOLD) {
			notifyObserver();
		}
	}
}
