package examen;
/**
 * 
 * @author DAM103
 * @version 1.0
 */
public class Fecha {
	public static boolean fechaValida;
/**
 * 
 * @param anio indica el año
 * @param mes indica el mes
 * @param dia indica el dia
 * @return devuelve si los datos introducidos son validos (true) o no (false)
 */
	public static boolean validarFecha(int anio, int mes, int dia) {
		fechaValida = false;
		if ((dia > 0) && (mes > 0) && (anio > 0)) {
			if ((mes <= 12) && (dia <= 31)) {
				if (mes == 2) {
					fechaValida = dia <= 28;
				} else if (mes % 2 == 0) {
					fechaValida = dia <= 30;
				} else {
					fechaValida = dia <= 31;
				}
			}
		}
		return fechaValida;
		
	}
}