package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import ui.PaginaInicio;


public class PaginaInicial implements Task {
    private PaginaInicio paginaInicio;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn(paginaInicio)
        );
    }
}
