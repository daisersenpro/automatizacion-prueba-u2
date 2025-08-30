# 📋 Instrucciones de Ejecución - Automatización Prueba U2

## 🎯 Objetivo
Este documento contiene las instrucciones paso a paso para ejecutar el proyecto y obtener las capturas de pantalla necesarias para el informe final.

## 📋 Checklist de Preparación

### Prerrequisitos
- [ ] Java 11 o superior instalado
- [ ] Maven 3.6+ instalado
- [ ] Git instalado
- [ ] IDE (IntelliJ IDEA, Eclipse, VS Code)
- [ ] Navegador web para ver reportes

### Verificación de Instalación
```bash
# Verificar Java
java -version

# Verificar Maven
mvn -version

# Verificar Git
git --version
```

## 🚀 Pasos de Ejecución

### Paso 1: Inicializar Repositorio Git

```bash
# 1. Abrir terminal en la carpeta del proyecto
cd "C:\Users\anyelo\Desktop\Automatizacion Prueba - U-2"

# 2. Ejecutar el script de inicialización
chmod +x setup-git.sh
./setup-git.sh

# 3. Verificar el estado del repositorio
git status
git log --oneline
```

**📸 Captura de Pantalla 1**: Estado del repositorio Git después de la inicialización

### Paso 2: Compilar el Proyecto

```bash
# 1. Compilar el proyecto
mvn clean compile

# 2. Verificar que la compilación fue exitosa
echo "Compilación completada"
```

**📸 Captura de Pantalla 2**: Resultado de la compilación Maven

### Paso 3: Ejecutar Pruebas Unitarias

```bash
# 1. Ejecutar pruebas unitarias
mvn test -Dtest=CalculadoraTest

# 2. Verificar resultados
echo "Pruebas unitarias completadas"
```

**📸 Captura de Pantalla 3**: Resultados de las pruebas unitarias

### Paso 4: Ejecutar Pruebas BDD

```bash
# 1. Ejecutar pruebas BDD
mvn test -Dtest=CucumberTestRunner

# 2. Verificar resultados
echo "Pruebas BDD completadas"
```

**📸 Captura de Pantalla 4**: Resultados de las pruebas BDD

### Paso 5: Generar Reportes Allure

```bash
# 1. Generar reporte Allure
mvn allure:report

# 2. Abrir reporte en navegador
mvn allure:serve
```

**📸 Captura de Pantalla 5**: Reporte Allure navegable

### Paso 6: Ejecutar Pipeline Completo

```bash
# 1. Ejecutar todas las pruebas y reportes
mvn clean verify

# 2. Verificar todos los reportes generados
ls -la target/
```

**📸 Captura de Pantalla 6**: Resultado del pipeline completo

### Paso 7: Verificar Estructura del Proyecto

```bash
# 1. Mostrar estructura completa
tree /f

# 2. Verificar archivos clave
ls -la src/
ls -la .github/workflows/
ls -la docs/
```

**📸 Captura de Pantalla 7**: Estructura completa del proyecto

## 📊 Reportes a Generar

### 1. Reportes de Pruebas Unitarias
- **Ubicación**: `target/surefire-reports/`
- **Formato**: HTML, XML, TXT
- **Contenido**: Resultados detallados de cada prueba

### 2. Reportes BDD
- **Ubicación**: `target/cucumber-reports/`
- **Formato**: HTML, JSON, XML
- **Contenido**: Escenarios ejecutados y resultados

### 3. Reportes Allure
- **Ubicación**: `target/allure-report/`
- **Características**: Navegable, interactivo
- **Contenido**: Métricas, gráficos, timeline

### 4. Reportes de Performance
- **Ubicación**: `target/performance-reports/`
- **Contenido**: Métricas de TPS, latencia, errores

## 🎯 Capturas de Pantalla Requeridas

### Para el Informe Final

1. **Git Repository Status**
   - Estado del repositorio
   - Historial de commits
   - Ramas creadas

2. **Maven Build Success**
   - Compilación exitosa
   - Dependencias descargadas
   - Plugins configurados

3. **Unit Tests Results**
   - Todas las pruebas pasando
   - Cobertura de código
   - Tiempo de ejecución

4. **BDD Tests Results**
   - Escenarios ejecutados
   - Step definitions funcionando
   - Reportes generados

5. **Allure Report**
   - Dashboard principal
   - Métricas de pruebas
   - Gráficos de resultados

6. **Pipeline CI/CD**
   - Workflow de GitHub Actions
   - Jobs ejecutándose
   - Artifacts generados

7. **Project Structure**
   - Organización de carpetas
   - Archivos de configuración
   - Documentación

8. **Three Amigos Session**
   - Documento de sesión
   - Criterios de aceptación
   - Roles definidos

## 🔧 Comandos de Verificación

### Verificar Cobertura de Código
```bash
# Agregar plugin JaCoCo al pom.xml si no está
mvn jacoco:report
```

### Verificar Calidad de Código
```bash
# Ejecutar análisis estático
mvn checkstyle:check
mvn spotbugs:check
```

### Verificar Dependencias
```bash
# Verificar vulnerabilidades
mvn dependency:check
```

## 📝 Documentación a Incluir

### En el Informe Word

1. **Introducción**
   - Descripción del proyecto
   - Objetivos alcanzados
   - Tecnologías utilizadas

2. **Implementación**
   - Estructura del proyecto
   - Configuración de herramientas
   - Código implementado

3. **Pruebas**
   - Pruebas unitarias
   - Pruebas BDD
   - Pruebas de performance

4. **Pipeline CI/CD**
   - Configuración de GitHub Actions
   - Jobs y workflows
   - Reportes generados

5. **Trabajo Colaborativo**
   - Sesión Three Amigos
   - Criterios de aceptación
   - Roles y responsabilidades

6. **Resultados**
   - Capturas de pantalla
   - Métricas obtenidas
   - Conclusiones

## 🚨 Solución de Problemas

### Error: Java no encontrado
```bash
# Verificar JAVA_HOME
echo $JAVA_HOME
# Configurar si es necesario
export JAVA_HOME=/path/to/java
```

### Error: Maven no encontrado
```bash
# Verificar MAVEN_HOME
echo $MAVEN_HOME
# Configurar si es necesario
export MAVEN_HOME=/path/to/maven
```

### Error: Dependencias no descargadas
```bash
# Limpiar y descargar dependencias
mvn clean dependency:resolve
```

### Error: Tests fallando
```bash
# Ejecutar tests con debug
mvn test -X
# Verificar logs detallados
```

## ✅ Checklist Final

- [ ] Repositorio Git inicializado con commits
- [ ] Proyecto compila sin errores
- [ ] Pruebas unitarias pasando al 100%
- [ ] Pruebas BDD ejecutándose correctamente
- [ ] Reportes Allure generados y navegables
- [ ] Pipeline CI/CD configurado
- [ ] Documentación Three Amigos completa
- [ ] Capturas de pantalla obtenidas
- [ ] Estructura del proyecto organizada
- [ ] README.md actualizado

## 🎯 Resultado Esperado

Al completar todos los pasos, tendrás:

1. **Proyecto Java completo** con pruebas automatizadas
2. **Pipeline CI/CD funcional** con GitHub Actions
3. **Reportes navegables** con Allure
4. **Documentación completa** de todo el proceso
5. **Capturas de pantalla** para el informe
6. **100% de cumplimiento** de los criterios de evaluación

---

**¡Listo para obtener el 100% en Automatización Prueba U2! 🎉**
