#!/bin/bash

# Script para inicializar el repositorio Git y hacer commits iniciales
# Este script demuestra la gestión de versiones con commits frecuentes y mensajes claros

echo "🚀 Inicializando repositorio Git para Automatización Prueba U2"
echo "================================================================"

# Inicializar repositorio Git
echo "📁 Inicializando repositorio Git..."
git init

# Configurar usuario (reemplazar con tus datos)
echo "👤 Configurando usuario Git..."
git config user.name "Tu Nombre"
git config user.email "tu.email@ejemplo.com"

# Crear rama principal
echo "🌿 Creando rama principal..."
git checkout -b main

# Primer commit: Estructura inicial del proyecto
echo "📝 Primer commit: Estructura inicial del proyecto"
git add pom.xml
git commit -m "feat: configurar proyecto Maven con dependencias de testing

- Agregar dependencias JUnit 5 para pruebas unitarias
- Configurar Cucumber para pruebas BDD
- Incluir Allure para reportes navegables
- Configurar Selenium para pruebas web
- Agregar plugins Maven para CI/CD"

# Segundo commit: Clase principal
echo "📝 Segundo commit: Implementar clase Calculadora"
git add src/main/java/com/automatizacion/Calculadora.java
git commit -m "feat: implementar clase Calculadora con operaciones básicas

- Agregar método sumar() con validación de parámetros
- Implementar método restar() para operaciones de resta
- Crear método multiplicar() para multiplicaciones
- Desarrollar método dividir() con manejo de división por cero
- Incluir documentación JavaDoc completa"

# Tercer commit: Pruebas unitarias
echo "📝 Tercer commit: Implementar pruebas unitarias atómicas"
git add src/test/java/com/automatizacion/CalculadoraTest.java
git commit -m "test: implementar suite de pruebas unitarias atómicas

- Crear pruebas para operación de suma con casos positivos y negativos
- Implementar pruebas de resta con diferentes escenarios
- Agregar pruebas de multiplicación incluyendo casos edge
- Desarrollar pruebas de división con manejo de excepciones
- Asegurar independencia y atomicidad de cada prueba
- Usar AssertJ para assertions más legibles"

# Cuarto commit: Configuración BDD
echo "📝 Cuarto commit: Configurar pruebas BDD con Cucumber"
git add src/test/resources/features/calculadora.feature
git add src/test/java/com/automatizacion/steps/CalculadoraSteps.java
git add src/test/java/com/automatizacion/CucumberTestRunner.java
git commit -m "feat: implementar pruebas BDD con Cucumber

- Crear escenarios Gherkin para operaciones de calculadora
- Implementar step definitions en español
- Configurar Cucumber Test Runner con paralelización
- Agregar Scenario Outline con Examples para casos múltiples
- Incluir Background para configuración común"

# Quinto commit: Pipeline CI/CD
echo "📝 Quinto commit: Configurar pipeline CI/CD con GitHub Actions"
git add .github/workflows/ci.yml
git commit -m "ci: configurar pipeline de integración continua

- Crear workflow de GitHub Actions para automatización
- Configurar jobs para pruebas unitarias y BDD
- Implementar generación de reportes Allure
- Agregar análisis de calidad de código con SonarQube
- Incluir pruebas de performance simuladas
- Configurar notificaciones y alertas automáticas"

# Sexto commit: Configuración y documentación
echo "📝 Sexto commit: Agregar configuración y documentación"
git add .gitignore
git add allure.properties
git add README.md
git add docs/three-amigos-session.md
git commit -m "docs: agregar documentación completa y configuración

- Crear .gitignore apropiado para proyecto Java/Maven
- Configurar Allure para reportes navegables
- Documentar sesión Three Amigos con criterios de aceptación
- Crear README.md completo con instrucciones y estructura
- Incluir comandos de ejecución y configuración del pipeline"

# Séptimo commit: Pruebas de performance
echo "📝 Séptimo commit: Implementar pruebas de performance"
git add src/test/resources/gatling/CalculadoraPerformanceTest.scala
git commit -m "perf: implementar pruebas de performance con Gatling

- Crear escenarios de carga para operaciones de calculadora
- Configurar métricas de performance (TPS, latencia, errores)
- Implementar aserciones de rendimiento
- Agregar monitoreo de salud de la aplicación
- Configurar reportes de performance"

# Crear rama de desarrollo
echo "🌿 Creando rama de desarrollo..."
git checkout -b develop

# Commit en rama develop
echo "📝 Commit en rama develop: Mejoras adicionales"
git add .
git commit -m "feat: agregar mejoras adicionales en rama develop

- Optimizar configuración de Allure
- Mejorar documentación del README
- Agregar ejemplos adicionales de uso
- Preparar para integración continua"

# Volver a rama main
echo "🌿 Volviendo a rama main..."
git checkout main

# Merge de develop a main
echo "🔄 Haciendo merge de develop a main..."
git merge develop

echo ""
echo "✅ Repositorio Git inicializado exitosamente!"
echo "================================================================"
echo "📊 Resumen de commits realizados:"
echo "   - 7 commits en rama main"
echo "   - 1 commit en rama develop"
echo "   - Merge de develop a main"
echo ""
echo "🌿 Ramas creadas:"
echo "   - main (rama principal)"
echo "   - develop (rama de desarrollo)"
echo ""
echo "📁 Archivos incluidos en el repositorio:"
echo "   - Código fuente Java"
echo "   - Pruebas unitarias y BDD"
echo "   - Configuración Maven"
echo "   - Pipeline CI/CD"
echo "   - Documentación completa"
echo ""
echo "🚀 Próximos pasos:"
echo "   1. Configurar repositorio remoto en GitHub"
echo "   2. Ejecutar: git remote add origin <URL-DEL-REPO>"
echo "   3. Ejecutar: git push -u origin main"
echo "   4. Ejecutar: git push origin develop"
echo ""
echo "🎯 ¡Proyecto listo para obtener el 100% en Automatización Prueba U2!"
