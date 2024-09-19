package webservices;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import entidad.Mensaje;

/*
 *  La anotaci�n @Path indica la ruta que debe seguir el usuario 
 *  para acceder al servicio web (una vez haya entrado en nuestro servlet jersey,
 *  ver el fichero web.xml).
 *  Este seria el recurso al que queremos acceder
 */
@Path("mensaje")
public class WebServiceBasico {
	/*
	 * La anotaci�n @GET indica el m�todo HTTP que se utilizar� para recibir 
	 * peticiones. 
	 * El m�todo mostrarMensaje atender� peticiones de clientes de tipo GET, 
	 * y tambi�n podemos utilizar @POST para atender peticiones de tipo POST.
	 * 
	 * La anotaci�n @Produces indica el tipo MIME de la respuesta del servidor.
	 * 
	 * Para acceder a este metodo la URL a poner en el navegador seria la siguiente:
	 * localhost:8080/27_ServidorRest/rest/mensaje
	 */
	@GET
	@Produces({"text/plain"})//MIME TYPE
	public String mostrarMensaje() {
		Mensaje msg = new Mensaje("Hola amigo");
		return msg.getTexto();
	}
	
	
	//este metodo no ser� usado para mapear nada ya que no tiene ninguna anotaci�n
	public void miMetodo() {
		
	}
}
