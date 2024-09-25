package co.com.demoblaze.www.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

import static co.com.demoblaze.www.utils.Constantes.GLUE_STEP_DEFINITIONS;
import static co.com.demoblaze.www.utils.Constantes.REGISTRARSE;


//CONFIGURCION DE CUCUMBER
@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = REGISTRARSE,
        glue=GLUE_STEP_DEFINITIONS,
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        tags = "@CA01"
)
public class RegistrarUsuario_Runner {
}
