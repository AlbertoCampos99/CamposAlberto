package org.CamposAlberto.Tema8.EJ3;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Primos {
	public static boolean esPrimo(int numero) throws PrimoException {
		boolean Primo = true;
		if (numero < 0 || numero > 1000000) {
			throw new PrimoException("no es primo");
		} else if (numero == 0 || numero == 1) {
			Primo = false;
		} else {
			boolean salir = false;
			for (int a = 2; a < numero && salir == false; a++) {
				if (numero % a == 0) {
					Primo = false;
					salir = true;
 
				} else if (a == numero) {
					Primo = true;
				}

			}
		}
		return Primo;
	}

}
