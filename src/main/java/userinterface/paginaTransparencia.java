package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class paginaTransparencia extends PageObject {
    public static final Target PDF_NAME =Target.the("PDF avance de proyectos agosto 2022")
            .located(By.xpath("//a[@href='https://www.ifarhu.gob.pa/wp-content/uploads/2013/11/Avance-de-Proyectos-Agosto-2022.pdf']"));
}
