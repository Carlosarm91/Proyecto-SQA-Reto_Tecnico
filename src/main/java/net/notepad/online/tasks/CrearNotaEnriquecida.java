package net.notepad.online.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static net.notepad.online.userInterfaces.PaginaInicio.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class CrearNotaEnriquecida implements Task {

    private final String titulo;
    private final String textoNota;

    public CrearNotaEnriquecida(String titulo, String textoNota) {
        this.titulo = titulo;
        this.textoNota = textoNota;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BOTON_TEXTO_ENRIQUECIDO, isPresent()).forNoMoreThan(10).seconds(),
                net.serenitybdd.screenplay.actions.Click.on(BOTON_TEXTO_ENRIQUECIDO),
                Click.on(BOTON_NEGRITA),
                Enter.theValue(titulo).into(CAMPO_TITULO),
                Enter.theValue(textoNota).into(CAMPO_TEXTO),
                Scroll.to(BOTON_SAVE),
                Click.on(BOTON_SAVE)
        );
    }

    public static CrearNotaEnriquecida conNegrita(String titulo, String textoNota){
        return Tasks.instrumented(CrearNotaEnriquecida.class, titulo, textoNota);
    }
}
