package net.notepad.online.exceptions;

public class ControlExcepciones extends AssertionError{
    public static final String NotaIncorrecta = "La nota visualizada no es la esperada";

    public ControlExcepciones(String message, Throwable cause) {
        super(message, cause);
    }
}

