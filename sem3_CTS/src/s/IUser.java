package s;

public class IUser {
	public boolean login(String username, String password);
	public boolean register(String email,String username, String password);
	public boolean sendEmail(String content);
	public void logError(String errorContent);
}
