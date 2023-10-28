package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.actors.OnStage;
import userinterface.paginaPrincipal;

public class buscarPDF implements Task {
    public static buscarPDF PDF() {
        return Tasks.instrumented(buscarPDF.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Click.on(paginaPrincipal.BTN_MENU_TRANSPARENCIA).afterWaitingUntilEnabled(),
                MoveMouse.to(paginaPrincipal.BTN_MENU_ARTICULO),
                Click.on(paginaPrincipal.BTN_MENU_ARTICULO_10)
        );
    }
}
