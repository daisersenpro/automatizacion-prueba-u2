# language: es
@calculadora
Feature: Calculadora Básica
  Como usuario del sistema
  Quiero poder realizar operaciones matemáticas básicas
  Para obtener resultados precisos de mis cálculos

  Background:
    Given que tengo una calculadora disponible

  @suma
  Scenario: Sumar dos números positivos
    When sumo <numero1> y <numero2>
    Then el resultado debe ser <resultado>

    Examples:
      | numero1 | numero2 | resultado |
      | 5       | 3       | 8         |
      | 10      | 20      | 30        |
      | 0       | 15      | 15        |

  @resta
  Scenario: Restar dos números
    When resto <numero1> menos <numero2>
    Then el resultado debe ser <resultado>

    Examples:
      | numero1 | numero2 | resultado |
      | 10      | 3       | 7         |
      | 5       | 8       | -3        |
      | 15      | 0       | 15        |

  @multiplicacion
  Scenario: Multiplicar dos números
    When multiplico <numero1> por <numero2>
    Then el resultado debe ser <resultado>

    Examples:
      | numero1 | numero2 | resultado |
      | 6       | 7       | 42        |
      | 0       | 15      | 0         |
      | 3       | 4       | 12        |

  @division
  Scenario: Dividir dos números positivos
    When divido <numero1> entre <numero2>
    Then el resultado debe ser <resultado>

    Examples:
      | numero1 | numero2 | resultado |
      | 10      | 2       | 5.0       |
      | 15      | 3       | 5.0       |
      | 0       | 5       | 0.0       |

  @division_por_cero
  Scenario: Intentar dividir por cero
    When divido <numero1> entre <numero2>
    Then debe mostrar un error de división por cero

    Examples:
      | numero1 | numero2 |
      | 10      | 0       |
      | 5       | 0       |
      | 100     | 0       |
