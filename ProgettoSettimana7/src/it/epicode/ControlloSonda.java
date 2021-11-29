package it.epicode;

public class ControlloSonda implements Observer {
	private Long id;
	CentroControlloInterface centrocontrollo;

	public ControlloSonda(Long id, CentroControlloInterface centrocontrollo) {
		this.id = id;
		this.centrocontrollo= centrocontrollo;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public InfoSonda createInfosonda (Sonda obj) {
		return new InfoSonda(obj.getId(), obj.getLatitude(),obj.getLongitude(), obj.getSmokeLevel());
		
	}
	@Override
//	riceve le notifiche della Sonda
	public void update(Subject obj) {
		InfoSonda info =createInfosonda ((Sonda) obj);
//		System.out.println("Incendio rilevato:" + info.toString());
		centrocontrollo.rilevaIncendio(info);
	}

}
