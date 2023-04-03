package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static ui.Carrito.METODO_PAGO;
import static ui.Carrito.PAGO_CONTRAENTREGA;

public class MetodoPago implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(PAGO_CONTRAENTREGA, isVisible()).forNoMoreThan(60).seconds(),
                Scroll.to(PAGO_CONTRAENTREGA),
                WaitUntil.the(PAGO_CONTRAENTREGA, isVisible()).forNoMoreThan(60).seconds(),
                Click.on(PAGO_CONTRAENTREGA)
        );
        System.out.println(METODO_PAGO);
    }
}
