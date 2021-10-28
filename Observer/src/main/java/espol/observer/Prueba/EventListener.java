package espol.observer.Prueba;

import java.io.File;

public interface EventListener {
    void update(String eventType, File file);
}
