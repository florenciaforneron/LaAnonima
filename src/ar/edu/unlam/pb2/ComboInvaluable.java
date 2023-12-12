package ar.edu.unlam.pb2;

import java.util.Collections;
import java.util.List;

public class ComboInvaluable extends Combo{
	

	public ComboInvaluable(List<Articulo> articulos, Integer cantidadMaxProductos) {
		this.articulos = articulos;
		if(articulos.size() <= cantidadMaxProductos) {
			
		}
	}
	

	@Override
	public Double calcularPrecioCombo() {
		Double precioCombo = 0.0;
		Collections.sort(articulos);
		for(Articulo articulo : articulos) {
			Double precio = articulo.getValor();
			
			
			precioCombo = (precioCombo + articulo.getValor()) ;
		}
		return precioCombo - articulos.get(0).getValor();
	}

}
