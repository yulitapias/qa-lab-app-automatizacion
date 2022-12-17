Feature: inicio de sesion en Swaglabs

  @test
  Scenario: inicio sesion en la app swaglabs ,
  verificacion de existencia de producto

    Given que me enuentro en el login de Swaglabs
    When inicio sesion con las credenciales usuario "standard_user"y contraseña "secret_sauce"
    Then valido que deveria aparecer el titulo "PRODUCTS"
    And valido que exista almenos un item , utilizando  la palabra "ADD TO CART"
