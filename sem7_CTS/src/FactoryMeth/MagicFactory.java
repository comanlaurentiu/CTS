package FactoryMeth;

public class MagicFactory implements IFactory {
	@Override
	public IWeapon getWeapon(int price) {
		return new MagicWeapon();
	}

}