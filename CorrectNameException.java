public class CorrectNameException extends RuntimeException{
    public CorrectNameException() {
    }

    public CorrectNameException(String message) {
        super(message);
    }

    public CorrectNameException(String message, Throwable cause) {
        super(message, cause);
    }

    public CorrectNameException(Throwable cause) {
        super(cause);
    }

    public CorrectNameException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
