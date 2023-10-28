package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import userinterface.paginaPrincipal;

public class abrirPaginaPrincipal implements Task {

    private paginaPrincipal paginaPrincipal;

    public static abrirPaginaPrincipal UrlApp() {
        return Tasks.instrumented(abrirPaginaPrincipal.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(paginaPrincipal));
    }
}
