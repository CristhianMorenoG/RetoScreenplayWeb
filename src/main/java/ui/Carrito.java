package ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Carrito extends PageObject {
    public static final Target BOTON_CARRITO = Target.the("Carrito mercado")
            .located(By.cssSelector(".vtex-flex-layout-0-x-flexColChild--header-links > div:nth-child(1) > div:nth-child(1) > div:nth-child(4)"));
    public static final Target BOTON_CONTINUAR_PAGO = Target.the("Ir a pagos")
            .located(By.cssSelector(".btn-place-order-wrapper"));
    public static final Target CAMPO_CEDULA = Target.the("Cedula cliente")
            .located(By.cssSelector("#client-new-document"));
    public static final Target CHECKBOX_TERMINOS_CONDICIONES = Target.the("Terminos y condiciones")
            .located(By.cssSelector(".FkJ0yu1zTUoK5gp8p2ybj > input:nth-child(1)"));
    public static final Target BOTON_PAGOS = Target.the("Boton pagos")
            .located(By.cssSelector("button.submit:nth-child(3)"));
    public static final Target BOTON_CONTINUAR_ENTREGA = Target.the("Ir a entrega")
            .located(By.cssSelector("#go-to-shipping"));
    public static final Target METODO_PAGO = Target.the("Pago contraentrega")
            .located(By.cssSelector(".custom201PaymentGroupPaymentGroup > p:nth-child(2)"));
    public static final Target BOTON_IR_A_PAGOS = Target.the("Apellido cliente")
            .located(By.cssSelector("#btn-go-to-payment"));
    public static final Target IMAGEN_PRODUCTO = Target.the("Apellido cliente")
            .located(By.cssSelector("#shipping-data > div > div.accordion-inner.shipping-container > div > div.undefined.delivery-group-content > div.vtex-omnishipping-1-x-scheduledDeliveryList > div:nth-child(2) > div > div:nth-child(3) > div > div:nth-child(2) > img"));
    public static final Target PAGO_CONTRAENTREGA = Target.the("Ir a pago contraentrega")
            .located(By.cssSelector("#payment-group-custom201PaymentGroupPaymentGroup"));
}
