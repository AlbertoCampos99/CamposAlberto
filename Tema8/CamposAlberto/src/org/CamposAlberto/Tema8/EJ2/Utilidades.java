package org.CamposAlberto.Tema8.EJ2;

import java.util.Calendar;
import java.util.GregorianCalendar;
import org.CamposAlberto.Tema8.EJ2.FechaException;

public class Utilidades {
	public static boolean esFinDeSemana(int dia, int mes, int anyo) throws FechaException {
		boolean finales = true;
		Calendar calendario = new GregorianCalendar();
		calendario.set(anyo, mes, dia);
		if (anyo < 1990 || (dia != 1 && mes != 1 && anyo == 3000)) {
			throw new FechaException("la fecha no vale");
		} else {
			int NDia = calendario.get(Calendar.DAY_OF_WEEK);
			if (NDia == Calendar.SATURDAY || NDia == Calendar.SUNDAY) {
				finales = true;
			} else {
				finales = false;
			}
			return finales;
		}
	}
}