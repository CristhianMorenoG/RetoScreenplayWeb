package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.sikuli.script.FindFailed;


import util.Sikulix;

import static ui.IniciarSesion.*;

public class InicioSesion implements Task {

   /* private List<>

    public InicioSesion conElUsuario(String usuario) {
        this.usuario = usuario;
        return this;
    }
    public InicioSesion yConPassword(String password) {
        this.password = password;
        return this;
  */

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BOTON_INICIO_SESION),
                Click.on(BOTON_EMAIL_PASSWORD),
                Click.on(BOTON_EMAIL),
                //Ingresar email
                Enter.theValue("").into(BOTON_EMAIL),
                Click.on(BOTON_PASSWORD),
                //Ingresar password
                Enter.theValue("").into(BOTON_PASSWORD),
                Click.on(BOTON_INGRESAR)
        );

    }

}
