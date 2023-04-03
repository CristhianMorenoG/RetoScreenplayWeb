package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.log4j.Logger;
import org.assertj.core.api.Assertions;
import org.sikuli.script.ImagePath;
import setup.Configuracion;
import tasks.*;

import java.io.IOException;
import java.util.List;

import static com.google.common.base.Predicates.equalTo;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static questions.PagoQuestion.pagoQuestion;
import static tasks.InicioSesion.inicioSesion;
import static util.UserPassword.getEmailPassword;

public class CompraProductoStepDefinition extends Configuracion {
    private static final Logger LOGGER = Logger.getLogger(String.valueOf(CompraProductoStepDefinition.class));
    private List<String> credenciales = getEmailPassword();

    public CompraProductoStepDefinition() throws IOException {
    }

    @Given("inicie sesion en la pagina del exito")
    public void inicieSesionEnLaPaginaDelExito() {
        String newPath = "src/test/resources/images/";
        ImagePath.setBundlePath(newPath);
        try {
            LOGGER.info("Inicio step: inicie sesion en la pagina del exito");
            configurarNavegador();
            theActorInTheSpotlight().wasAbleTo(
                    new PaginaInicial()
            );
            theActorInTheSpotlight().attemptsTo(
                    inicioSesion()
                            .conUser(credenciales.get(0))
                            .conPassword(credenciales.get(1))
            );
            LOGGER.info("Step finalizado satisfactoriamente");
        } catch (Exception e) {
            LOGGER.info("Fallo en el step: inicie sesion en la pagina del exito");
            LOGGER.warn(e.getMessage());
            Assertions.fail(e.getMessage());
            quitarDriver();
        }


    }


    @When("compro detergente")
    public void comproDetergente() {
        try {
            LOGGER.info("Inicio step: compro detergente");
            theActorInTheSpotlight().wasAbleTo(
                    new AgregarProducto(),
                    new SeleccionarRecogida(),
                    new MenorPrecio(),
                    new DatosComprador(),
                    new CalendarioCompra()

            );
        } catch (Exception e) {
            LOGGER.info("Fallo en el step: compro detergente");
            LOGGER.warn(e.getMessage());
            Assertions.fail(e.getMessage());
            quitarDriver();

        }
    }

    @Then("completo el proceso")
    public void completoElProceso() {
        try {
            LOGGER.info("Inicio step: completo el proceso");
            theActorInTheSpotlight().wasAbleTo(
                    new MetodoPago()
            );
        } catch (Exception e) {
            LOGGER.info("Fallo en el step: completo el proceso");
            LOGGER.warn(e.getMessage());
            Assertions.fail(e.getMessage());
            quitarDriver();
        }
        try {
            LOGGER.info("Se realiza la asercion");
            theActorInTheSpotlight().should(
                    seeThat(pagoQuestion(), equalTo("Pago contraentrega"))
            );
            LOGGER.info("Prueba finalizada satisfactoriamente");
            quitarDriver();
        } catch (Exception e) {
            LOGGER.info("Fallo en la asercion");
            Assertions.fail(e.getMessage());
            quitarDriver();

        }
    }
}



