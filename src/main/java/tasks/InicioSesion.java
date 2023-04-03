package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;



import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static ui.IniciarSesion.*;

public class InicioSesion implements Task {

    private String usuario;
    private String password;

    public InicioSesion conUser(String usuario) {
        this.usuario = usuario;
        return this;
    }

    public InicioSesion conPassword(String password) {
        this.password = password;
        return this;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BOTON_INICIO_SESION),
                WaitUntil.the(BOTON_EMAIL_PASSWORD, isVisible()).forNoMoreThan(60).seconds(),
                Click.on(BOTON_EMAIL_PASSWORD),
                Click.on(BOTON_EMAIL),
                Enter.theValue(usuario).into(BOTON_EMAIL),
                Click.on(BOTON_PASSWORD),
                Enter.theValue(password).into(BOTON_PASSWORD),
                Click.on(BOTON_INGRESAR)
        );

    }
    public static InicioSesion inicioSesion(){
        return new InicioSesion();
    }

}
