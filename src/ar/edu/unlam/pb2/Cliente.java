package ar.edu.unlam.pb2;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Cliente {
	
	private String nombre;
	private Double presupuesto;
	private Enum tipoArticulo;
	List<Articulo> articulosComprados;
	List<Combo> combosComprados;
	
	public Cliente(String nombre, Double presupuesto, Enum tipoArticulo) {
		super();
		this.nombre = nombre;
		this.presupuesto = presupuesto;
		this.tipoArticulo = tipoArticulo;
		articulosComprados = new ArrayList<>();
		combosComprados = new ArrayList<>();
	}


	public List<Articulo> getArticulosComprados() {
		return articulosComprados;
	}


	public void setArticulosComprados(List<Articulo> articulosComprados) {
		this.articulosComprados = articulosComprados;
	}


	public List<Combo> getCombosComprados() {
		return combosComprados;
	}

	public void setCombosComprados(List<Combo> combosComprados) {
		this.combosComprados = combosComprados;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Double getPresupuesto() {
		return presupuesto;
	}

	public void setPresupuesto(Double presupuesto) {
		this.presupuesto = presupuesto;
	}

	public Enum getTipoArticulo() {
		return tipoArticulo;
	}

	public void setTipoArticulo(Enum tipoArticulo) {
		tipoArticulo = tipoArticulo;
	}
	
	public void comprar(Articulo articulo) {
		Double precio = articulo.getValor();
		presupuesto = presupuesto - precio;
		articulosComprados.add(articulo);

	}
	
	public void comprar(Combo combo) {
		Double precio = combo.calcularPrecioCombo();
		presupuesto = presupuesto - precio;
		combosComprados.add(combo);

	}
	
	



}
