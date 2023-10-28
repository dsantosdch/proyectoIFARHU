package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import utils.PdfConLink;

public class verificarPDFConLink implements Question {

    public static verificarPDFConLink resultado() {
        return new verificarPDFConLink();
    }

    @Override
    public Object answeredBy(Actor actor) {
        PdfConLink pdfConLink = new PdfConLink(actor);
        return pdfConLink.linkPDF();
    }
}
