package co.com.demoblaze.www.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

import static co.com.demoblaze.www.utils.Constantes.*;


//CONFIGURCION DE CUCUMBER
@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = INICIARSESION,
        glue=GLUE_STEP_DEFINITIONS,
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        tags = "@CA02"
)
public class IniciarSesionPagina_Runner {
}
