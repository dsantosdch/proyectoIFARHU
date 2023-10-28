package runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@CucumberOptions
        (
        features = "src/test/resources/features/GetPDF.feature",
        //tags = "@VerificarConContenidoDelPDF",
        glue = {"stepdefinitions", "utils"},
        plugin = "pretty",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)

@RunWith(CucumberWithSerenity.class)

public class buscarPDFRunner {
}
