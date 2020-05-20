package org.CamposAlberto.Tema8.TestEJ1;

import static org.junit.jupiter.api.Assertions.*;

import org.CamposAlberto.Tema8.EJ1.Cadena;
import org.junit.jupiter.api.Test;

class CadenaTest {
 Cadena cadena=new Cadena("Cadena");
 	@Test
 	void testCdelante() {
 		cadena.cDelante("siguiente");
 		assertEquals("siguiente Cadena", cadena.getCadena());
 	}
 	@Test
 	void testCdetras() {
 		cadena.cDetras("detras");
 		assertEquals("Cadena detras", cadena.getCadena());
 	}
 	@Test
	void testQuitar() {
 		cadena.quitar("a");
 		assertEquals("Cden", cadena.getCadena());
 	}
 	
 	@Test
	void testQuitarVariosCaracter() {
 		cadena.quitar("a",1);
 		assertEquals("Cdena", cadena.getCadena());
 	}


}
