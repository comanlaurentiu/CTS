package s5.singleton_databaseThreadSafe;

//early intialization abstract
public class Database {


	private static Database INSTANCE = null;
	
	
	private Database() {
		
	}

	public static Database getInstance() {
		if(INSTANCE == null)
		{
			synchronized (Database.class) {
				if(INSTANCE == null) {
				INSTANCE = new Database();
				}
			}
			
		}
		return INSTANCE;
	}
}
