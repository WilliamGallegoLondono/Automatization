package com.Bonbonite.user_interface;

import net.serenitybdd.screenplay.targets.Target;

public class MiCuenta {

    public static final Target USUARIO = Target.the("Usuario").locatedBy("//*[@id=\"username\"]");

    public static final Target CONTRASENA = Target.the("Contrasena").locatedBy("//*[@id=\"password\"]");

    public static final Target ACEDER = Target.the("Aceder").locatedBy("//*[@id=\"customer_login\"]/div[1]/form/p[3]/button");

}
