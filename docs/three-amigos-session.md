# Sesión Three Amigos - Funcionalidad Calculadora

## Información de la Sesión
- **Fecha**: [Fecha de la sesión]
- **Duración**: 2 horas
- **Participantes**: 
  - Product Owner: Juan Pérez
  - Developer: María García
  - QA Engineer: Carlos López

## Funcionalidad Definida: Calculadora Básica

### Descripción General
Como usuario del sistema, quiero poder realizar operaciones matemáticas básicas (suma, resta, multiplicación, división) para obtener resultados precisos de mis cálculos.

### Roles y Responsabilidades

#### Product Owner (Juan Pérez)
- **Responsabilidades**:
  - Definir el valor de negocio
  - Priorizar funcionalidades
  - Aceptar criterios de aceptación
  - Validar que la solución cumple las expectativas del usuario

#### Developer (María García)
- **Responsabilidades**:
  - Analizar la viabilidad técnica
  - Estimar esfuerzo de desarrollo
  - Identificar dependencias técnicas
  - Proponer alternativas de implementación

#### QA Engineer (Carlos López)
- **Responsabilidades**:
  - Definir criterios de aceptación
  - Identificar casos de prueba
  - Considerar casos edge y negativos
  - Asegurar la testabilidad de la funcionalidad

## Criterios de Aceptación

### AC1: Suma de Números
**Como** usuario del sistema  
**Quiero** sumar dos números  
**Para** obtener el resultado de la suma  

**Criterios de Aceptación:**
- ✅ Debe sumar dos números positivos correctamente
- ✅ Debe sumar un número positivo y uno negativo
- ✅ Debe sumar dos números negativos
- ✅ Debe sumar cero con cualquier número

### AC2: Resta de Números
**Como** usuario del sistema  
**Quiero** restar dos números  
**Para** obtener el resultado de la resta  

**Criterios de Aceptación:**
- ✅ Debe restar dos números positivos correctamente
- ✅ Debe restar un número negativo (suma)
- ✅ Debe restar cero de cualquier número
- ✅ Debe obtener resultado negativo cuando corresponde

### AC3: Multiplicación de Números
**Como** usuario del sistema  
**Quiero** multiplicar dos números  
**Para** obtener el resultado de la multiplicación  

**Criterios de Aceptación:**
- ✅ Debe multiplicar dos números positivos
- ✅ Debe multiplicar por cero (resultado cero)
- ✅ Debe multiplicar números negativos

### AC4: División de Números
**Como** usuario del sistema  
**Quiero** dividir dos números  
**Para** obtener el resultado de la división  

**Criterios de Aceptación:**
- ✅ Debe dividir dos números positivos
- ✅ Debe dividir cero por cualquier número (resultado cero)
- ❌ Debe mostrar error al dividir por cero

## Ejemplos Discutidos

### Ejemplo 1: Suma Básica
```
Entrada: 5 + 3
Resultado esperado: 8
```

### Ejemplo 2: Resta con Números Negativos
```
Entrada: 5 - (-3)
Resultado esperado: 8
```

### Ejemplo 3: División por Cero
```
Entrada: 10 / 0
Resultado esperado: Error "No se puede dividir por cero"
```

### Ejemplo 4: Multiplicación por Cero
```
Entrada: 15 * 0
Resultado esperado: 0
```

## Decisiones Técnicas

### Decisiones del Developer (María García)
1. **Lenguaje**: Java 11 para compatibilidad y estabilidad
2. **Framework de Testing**: JUnit 5 para pruebas unitarias
3. **BDD Framework**: Cucumber para escenarios de comportamiento
4. **Reporting**: Allure para reportes navegables
5. **CI/CD**: GitHub Actions para automatización

### Decisiones del QA Engineer (Carlos López)
1. **Estrategia de Testing**: 
   - Pruebas unitarias atómicas e independientes
   - Pruebas de comportamiento con BDD
   - Pruebas de performance básicas
2. **Cobertura**: 100% de métodos públicos
3. **Reportes**: Múltiples formatos (HTML, JSON, XML)
4. **Integración**: Pipeline CI/CD automático

### Decisiones del Product Owner (Juan Pérez)
1. **Prioridad**: Funcionalidad básica primero, luego casos edge
2. **Criterio de Éxito**: Todas las operaciones básicas funcionando
3. **Definición de Terminado**: Tests pasando + documentación completa

## Preguntas y Aclaraciones

### Pregunta 1: ¿Qué hacer con decimales?
**Respuesta**: Por simplicidad, empezar con enteros. Los decimales serán una mejora futura.

### Pregunta 2: ¿Necesitamos historial de operaciones?
**Respuesta**: No para esta iteración. Es una funcionalidad adicional.

### Pregunta 3: ¿Qué tan precisa debe ser la división?
**Respuesta**: Usar double para manejar decimales en división.

## Acuerdos Finales

1. **Sprint Planning**: 2 sprints de 1 semana cada uno
2. **Definition of Done**:
   - ✅ Código implementado y revisado
   - ✅ Pruebas unitarias pasando
   - ✅ Pruebas BDD pasando
   - ✅ Pipeline CI/CD configurado
   - ✅ Documentación actualizada
   - ✅ Reportes generados

3. **Criterios de Aceptación**: Todos los criterios deben estar implementados y probados
4. **Métricas de Éxito**:
   - 100% de tests pasando
   - Cobertura de código > 90%
   - Pipeline ejecutándose en < 5 minutos

## Próximos Pasos

1. **Developer**: Implementar la clase Calculadora
2. **QA Engineer**: Crear escenarios BDD y step definitions
3. **Product Owner**: Revisar y validar la implementación
4. **Equipo**: Configurar pipeline CI/CD

---

**Firmas de Aceptación:**
- Product Owner: _________________
- Developer: _________________
- QA Engineer: _________________
