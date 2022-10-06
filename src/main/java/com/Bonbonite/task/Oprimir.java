package com.Bonbonite.task;

import com.Bonbonite.user_interface.MiCuenta;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class Oprimir implements Task {



    @Override
    public <T extends Actor> void performAs(T actor) {

        Click.on(MiCuenta.ACEDER);

    }

    public static Oprimir acceder(){
        return Tasks.instrumented(Oprimir.class);
    }
}
