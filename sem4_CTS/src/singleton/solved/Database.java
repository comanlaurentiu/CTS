package singleton.solved;

public class Database {

	private String connectionString ="www.mydb.ro";
	Database() {
		connect();
	}
	private void connect() {
		//connect to database
	}
	public static Database INSTANCE = null;
	
	public static Database getInstance() {
		if(INSTANCE == null)
		{
			INSTANCE = new Database();
		}
		return INSTANCE;
	}
}
