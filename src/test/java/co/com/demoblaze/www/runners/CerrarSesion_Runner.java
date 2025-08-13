package co.com.demoblaze.www.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

import static co.com.demoblaze.www.utils.Constantes.*;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = GESTIONPRODUTOS,
        glue=GLUE_STEP_DEFINITIONS,
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        tags = "@CA09"
)
public class CerrarSesion_Runner {
}
