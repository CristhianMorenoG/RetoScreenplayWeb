package ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class IniciarSesion {
    public static final Target BOTON_INICIO_SESION=Target.the("Ingresar a mi cuenta")
            .located(By.cssSelector(".vtex-flex-layout-0-x-flexColChild--header-links > div:nth-child(1) > div:nth-child(1) > div:nth-child(2)"));
    public static final Target BOTON_EMAIL_PASSWORD=Target.the("Login email y password")
            .located(By.cssSelector(".vtex-login-2-x-emailPasswordOptionBtn"));
    public static final Target BOTON_EMAIL=Target.the("Ingresar email")
            .located(By.cssSelector("input.ph5"));
    public static final Target BOTON_PASSWORD=Target.the("Ingresar password")
            .located(By.cssSelector("div.vtex-login-2-x-inputContainer:nth-child(2) > div:nth-child(1) > label:nth-child(1) > div:nth-child(1) > input:nth-child(1)"));
    public static final Target BOTON_INGRESAR=Target.the("Ingresar")
            .located(By.cssSelector(".vtex-login-2-x-sendButton > button:nth-child(1) > div:nth-child(1)"));
    public static final Target BOTON_CIERRE_RECUADRO=Target.the("Cierre recuadro")
            .located(By.cssSelector(".exito-geolocation-3-x-cursorPointer"));


}
