package ar.edu.unlam.pb2;

import static org.junit.Assert.*;

import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.junit.Test;

public class EmpresaTest {

	@Test
	public void testQueSePuedaOfrecerUnComboSegunTipoDePreferenciaDelCliente() {
				
		Empresa empresa = new Empresa(generarCombos());
		Cliente cliente = new Cliente("Oscar", 100000.00, TipoArticulo.INVALUABLE);
		
		Combo combo = empresa.ofrecerCombo(cliente);
		Boolean esInvaluable = combo instanceof ComboInvaluable;
		
		
		assertTrue(esInvaluable);
		
		
		
	}
	
	private Map<TipoArticulo, Combo> generarCombos() {
		
		Articulo articulo1 = new ArticuloInvaluable(20000.00, "Sable Corvo", 1);	
		Articulo articulo2 = new ArticuloInvaluable(30000.00, "Sable de Luz", 2);
		Articulo articulo3 = new ArticuloInvaluable(40000.00, "Sable Corvo2", 1);	
		Articulo articulo4 = new ArticuloInvaluable(50000.00, "Sable de Luz2", 2);
		
		List<Articulo> listaDeArticulos = new ArrayList<Articulo>();
		
		listaDeArticulos.add(articulo1);
		listaDeArticulos.add(articulo2);
		listaDeArticulos.add(articulo3);
		listaDeArticulos.add(articulo4);
		
		Combo combo1 = new ComboAntiguedad();
		Combo combo2 = new ComboExotico(20000.00);
		Combo combo3 = new ComboInvaluable(listaDeArticulos,4);
		
		Map<TipoArticulo, Combo> combos = new HashMap<TipoArticulo, Combo>();
		
		combos.put(TipoArticulo.INVALUABLE, combo1);
		combos.put(TipoArticulo.INVALUABLE, combo2);
		combos.put(TipoArticulo.INVALUABLE, combo3);

		return combos;
		
		
	}
	
	@Test
	public void testQueElClientePuedaRealizarUnaCompraDeUnArticulo() {
		
		Empresa empresa = new Empresa(generarCombos());
		Cliente cliente = new Cliente("Oscar", 100000.00, TipoArticulo.INVALUABLE);
		Articulo articulo1 = new ArticuloInvaluable(20000.00, "Sable Corvo", 1);
		
		cliente.comprar(articulo1);
		
		Integer cantidadArticulosComprados = cliente.getArticulosComprados().size();		
		Integer cantidadEsperada = 1;
		Double esperado = 80000.00;
		Double obtenido = cliente.getPresupuesto();
		
		assertEquals(esperado, obtenido);
		assertEquals(cantidadEsperada, cantidadArticulosComprados);
		
	}
	
	@Test
	public void testQueElClientePuedaRealizarUnaCompraDeUnCombo() {
		
		Empresa empresa = new Empresa(generarCombos());
		Cliente cliente = new Cliente("Oscar", 170000.00, TipoArticulo.INVALUABLE);
		
		Combo combo = empresa.ofrecerCombo(cliente);
		
		cliente.comprar(combo);
		
		Integer cantidadArticulosComprados = cliente.getCombosComprados().size();		
		Integer cantidadEsperada = 1;
		Double esperado = 50000.00;
		Double obtenido = cliente.getPresupuesto();
		
		assertEquals(esperado, obtenido);
		assertEquals(cantidadEsperada, cantidadArticulosComprados);
		
	}

}
