package com.Bonbonite.task;

import com.Bonbonite.user_interface.MiCuenta;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;

public class InserarCredenciales implements Task {

    private String strUsuario;
    private String strContrasena;


    public InserarCredenciales(String strUsuario, String strContrasena){
        this.strUsuario = strUsuario;
        this.strContrasena = strContrasena;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Enter.theValue(strUsuario).into(MiCuenta.USUARIO), Enter.theValue(strContrasena).into(MiCuenta.CONTRASENA));


    }

    public static InserarCredenciales con(String strUsuario,String strContrasena){
        return Tasks.instrumented(InserarCredenciales.class);
    }
}
