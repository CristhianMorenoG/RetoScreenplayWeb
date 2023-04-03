package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;


import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static ui.SeleccionarProducto.*;

public class AgregarProducto implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BUSCADOR, isClickable()).forNoMoreThan(60).seconds(),
                Click.on(BUSCADOR),
                Enter.theValue("Detergente").into(BUSCADOR),
                Click.on(BUSCAR_PRODUCTO)

        );


    }
}
