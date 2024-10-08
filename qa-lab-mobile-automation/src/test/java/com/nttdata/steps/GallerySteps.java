package com.nttdata.steps;

import com.nttdata.screens.GalleryScreen;
import org.junit.Assert;

public class GallerySteps {

    GalleryScreen galleryScreen;

    public void gallerySuccess() {
        Assert.assertTrue("Productos no validados en galeria", galleryScreen.isProductDisplayed());

    }

    public void agregarProductoAlCarrito(String producto, int unidades) {
        switch (producto) {
            case "Sauce Labs Backpack":
                galleryScreen.getBackpackProduct().click();
                galleryScreen.getBtnAddCar().click();
                validarCarritoActualizado("Sauce Labs Backpack");
                break;

            case "Sauce Labs Bolt - T-Shirt":
                galleryScreen.getBoltProduct().click();
                galleryScreen.getBtnAddCar().click();
                validarCarritoActualizado("Sauce Labs Bolt - T-Shirt");
                break;

            case "Sauce Labs Bike Light":
                galleryScreen.getBikeProduct().click();
                galleryScreen.getIncreaseUnit().click();
                if (unidades == 2) {
                    galleryScreen.getBtnAddCar().click();
                }
                validarCarritoActualizado("Sauce Labs Bike Light");
                break;

            default:
                Assert.fail("Producto no válido");

        }
    }

    public void validarCarritoActualizado(String producto) {
        galleryScreen.getBtnInCar().click();
        String mensajeError = "El producto " + producto + " no se encuentra en el carrito";
        switch (producto) {
            case "Sauce Labs Backpack":
                Assert.assertTrue(mensajeError, galleryScreen.getLblBackpackCar().isDisplayed());
                break;

            case "Sauce Labs Bolt - T-Shirt":
                Assert.assertTrue(mensajeError, galleryScreen.getLblBoltCar().isDisplayed());
                break;

            case "Sauce Labs Bike Light":
                Assert.assertTrue(mensajeError, galleryScreen.getLblBikeCar().isDisplayed());
                break;

            default:
                Assert.fail("Producto no válido para la validación en el carrito");
        }
    }


}
