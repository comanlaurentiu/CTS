package singleton;

public class Database {
private String connectionString ="www.mydb.ro";
	
	public Database() {
		connect();
	}
	
	private void connect() {
		//connect to database
	}

	public static Database getInstance() {
		// TODO Auto-generated method stub
		return null;
	}

}
