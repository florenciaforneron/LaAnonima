package ar.edu.unlam.pb2;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Empresa {
			
	//Map<TipoArticulo, ArrayList<Articulo>> combos;
	Map<TipoArticulo, Combo> combos;

	public Empresa(Map<TipoArticulo, Combo> combos) {
		super();
		this.combos = combos;
	}
	
		public Combo ofrecerCombo(Cliente cliente) {
		Enum<TipoArticulo> tipoArticulo = cliente.getTipoArticulo();
		Combo combo = combos.get(tipoArticulo);

		return combo;
		//return listaArticulos;
		
	}

/*
	public List<Articulo> ofrecerCombo(Cliente cliente) {
		
		Enum<TipoArticulo> tipoArticulo = cliente.getTipoArticulo();
		List<Articulo> listaArticulos = combos.get(tipoArticulo);
		return listaArticulos;
		
	}
*/
}
