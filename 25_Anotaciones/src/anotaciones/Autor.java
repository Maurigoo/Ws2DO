package anotaciones;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/*
 * La anotaci�n @Retention(RetentionPolicy.RUNTIME) 
 * permite que la anotaci�n @Autor est� disponible en 
 * tiempo de ejecuci�n.
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface Autor {
	/*
	 * La anotaci�n cuenta con los atributos o datos nombre 
	 * y direccion cuyos valores predeterminados son 
	 * "Tel�fonica" y "Distrito Telef�nica".
	 */
	String nombre() default "Telef�nica";
	String direccion() default "Distrito Telef�nica";
}
