package funciones;

/**
 * Clase de utilidades que implementa algunos métodos
 * @author David Casas
 *
 */
public class Utilidades {

	

	/**
	 * Método que devuelve una cadena con la representacion de la nota 
	 * en base a la nota pasada como parámetro en valor decimal
	 * @param double nota la nota en valor decimal
	 * @return String con la representación de la nota: Suspenso, Bien,
	 *         Notable, Sobresaliente o Matrícula
	 * @throws ArithmeticException que se lanza si la nota es inferior a 0
	 *         o superior a 10
	 */
	public String devuelveNota(double nota) {
		String descripcion = "Matrícula";
		
		if (nota<0.0 || nota >10) {
			throw new ArithmeticException("La nota debe estar entre 0.0 y 10");
		} else if (nota<5.0) {
			descripcion="Suspenso";
		} else if (nota <6.5) {
			descripcion = "Bien";
		} else if (nota<8.5) {
			descripcion ="Notable";
		} else if (nota<10) {
			descripcion ="Sobresaliente";
		} else {
			descripcion = "Matrícula";
		}
		return descripcion;
	}
}