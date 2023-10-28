# encoding: UTF-8

Feature: Obtener archivos PDF de la página del IFARHU
  Yo como usuario quiero ingresar a la página del IFARHU para ver archivos PDF

  Background:
    Given el link a la pagina del IFARHU
    When accedo al menu transparencia
    And abro el archivo pdf

  @VerificarConContenidoDelPDF
  Scenario: Verificar PDF con el contenido
    Then debo ver el contenido del pdf verificado por contenido

  @VerificarConLinkDelPDF
  Scenario: Verificar PDF con el link
    Then debo ver el contenido del pdf verificado por link