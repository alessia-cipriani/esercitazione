package it.epicode;

public class InfoSonda {
	private Long id;
	private double latitude;
	private double longitude;
	private int smokeLevel;

//	inizializza le proprieta
	public InfoSonda(Long id, double latitude, double longitude, int smokeLevel) {
		this.id = id;
		this.latitude = latitude;
		this.longitude = longitude;
		this.smokeLevel = smokeLevel;
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

	public int getSmokeLevel() {
		return smokeLevel;
	}

	public void setSmokeLevel(int smokeLevel) {
		this.smokeLevel = smokeLevel;
	}

	@Override
	public String toString() {
		return "InfoSonda [id=" + id + ", latitude=" + latitude + ", longitude=" + longitude + ", smokeLevel="
				+ smokeLevel + "]";
	}

}
