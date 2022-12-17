package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;

public class SwglabsTitleScreen extends PageObject {

    @AndroidFindBy(xpath="//android.view.ViewGroup[@content-desc=\"test-Cart drop zone\"]/android.view.ViewGroup/android.widget.TextView")
    private WebElement resultTitle;

    @AndroidFindBy(xpath="(//android.view.ViewGroup[@content-desc=\"test-ADD TO CART\"])[2]/android.widget.TextView")
    private WebElement resultItem;

    public String obtenerTitulo(){
        return resultTitle.getText();
    }

    public String obtenerItem(){
        return resultItem.getText();
    }

}
