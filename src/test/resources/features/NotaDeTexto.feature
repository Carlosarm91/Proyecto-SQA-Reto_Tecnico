#language:es
#Autor: Carlos S.

Característica: Crear notas de texto

  @ESCENARIO_1
  Esquema del escenario: Crear una nota de texto enriquecido con letra en negrita
    Dado que estoy en la pagina de inicio de Blogo de Notas Online
    Cuando creo una nota de texto enriquecido
    |<titulo>|<textoNota>|
    Entonces valido la correcta creación "<titulo>"

    Ejemplos:
      |titulo|textoNota|
      |Reto| texto de prueba para el reto de automatizaciom        |