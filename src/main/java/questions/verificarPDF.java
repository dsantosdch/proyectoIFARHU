package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import userinterface.paginaTransparencia;
import utils.extraerPDF;

public class verificarPDF implements Question {

    public static verificarPDF resultado() {
        return new verificarPDF();
    }

    @Override
    public Object answeredBy(Actor actor) {
        extraerPDF extraerPDF = new extraerPDF(actor);
        return extraerPDF.contenidoPDF();

    }
}
