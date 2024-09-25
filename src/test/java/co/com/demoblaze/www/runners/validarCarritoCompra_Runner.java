package co.com.demoblaze.www.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

import static co.com.demoblaze.www.utils.Constantes.GLUE_STEP_DEFINITIONS;
import static co.com.demoblaze.www.utils.Constantes.VALIDARTELEFONOS;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = VALIDARTELEFONOS,
        glue=GLUE_STEP_DEFINITIONS,
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        tags = "@CA07"
)
public class validarCarritoCompra_Runner {
}
