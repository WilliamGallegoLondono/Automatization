package com.Bonbonite.task;

import com.Bonbonite.user_interface.Login;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class OprimirBoton implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        Click.on(Login.BOTONLOGIN);



    }

    public static OprimirBoton login(){
        return Tasks.instrumented(OprimirBoton.class);
    }
}
