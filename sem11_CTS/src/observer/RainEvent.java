package observer;

public class RainEvent extends Observable {

	private String info;
	private boolean eventStarted = false;
	
	public void activateEvent() {
		if(this.eventStarted == false) {
			this.eventStarted = true;
			this.notifyAllHandlers();
		}
	}
	
	public RainEvent(String info) {
		super();
		this.info = info;
	}

	public void publishEvent() {
		this.activateEvent();
	}
}