import org.aspectj.lang.reflect.Pointcut;

import tarea01.ColorHandler;
import tarea01.f1;
public aspect Prueba {

    pointcut printing() : call(* setBack*(..));

    after() : printing() {
<<<<<<< HEAD
        System.out.println("La pantalla a cambiado de color" + thisJoinPoint.getSignature());
=======
        System.out.println("La pantalla a cambiado de color: "+ColorHandler.getColorName());
>>>>>>> bf2cc9273294a7fcd52eb8dbbad302d684386fe3
    }

}
