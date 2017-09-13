
public class Ingrediente {
	private String carne, legume, verdura, tempero, acompanhamento;

	public Ingrediente(String legume, String verdura) {
		this.legume = legume;
		this.verdura = verdura;
	}

	public String getCarne() {
		return carne;
	}

	public void setCarne(String carne) {
		this.carne = carne;
	}

	public String getLegume() {
		return legume;
	}

	public void setLegume(String legume) {
		this.legume = legume;
	}

	public String getVerdura() {
		return verdura;
	}

	public void setVerdura(String verdura) {
		this.verdura = verdura;
	}

	public String getTempero() {
		return tempero;
	}

	public void setTempero(String tempero) {
		this.tempero = tempero;
	}

	public String getAcompanhamento() {
		return acompanhamento;
	}

	public void setAcompanhamento(String acompanhamento) {
		this.acompanhamento = acompanhamento;
	}

}
