package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.sikuli.script.ImagePath;
import setup.Configuracion;
import tasks.AgregarProducto;
import tasks.InicioSesion;
import tasks.PaginaInicial;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CompraProductoStepDefinition extends Configuracion {
    @Given("inicie sesion en la pagina del exito")
    public void inicieSesionEnLaPaginaDelExito() {
        String newPath = "src/test/resources/images/";
        ImagePath.setBundlePath(newPath);
        configurarNavegador();
        theActorInTheSpotlight().wasAbleTo(
                new PaginaInicial()
        );
        theActorInTheSpotlight().attemptsTo(
                new InicioSesion()
        );
    }

    @When("compro detergente")
    public void comproDetergente() {
        theActorInTheSpotlight().wasAbleTo(
                new AgregarProducto()




        );
    }

    @Then("completo el proceso")
    public void completoElProceso() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
