package com.nttdata.stepsdefinitions;

import com.nttdata.steps.GallerySteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;

public class GalleryStepsDefs {

    @Steps
    GallerySteps gallerySteps;

    @Given("estoy en la aplicación de SauceLabs")
    public void estoyEnLaAplicaciónDeSauceLabs() {

    }

    @And("valido que carguen correctamente los productos en la galeria")
    public void validoQueCarguenCorrectamenteLosProductosEnLaGaleria() {
        gallerySteps.gallerySuccess();

    }

    @When("agrego <UNIDADES> del siguiente producto <PRODUCTO> {string}")
    public void agregoUNIDADESDelSiguienteProducto(int unidades, String producto) {
        gallerySteps.agregarProductoAlCarrito(producto, unidades);
    }




    @Then("valido el carrito de compra actualice correctamente")
    public void validoElCarritoDeCompraActualiceCorrectamente() {
        gallerySteps.validarCarritoActualizado();
    }


}
