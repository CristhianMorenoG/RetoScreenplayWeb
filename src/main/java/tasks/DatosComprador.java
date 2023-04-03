package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.sikuli.script.FindFailed;
import util.Sikulix;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static ui.Carrito.*;

public class DatosComprador implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BOTON_CARRITO),
                Click.on(BOTON_CONTINUAR_PAGO),
                WaitUntil.the(BOTON_PAGOS, isClickable()).forNoMoreThan(60).seconds()
                );
        try {
            Sikulix.typeInto("Nombre.png", "Nelson");
            Sikulix.typeInto("Apellido.png", "Velazquez");
            Sikulix.typeInto("Celular.png", "3000000000");
        } catch (FindFailed e) {
            throw new RuntimeException(e);

        }
        actor.attemptsTo(
                Click.on(CAMPO_CEDULA),
                Enter.theValue("1000000000").into(CAMPO_CEDULA),
                Click.on(CHECKBOX_TERMINOS_CONDICIONES),
                Click.on(BOTON_CONTINUAR_ENTREGA)
        );
    }
}
