package userinterface;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.ifarhu.gob.pa/")
public class paginaPrincipal extends PageObject {

    public static final Target BTN_MENU_TRANSPARENCIA = Target.the("Boton Transparencia")
            .located(By.xpath("//li[@id='menu-item-207']"));
    public static final Target BTN_MENU_ARTICULO = Target.the("Boton articulos")
            .located(By.xpath("//li[@id='menu-item-218']"));
    public static final Target BTN_MENU_ARTICULO_10 = Target.the("Boton articulo 10")
            .located(By.xpath("//a[@title='10.1. Proyectos Institucionales']"));
}
