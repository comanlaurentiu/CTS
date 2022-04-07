package Factory;

public class ProgMain1 {

	public static void main(String[] args) {
		IWeapon weapon;  //hide this:new MagicWeapon();
		try {
			weapon = WeaponFactory.createWeapon(200);
			weapon.power();
		} catch(Exception e) {
			e.printStackTrace();
		}

	}

}
