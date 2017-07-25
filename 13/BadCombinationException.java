/** nCk において n < k のときの例外 */
public class BadCombinationException extends Exception {
    public BadCombinationException() {
        super();
    }

    public BadCombinationException(String message) {
        super(message);
    }
}
