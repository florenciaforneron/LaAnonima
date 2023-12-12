package ar.edu.unlam.pb2;


public abstract class Articulo implements Comparable<Articulo>{
	
	private Double valor;
	
	private String descripcion;
	
	private Integer cantidad;
	
	public static Integer stock;

	public Articulo(Double valor, String descripcion, Integer cantidad) {
		super();
		this.valor = valor;
		this.descripcion = descripcion;
		this.cantidad = cantidad;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	
	public int compareTo(Articulo o) {
		
		return this.getValor().compareTo(o.valor);
				
	}
	

}
