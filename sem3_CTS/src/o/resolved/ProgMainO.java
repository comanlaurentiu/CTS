package o.resolved;

public class ProgMainO {
		public static void main(String[] args) {
			Employee empMada = new FTEEmployee(1, "Mada", 2000);
			System.out.print(empMada.toString() + "Bonus" + empMada.calculateBonus());
	}
}
