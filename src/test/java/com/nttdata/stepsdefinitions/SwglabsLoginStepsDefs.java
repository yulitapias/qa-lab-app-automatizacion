package com.nttdata.stepsdefinitions;

import com.nttdata.steps.SwglabsLoginSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

public class SwglabsLoginStepsDefs {

    @Steps
    SwglabsLoginSteps swglabsLoginSteps;
    @Given("que me enuentro en el login de Swaglabs")
    public void que_me_enuentro_en_el_login_de_airbnb() {

    }
    @When("inicio sesion con las credenciales usuario {string}y contraseña {string}")
    public void inicio_sesion_con_las_credenciales_usuario_standard_user_y_contraseña(String user, String password) {
        swglabsLoginSteps.loginUser(user, password);
    }

   @Then("valido que deveria aparecer el titulo {string}")
    public void valido_que_deveria_aparecer_el_titulo(String titulo ) {
        Assert.assertEquals(swglabsLoginSteps.getTitle(),titulo);
    }

   @And("valido que exista almenos un item , utilizando  la palabra {string}")
    public void valido_que_exista_almenos_un_item(String producto) {
        Assert.assertEquals(swglabsLoginSteps.cantidad(),producto);
    }

}
