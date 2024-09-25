package co.com.demoblaze.www.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class InicioPage {

    public static final Target LBL_HOME = Target.the("Icono de usuario").
            located(By.xpath("(//a[@class='nav-link'])[1]"));
    public static final Target LBL_BIENVENIDA_NOMBREU = Target.the("Icono de usuario").
            located(By.id("nameofuser"));
    public static final Target BTN_REGISTRARSE = Target.the("Icono de usuario").
            located(By.id("signin2"));
    public static final Target BTN_INICIARSESION = Target.the("Icono de usuario").
            located(By.id("login2"));
    public static final Target TXT_NOMBRE_USUARIO_LOGIN = Target.the("Icono de usuario").
            located(By.id("loginusername"));
    public static final Target TXT_CLAVE_USUARIO_LOGIN = Target.the("Icono de usuario").
            located(By.id("loginpassword"));
    public static final Target BTN_INICIARSESION_LOGIN = Target.the("Icono de usuario").
            located(By.xpath("//button[@onclick='logIn()']"));
    public static final Target TXT_NOMBRE_USUARIO_REGISTRARSE = Target.the("Icono de usuario").
            located(By.id("sign-username"));
    public static final Target TXT_CLAVE_REGISTRARSE = Target.the("Icono de usuario").
            located(By.id("sign-password"));
    public static final Target BTN_REGISTRAR = Target.the("Icono de usuario").
            located(By.xpath("//button[@onclick='register()']"));
    public static final Target BTN_TELEFONOS_PHONE = Target.the("Icono de usuario").
            located(By.id("itemc"));
    public static final Target TELEFONOS_SAMSUNG_S6 = Target.the("Icono de usuario").
            located(By.xpath("//a[normalize-space()='Samsung galaxy s6']"));
    public static final Target TELEFONOS_NOKIA = Target.the("Icono de usuario").
            located(By.xpath("//a[normalize-space()='Nokia lumia 1520']"));






}
