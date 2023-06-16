package net.notepad.online.stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.notepad.online.exceptions.ControlExcepciones;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.notepad.online.tasks.CrearNotaEnriquecida;


import java.util.List;
import net.notepad.online.questions.ValidarNotaCreada;
import org.hamcrest.Matchers;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class BlogNotasOnlineStepDefinitions {

    public Actor usuario = Actor.named("tester");

    @Before
    public void setup() {
        usuario.can(BrowseTheWeb.with(getDriver()));
    }

    @Dado("que estoy en la pagina de inicio de Blogo de Notas Online")
    public void queEstoyEnLaPaginaDeInicioDeBlogoDeNotasOnline() {
        usuario.wasAbleTo(Open.url("https://www.online-notepad.net/es/bloc-de-notas-online"));
    }
    @Cuando("creo una nota de texto enriquecido")
    public void creoUnaNotaDeTextoEnriquecido(io.cucumber.datatable.DataTable dataTable){
        List<List<String>> data = dataTable.asLists(String.class);
        usuario.attemptsTo(CrearNotaEnriquecida.conNegrita(data.get(0).get(0),data.get(0).get(1)));
    }
    @Entonces("valido la correcta creación {string}")
    public void validoLaCorrectaCreación(String titulo) {
        usuario.should(seeThat(ValidarNotaCreada.nota(), Matchers.equalToIgnoringCase(titulo)).orComplainWith(ControlExcepciones.class, ControlExcepciones.NotaIncorrecta));
    }


    @After
    public void finalizarAutomatizacion(){
        Serenity.getWebdriverManager().closeCurrentDrivers();
    }

}
