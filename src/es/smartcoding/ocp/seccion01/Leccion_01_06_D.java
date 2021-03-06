package es.smartcoding.ocp.seccion01;

/**
 * 
 * @author pep
 * 
 *         Diseño avanzado de clases
 * 
 *         Clases anidades estáticas
 * 
 *         Se trata de una clase estática definida como un miembro de clase de la clase externa, la que la contiene.
 * 
 *         Puede ser creada sin que haya una instancia de la clase contenedora o externa. Pero no puede acceder a las variables de instancia de la clase externa
 *         sin un objeto explícito de la clase contenedora.
 * 
 *         Se trata de una clase como otra cualquiera excepto por lo siguiente:
 * 
 *         1. La clase contenedora crea un nombre de espacio que debe ser usado para acceder a la clase anidada estática
 * 
 *         2. Puede ser privada o usar cualquier otro modificador de acceso.
 * 
 *         3. La clase contenedora puede acceder a los campos y métodos de la clase anidada estática.
 *
 */

public class Leccion_01_06_D {

	private String ident = "OCP";

	private static class StaticNestedClass {
		private static int i = 1;
		private int j = 2;

		public StaticNestedClass() {
			// System.out.println(ident);
		}
	}

	@SuppressWarnings("static-access")
	public static void main(String[] args) {

		Leccion_01_06_D.StaticNestedClass snc = new Leccion_01_06_D.StaticNestedClass();
		System.out.println(snc.i);
		System.out.println(snc.j);
		System.out.println(Leccion_01_06_D.StaticNestedClass.i);
		System.out.println(new Leccion_01_06_D.StaticNestedClass().j);
	}

}







