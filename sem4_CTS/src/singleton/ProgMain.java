package singleton;

public class ProgMain {

	public static void main(String[] args) {

		Database db1 = Database.getInstance();
		Database db2 = Database.getInstance();

	}

}
