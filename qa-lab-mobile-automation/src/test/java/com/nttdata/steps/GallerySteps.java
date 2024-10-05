package com.nttdata.steps;

import com.nttdata.screens.GalleryScreen;
import org.junit.Assert;

public class GallerySteps {

    GalleryScreen galleryScreen;

    public void gallerySuccess(){

        Assert.assertTrue("Productos no validados en galeria",galleryScreen.isProductDisplayed());

    }

    public void productBackpack(){

    }

    public void productBolt(){

    }

    public void productBike(){

    }

}
