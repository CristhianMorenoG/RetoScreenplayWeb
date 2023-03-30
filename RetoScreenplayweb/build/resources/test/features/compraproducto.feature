Feature: Comprar un producto en la pagna web del Exito

  Yo como Usuario
  Quiero comprar un producto
  Para tener productos

  Scenario: Comprar detergente
    Given inicie sesion en la pagina del exito
    When compro detergente
    Then completo el proceso