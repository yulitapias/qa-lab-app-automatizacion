package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;

public class SwglabsLoginScreen extends PageObject {

    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc=\"test-Username\"]")
    private WebElement clickUser;
    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc=\"test-Username\"]")
    private WebElement inputUser;


    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc=\"test-Password\"]")
    private WebElement clickPassword;
    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc=\"test-Password\"]")
    private WebElement inputPassword;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-LOGIN\"]")
    private WebElement buttonEnviar;


    public void clickUsuario(){
        inputUser.click();
    }

    public void ingresoUser(String user){
        clickUser.sendKeys(user);
    }

    public void clickPassword(){
        clickPassword.click();
    }

    public void ingresoPassword(String password){
        inputPassword.sendKeys(password);

    }

    public void bottonSesion(){
        buttonEnviar.click();

    }

}
