package FactoryMeth;

public class Factory implements IFactory {
	@Override
	public IWeapon getWeapon(int price) {
//		return null;
		if(price>200) {
			return new MagicWeapon();
		} else {
			return new CheapWeapon();
		}
	}

}
