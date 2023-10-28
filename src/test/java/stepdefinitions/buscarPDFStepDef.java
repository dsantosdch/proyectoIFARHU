package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;
import questions.verificarPDF;
import questions.verificarPDFConLink;
import tasks.abrirPDF;
import tasks.abrirPaginaPrincipal;
import tasks.buscarPDF;

public class buscarPDFStepDef {

    @Given("el link a la pagina del IFARHU")
    public void elLinkALaPaginaDelIFARHU() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Dionisio").wasAbleTo(abrirPaginaPrincipal.UrlApp());
    }

    @When("accedo al menu transparencia")
    public void accedoAlMenuTransparencia() {
        OnStage.theActorInTheSpotlight().attemptsTo(buscarPDF.PDF());
    }

    @When("abro el archivo pdf")
    public void abroElArchivoPdf() {
        OnStage.theActorInTheSpotlight().attemptsTo(abrirPDF.PDF());
    }

    @Then("debo ver el contenido del pdf verificado por contenido")
    public void deboVerElContenidoDelPdfVerificadoPorContenido() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(verificarPDF.resultado(),
                Matchers.containsString("AGOSTO 2022")));
    }

    @Then("debo ver el contenido del pdf verificado por link")
    public void deboVerElContenidoDelPdfVerificadoPorLink() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(verificarPDFConLink.resultado(),
                Matchers.equalTo("https://www.ifarhu.gob.pa/wp-content/uploads/2013/11/Avance-de-Proyectos-Agosto-2022.pdf")));
    }
}
