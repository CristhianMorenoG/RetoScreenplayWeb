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
            .located(By.cssSelector(".vtex-search-result-3-x-orderByText"));
    public static final Target ORGANIZAR_MENOR_PRECIO=Target.the("Organizar productos")
            .located(By.cssSelector("button.hover-bg-muted-5:nth-child(5)"));
    public static final Target MENOR_PRECIO_SLIDER=Target.the("Organizar productos")
            .located(By.cssSelector("div.vtex-slider__selector-container:nth-child(2)"));
    public static final Target MENOR_PRECIO=Target.the("Organizar productos")
            .located(By.cssSelector("div.vtex-search-result-3-x-galleryItem:nth-child(1) > section:nth-child(1) > a:nth-child(1) > article:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > img:nth-child(1)"));
    public static final Target ADICIONAR_PRODUCTO=Target.the("Adicionar productos")
            .located(By.cssSelector("div.exito-vtex-components-4-x-mainBuyButton:nth-child(2) > div:nth-child(2) > button:nth-child(1) > div:nth-child(1)"));
}
