/**
 * 
 */
package es.smartcoding.ocp.seccion03;

/**
 * @author pep
 * 
 *         Introducción a la programación funcional.
 * 
 *         Una interfaz funcional es aquella que contiene exactamente un único método abstracto.
 *         
 *         Representan la base de las expresiones lambda en la programación funcional.
 *         
 *         Una expresión lambda es un bloque de código parecido a un método anónimo que puede pasarse como parámetro.
 *         
 *         Dado que las expresiones lambda y la programación funcional es una parte integral de Java 8 haremos una revisión en esta lección, si bien se ven ampliamente en la sección Colecciones Genéricas.
 *         
 *         Aunque es una buena práctica marcar una interfaz funcional con la anotación @FunctionalInterface, no es un requerimiento ya que el compilador lo asume ímplicitamente.
 *         
 *         Revisa el apartado 'Syntax of Lambda Expressions' de este enlace: https://docs.oracle.com/javase/tutorial/java/javaOO/lambdaexpressions.html
 *         
 *         Revisa también la sección 'Understanding Lambda Syntax' del libro 'Oracle Certified Professional Java 8'.
 *         
 *         La interfaz Predicate<T> declara el método test(T t) que retorna un valor lógico es una de las interfaces funcionales que proporciona Java 8.
 * 	
 */

@FunctionalInterface
interface Impresora {
	void imprime(String doc);
}

class Impresion {
	private Impresora impresora;
	
	public Impresion(Impresora impresora) {
		this.impresora = impresora;
	}
	public void escribe(String doc) {
		impresora.imprime(doc);
	}
}

public class Leccion_03_02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String doc = "Mi documento a imprimir...";
		/* Implementación tradicional de una interfaz */
		Impresion impresion1 = new Impresion(new Impresora() {
			@Override
			public void imprime(String doc) {
				System.out.println(doc);		
			}
		});
		/* Implementación de una interfaz funcional con una expresión lambda */
		Impresion impresion2 = new Impresion((String documento) -> { System.out.println(documento);	 });
		impresion2.escribe(doc);		
	}

}
