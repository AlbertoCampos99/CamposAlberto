package org.CamposAlberto.Tema8.TestEJ3;

import static org.junit.jupiter.api.Assertions.*;

import org.CamposAlberto.Tema8.EJ2.FechaException;
import org.CamposAlberto.Tema8.EJ2.Utilidades;
import org.CamposAlberto.Tema8.EJ3.PrimoException;
import org.CamposAlberto.Tema8.EJ3.Primos;
import org.junit.jupiter.api.Test;

class PrimosTest {

/* 	@Test
 	void Primo0() throws PrimoException{
 		assertThrows(Primos.esPrimo(0));
 	}
	@Test
 	void Primo1() throws PrimoException{
 		assertThrows(Primos.esPrimo(1));
 	}*/
	@Test
 	void Primo7() throws PrimoException{
 		assertTrue(Primos.esPrimo(7));
 	}
	@Test
 	void Primo8() throws PrimoException{
 		assertFalse(Primos.esPrimo(8));
 	}
	@Test
 	void Primo999983() throws PrimoException{
 		assertTrue(Primos.esPrimo(999983));
 	}
	@Test
 	void Primo999999() throws PrimoException{
 		assertFalse(Primos.esPrimo(999999));
 	}
}


