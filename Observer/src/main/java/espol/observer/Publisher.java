package espol.observer;

import java.util.ArrayList;

public class Publisher {

    private ArrayList<Subscriber> subscribers = new ArrayList<Subscriber>();

    private String mainState;

    public void subscriber(Subscriber s) {
        subscribers.add(s);
    }

    public void unsubscribe(Subscriber s) {
        // remueve al subscribtor de la lista
    }

    public void notifySubscribers() {
        // manda un mensaje a los susbscribtores
    }

    public void mainBusinessLogic() {
        // Describir el evento
        // Los eventos ocurren cuando el publisher cambia de estado o ejecuta comportamiento
    }

}
