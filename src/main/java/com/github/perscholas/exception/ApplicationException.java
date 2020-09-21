package com.github.perscholas.exception;

public class ApplicationException extends RuntimeException{
    public ApplicationException (String message){super(message);}

    public ApplicationException (String message, Throwable ex) {super(message, ex);}
}
