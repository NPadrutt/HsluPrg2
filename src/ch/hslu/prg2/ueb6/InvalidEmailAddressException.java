package ch.hslu.prg2.ueb6;

/**
 *
 * @author Nino
 */
public class InvalidEmailAddressException extends Throwable {
    public InvalidEmailAddressException(String message){
        super(message);
    }
}
