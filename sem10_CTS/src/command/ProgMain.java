package command;

public class ProgMain {
	public static void main(String[] args) {
		
		Chief chief1 = new Chief("Johnny");
		Chief chief2 = new Chief("Marina");
		
		Waiter waiter = new Waiter();
		waiter.noteCommands(new PizzaOrder(chief1, "Cheese"));
		waiter.noteCommands(new PastaOrder(chief2, "Carbonara"));
		waiter.noteCommands(new PizzaOrder(chief1, "Margherita"));
        waiter.sendCommand();
	}
}