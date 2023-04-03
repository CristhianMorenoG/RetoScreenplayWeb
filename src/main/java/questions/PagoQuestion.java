package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static ui.Carrito.METODO_PAGO;

public class PagoQuestion implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return METODO_PAGO.resolveFor(actor).getText();
        }

    public static PagoQuestion pagoQuestion(){
        return new PagoQuestion();
    }

}
