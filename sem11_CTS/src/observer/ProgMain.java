package observer;

public class ProgMain {
public static void main(String[] args) {
		
		RainEvent rain = new RainEvent("rain");
		
		IHandler alex = new AlexHandler();
		IHandler tibi = new TBHandler();
		IHandler alexandra = new AleHandler();
		
		rain.subscribeHandler(alex);
		rain.subscribeHandler(tibi);
		rain.subscribeHandler(alexandra);
		
		rain.activateEvent();
	}

}
