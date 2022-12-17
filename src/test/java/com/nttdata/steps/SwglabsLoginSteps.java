package com.nttdata.steps;

import com.nttdata.screens.SwglabsLoginScreen;
import com.nttdata.screens.SwglabsTitleScreen;
import net.thucydides.core.annotations.Step;


public class SwglabsLoginSteps {

        SwglabsLoginScreen swglabsLoginScreen;
        SwglabsTitleScreen swglabsTitleScreen;


        @Step("inicio de sesion  con usuario y contraseñe{0}")
    public void loginUser(String user, String password){
            swglabsLoginScreen.clickUsuario();
            swglabsLoginScreen.ingresoUser(user);
            swglabsLoginScreen.clickPassword();
            swglabsLoginScreen.ingresoPassword(password);
            swglabsLoginScreen.bottonSesion();

        }

        @Step ("obtener el titulo PRODUCTS")
          public String getTitle(){
            return swglabsTitleScreen.obtenerTitulo();
        }

    @Step ("obtener items")
           public String cantidad(){
            return swglabsTitleScreen.obtenerItem();
    }
}
