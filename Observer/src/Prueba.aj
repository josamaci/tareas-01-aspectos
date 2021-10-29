import org.aspectj.lang.reflect.Pointcut;
import tarea01.ColorHandler;
import tarea01.f1;
public aspect Prueba {

    pointcut printing() : call(* setBack*(..));

    after() : printing() {
        System.out.println("La pantalla a cambiado de color: "+ColorHandler.getColorName());
    }

}
