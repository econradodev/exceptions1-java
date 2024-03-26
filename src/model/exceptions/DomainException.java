package model.exceptions;

public class DomainException extends RuntimeException{
    private static final long serialVersionUTD = 1L;

    public DomainException (String msg) {
        super(msg);
    }


}
