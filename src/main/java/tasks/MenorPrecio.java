package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;
import static ui.SeleccionarProducto.*;

public class MenorPrecio implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(ORGANIZAR_POR, isClickable()).forNoMoreThan(60).seconds(),
                Click.on(ORGANIZAR_POR),
                Click.on(ORGANIZAR_MENOR_PRECIO),
                WaitUntil.the(MENOR_PRECIO_SLIDER, isClickable()).forNoMoreThan(60).seconds(),
                Click.on(MENOR_PRECIO_SLIDER),
                WaitUntil.the(MENOR_PRECIO, isClickable()).forNoMoreThan(60).seconds(),
                WaitUntil.the(MENOR_PRECIO_SLIDER, isNotVisible()).forNoMoreThan(60).seconds(),
                Click.on(ADICIONAR_PRODUCTO)
        );
    }
}
