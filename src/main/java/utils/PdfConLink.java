package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.webdriver.WebDriverFacade;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.io.InputStream;

public class PdfConLink {

    private Actor actor;
    public PdfConLink(Actor actor) {

        this.actor = actor;
    }

    public String linkPDF() {
        actor.can(BrowseTheWeb.with(WebDriverManager.chromedriver().getWebDriver()));
        String currenttabURL = BrowseTheWeb.as(actor).getDriver().getCurrentUrl();
        return currenttabURL;
    }


}
