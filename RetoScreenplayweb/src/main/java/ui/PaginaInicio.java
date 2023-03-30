package ui;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class PaginaInicio extends PageObject {
    public static final Target MI_CUENTA=Target.the("Ingresar a mi cuenta")
            .located(By.cssSelector("input[placeholder='Buscar en exito.com']"));}
