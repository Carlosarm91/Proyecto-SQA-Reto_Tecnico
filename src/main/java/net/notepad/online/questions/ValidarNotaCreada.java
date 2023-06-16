package net.notepad.online.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.notepad.online.userInterfaces.PaginaInicio.TEXTO_NOTA_GUARDADA;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

public class ValidarNotaCreada implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        WaitUntil.the(TEXTO_NOTA_GUARDADA, isPresent()).forNoMoreThan(10).seconds();
        return the(TEXTO_NOTA_GUARDADA).answeredBy(actor).getText();
    }

    public static Question<String> nota() {
        return new ValidarNotaCreada();
    }
}
