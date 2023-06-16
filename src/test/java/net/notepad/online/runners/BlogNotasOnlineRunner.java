package net.notepad.online.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src\\test\\resources\\features\\NotaDeTexto.feature",
                    glue="net.notepad.online.stepDefinitions",
                    tags="@ESCENARIO_1",
                    snippets = CucumberOptions.SnippetType.CAMELCASE)
public class BlogNotasOnlineRunner {
}
