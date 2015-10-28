package esercizi.junior.javadeveloper.esercizi.utility;

/**
 * Exception created to handle Internal server error
 * @author Filippo
 *
 */
public class GenericInternalError extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 276166869026779093L;

	public GenericInternalError(String msg){
		 super(msg);
	}
}
