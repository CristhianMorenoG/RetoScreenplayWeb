package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.sikuli.script.FindFailed;
import util.Sikulix;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static ui.Carrito.*;

public class CalendarioCompra implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(IMAGEN_PRODUCTO, isVisible()).forNoMoreThan(60).seconds(),
                Scroll.to(IMAGEN_PRODUCTO)
        );
        try {
            Sikulix.click("FechaEntrega.png");
            Sikulix.click("Fecha.png");
        } catch (FindFailed e) {
            throw new RuntimeException(e);
        }
        actor.attemptsTo(
                WaitUntil.the(BOTON_IR_A_PAGOS, isClickable()).forNoMoreThan(60).seconds(),
                Click.on(BOTON_IR_A_PAGOS));
    }
}
