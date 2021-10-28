import org.aspectj.lang.reflect.Pointcut;
import espol.observer.PrimaryController;

public aspect Prueba {

    pointcut printing() : call(* PrimaryController.cambiar*(..));

    after() returning : printing() {

        System.out.println("La pantalla a cambiado de color");

    }

}
