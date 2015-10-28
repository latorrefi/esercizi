package esercizi.junior.javadeveloper.esercizi.utility;

/**
 * Exception created to handle error on request validation
 * @author Filippo
 *
 */
public class InvalidRequestException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidRequestException(String msg){
		 super(msg);
	}
}
