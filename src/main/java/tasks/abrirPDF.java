package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Switch;
import net.serenitybdd.screenplay.actors.OnStage;
import userinterface.paginaTransparencia;

public class abrirPDF implements Task {

    public static abrirPDF PDF() {
        return Tasks.instrumented(abrirPDF.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Click.on(paginaTransparencia.PDF_NAME),
                Switch.toNewWindow()
        );
    }
}
