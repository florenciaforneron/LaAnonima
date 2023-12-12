package ar.edu.unlam.pb2;

public enum TipoArticulo {
	
	ANTIGUEDAD("Antiguedad"), EXOTICO("Exotico"), LUJO("Lujo"), INVALUABLE("Invaluable");
	
	private String tipoArticulo;
	
	private TipoArticulo(String tipoArticulo) {
		this.tipoArticulo = tipoArticulo;
	}

	public String getTipoArticulo() {
		return tipoArticulo;
	}

	public void setTipoArticulo(String tipoArticulo) {
		this.tipoArticulo = tipoArticulo;
	}
		
}
