package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

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
