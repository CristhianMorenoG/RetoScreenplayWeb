package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import org.sikuli.script.FindFailed;
import util.Sikulix;

import static ui.IniciarSesion.BOTON_CIERRE_RECUADRO;

public class SeleccionarRecogida implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        try {

            Sikulix.click("Seleccionar ciudad.png");
            Sikulix.click("Bogota.png");
            Sikulix.click("Seleccionar almacen.png");
            Sikulix.click("Exito calle 80.png");
            Sikulix.click("Confirmar.png");
        } catch (FindFailed e) {
            throw new RuntimeException(e);
        }
        actor.attemptsTo(
                Click.on(BOTON_CIERRE_RECUADRO)
        );
    }
}
