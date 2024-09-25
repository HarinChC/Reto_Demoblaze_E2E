package co.com.demoblaze.www.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class InicioPage {

    public static final Target LBL_HOME = Target.the("Lbl de inici para validar inici").
            located(By.xpath("(//a[@class='nav-link'])[1]"));
    public static final Target LBL_BIENVENIDA_NOMBREU = Target.the("Lbl de bienvenidad").
            located(By.id("nameofuser"));
    public static final Target BTN_REGISTRARSE = Target.the("Boton de registrarse").
            located(By.id("signin2"));
    public static final Target BTN_INICIARSESION = Target.the("Boton de iniciar sesion").
            located(By.id("login2"));
    public static final Target TXT_NOMBRE_USUARIO_LOGIN = Target.the("Nombre usuario inicio sesion").
            located(By.id("loginusername"));
    public static final Target TXT_CLAVE_USUARIO_LOGIN = Target.the("Clave de usuario de inicio sesion").
            located(By.id("loginpassword"));
    public static final Target BTN_INICIARSESION_LOGIN = Target.the("Boton de inicio sesion").
            located(By.xpath("//button[@onclick='logIn()']"));
    public static final Target TXT_NOMBRE_USUARIO_REGISTRARSE = Target.the("Nombre de usuario de registrarse").
            located(By.id("sign-username"));
    public static final Target TXT_CLAVE_REGISTRARSE = Target.the("Clave de usuario de registrarse").
            located(By.id("sign-password"));
    public static final Target BTN_REGISTRAR = Target.the("Boton de registrarse").
            located(By.xpath("//button[@onclick='register()']"));
    public static final Target BTN_TELEFONOS_PHONE = Target.the("Boton de telefono phone").
            located(By.id("itemc"));
    public static final Target TELEFONOS_SAMSUNG_S6 = Target.the("Telefono samsung").
            located(By.xpath("//a[normalize-space()='Samsung galaxy s6']"));
    public static final Target TELEFONOS_NOKIA = Target.the("Telefono nokia").
            located(By.xpath("//a[normalize-space()='Nokia lumia 1520']"));






}
