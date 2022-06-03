package s.resolved;

public interface IUser {
		public boolean login(String username, String password);
		public boolean register(String email,String username, String password);
}
