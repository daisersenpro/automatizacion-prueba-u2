package com.automatizacion;

import io.cucumber.junit.platform.engine.Cucumber;
import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

import static io.cucumber.junit.platform.engine.Constants.*;

/**
 * Test Runner para Cucumber BDD
 * Configura la ejecución de los escenarios de comportamiento
 */
@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("features")
@ConfigurationParameter(key = PLUGIN_PROPERTY_NAME, value = 
    "pretty," +
    "html:target/cucumber-reports/cucumber.html," +
    "json:target/cucumber-reports/cucumber.json," +
    "junit:target/cucumber-reports/cucumber.xml," +
    "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"
)
@ConfigurationParameter(key = GLUE_PROPERTY_NAME, value = "com.automatizacion.steps")
@ConfigurationParameter(key = FILTER_TAGS_PROPERTY_NAME, value = "not @ignore")
@ConfigurationParameter(key = PARALLEL_EXECUTION_ENABLED_PROPERTY_NAME, value = "true")
@ConfigurationParameter(key = PARALLEL_CONFIG_STRATEGY_PROPERTY_NAME, value = "fixed")
@ConfigurationParameter(key = PARALLEL_CONFIG_FIXED_PARALLELISM_PROPERTY_NAME, value = "2")
public class CucumberTestRunner {
    // Esta clase no necesita implementación
    // Solo configura la ejecución de Cucumber
}
