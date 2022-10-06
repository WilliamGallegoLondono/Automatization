package com.Bonbonite.steepsdefinitions;

import com.Bonbonite.task.InserarCredenciales;
import com.Bonbonite.task.Oprimir;
import com.Bonbonite.task.OprimirBoton;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class ComprasSteepDefinitions {

    @Managed(driver = "chrome")
    private WebDriver driver;

    @Given("me encuentro en el home de la pagina Bon Bonite")
    public void meEncuentroEnElHomeDeLaPaginaBonBonite() {
        OnStage.setTheStage(Cast.whereEveryoneCan(BrowseTheWeb.with(driver)));
        OnStage.theActorCalled("Bon Bonite");
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://www.bon-bonite.com/"));
        OnStage.theActorInTheSpotlight().wasAbleTo(OprimirBoton.login());
    }

    @Given("oprime el icono de login")
    public void oprimeElIconoDeLogin() {


    }

    @Given("ingreso {string} y {string}")
    public void ingresoY(String usuario, String contrasena) {
        OnStage.theActorInTheSpotlight().wasAbleTo(InserarCredenciales.con(usuario,contrasena));


    }

    @Given("oprimo el boton aceder")
    public void oprimoElBotonAceder() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Oprimir.acceder());

    }

    @When("seleciono la categoria zapatos")
    public void selecionoLaCategoriaZapatos() {

    }

    @When("seleciono el modelo de zapatos")
    public void selecionoElModeloDeZapatos() {

    }

    @When("seleciono la talla")
    public void selecionoLaTalla() {

    }

    @When("oprimo el boton agregar al carrito")
    public void oprimoElBotonAgregarAlCarrito() {

    }

    @When("oprimo el boton de carrito")
    public void oprimoElBotonDeCarrito() {

    }

    @When("oprimo el boton de finalizar compra")
    public void oprimoElBotonDeFinalizarCompra() {

    }

    @Then("deberia ver el {string}")
    public void deberiaVerEl(String string) {

    }




}
