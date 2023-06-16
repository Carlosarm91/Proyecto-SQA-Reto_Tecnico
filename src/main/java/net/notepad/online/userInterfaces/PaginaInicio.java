package net.notepad.online.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaInicio {
    public static final Target BOTON_TEXTO_ENRIQUECIDO = Target.the("Boton texto enriquecido").located(By.xpath("//button[@class='nav-link vNav' and @id='richtextnote-tab']"));
    public static final Target CAMPO_TITULO = Target.the("Campo titulo").located(By.xpath("//input[@class='fs-24 date d-inline-block']"));
    public static final Target BOTON_NEGRITA = Target.the("Boton texto negrita").located(By.xpath("(//button[@class='ck ck-button ck-off'])[1]"));
    public static final Target CAMPO_TEXTO = Target.the("Campo para ingresar texto").located(By.xpath("//div[@id='editor']"));
    public static final Target BOTON_SAVE= Target.the("Boton guardar").located(By.xpath("//button[@class='btn save-file-btn saveNotesBtn richtextnoteBtn']"));
    public static final Target TEXTO_NOTA_GUARDADA= Target.the("Texto donde se observa la nota guardada").located(By.xpath("(//a[@data-method='POST'])[1]"));


}
