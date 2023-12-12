package ar.edu.unlam.pb2;

public class ComboAntiguedad extends Combo{

	@Override
	public Double calcularPrecioCombo() {
		Double precioCombo = 0.0;
		for(Articulo articulo : articulos) {
			articulo.getValor();		
			precioCombo = ((precioCombo + articulo.getValor()) * 25.00) / 100.00 ;
		}
		return precioCombo;
	}

}
