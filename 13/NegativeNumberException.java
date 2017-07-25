/** 負の整数に関する例外 */
public class NegativeNumberException extends Exception {
    public NegativeNumberException() {
	super();
    }

    public NegativeNumberException(String message) {
	super(message);
    }
}
