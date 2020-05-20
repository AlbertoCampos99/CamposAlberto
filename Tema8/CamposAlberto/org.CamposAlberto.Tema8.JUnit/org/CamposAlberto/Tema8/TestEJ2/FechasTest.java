package org.CamposAlberto.Tema8.TestEJ2;

import static org.junit.jupiter.api.Assertions.*;

import org.CamposAlberto.Tema8.EJ2.FechaException;
import org.CamposAlberto.Tema8.EJ2.Utilidades;
import org.junit.jupiter.api.Test;
class FechasTest {
 	/*@Test
 	void anioAnterior() throws FechaException{
 		assertThrows(FechaException.class;() -> Utilidades.esFinDeSemana(5,5,1980));
 	}*/
 	@Test
 	void aniobajoJusto() throws FechaException{
 		assertFalse(Utilidades.esFinDeSemana(1,1,1990));
 	}
 	@Test
 	void Casidentro() throws FechaException{
 		assertFalse(Utilidades.esFinDeSemana(15,5,2020));
 	}
 	@Test
 	void dentro() throws FechaException{
 		assertTrue(Utilidades.esFinDeSemana(17,5,2020));
 	}
 	@Test
 	void casifuera() throws FechaException{
 		assertTrue(Utilidades.esFinDeSemana(1,1,3000));
 	}
	
	@Test
	void fuera() throws FechaException{
		assertTrue(Utilidades.esFinDeSemana(2,1,3000));
	}
}
