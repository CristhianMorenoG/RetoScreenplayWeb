package ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SeleccionarProducto extends PageObject {
    public static final Target BUSCADOR=Target.the("Buscar producto")
            .located(By.id("downshift-0-input"));
    public static final Target BUSCAR_PRODUCTO=Target.the("Buscar productos")
            .located(By.cssSelector(".vtex-store-components-3-x-suffixWrapper"));
    public static final Target ORGANIZAR_POR=Target.the("Organizar productos")
            .located(By.id("nav-caret--down"));
}
