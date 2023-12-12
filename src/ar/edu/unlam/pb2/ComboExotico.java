package ar.edu.unlam.pb2;

public class ComboExotico extends Combo{
	
	private Double precioCombo;	
	
	public ComboExotico(Double precioCombo) {
		super();
		this.precioCombo = precioCombo;
	}

	public Double getPrecioCombo() {
		return precioCombo;
	}

	public void setPrecioCombo(Double precioCombo) {
		this.precioCombo = precioCombo;
	}

	@Override
	public Double calcularPrecioCombo() {
		return precioCombo;

	}

}
