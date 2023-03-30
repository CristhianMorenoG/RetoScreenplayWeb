package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.sikuli.script.FindFailed;
import util.Sikulix;

import static ui.SeleccionarProducto.*;

public class AgregarProducto implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BUSCADOR)
        );


        try {
            Sikulix.typeInto("Buscar.png", "Detergente");
            Sikulix.click("Buscar producto.png");
            Sikulix.click("Seleccionar ciudad.png");
            Sikulix.click("Bogota.png");
            Sikulix.click("Seleccionar almacen.png");
            Sikulix.click("Exito calle 80.png");
            Sikulix.click("Confirmar.png");
            Sikulix.click("Ordenar por.png");
            Sikulix.click("Menos precio.png");
        } catch (FindFailed e) {
            throw new RuntimeException(e);
        }
    }
}
