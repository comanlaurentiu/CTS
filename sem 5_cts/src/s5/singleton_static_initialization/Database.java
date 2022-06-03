package s5.singleton_static_initialization;

//early intialization abstract
public class Database {

	private static Database INSTANCE = null;
	static {
		try {
			INSTANCE=new Database(-1);
		} catch (Exception e) {

			e.printStackTrace();
		}
	}
	
	private Database(int something) throws Exception{

		
		if(something<0) {
			throw new Exception();
		}
	}
	
	public static Database getInstance() {
		return INSTANCE;
	}
}