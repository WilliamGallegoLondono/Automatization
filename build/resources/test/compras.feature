Feature: comprando en Bon Bonite
  yo como usuaio de la pagina Bon Bonite requiero realizar la compra de un articulo

  Scenario Outline: compras
    Given me encuentro en el home de la pagina Bon Bonite
    And oprime el icono de login
    And ingreso <usuario> y <contrasena>
    And oprimo el boton aceder
    When seleciono la categoria zapatos
    And seleciono el modelo de zapatos
    And seleciono la talla
    And oprimo el boton agregar al carrito
    And oprimo el boton de carrito
    And oprimo el boton de finalizar compra
    Then deberia ver el <subtotalDelaCompra>

Examples:

|usuario     |contrasena   |subtotalDelaCompra|
|"1152696923"|"Agosto2022*"|"282,900"         |