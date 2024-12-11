package Usuario_Dominio;

public class UserControl {
	private User _user;
	private DatabaseAgent _dbAgent;

	public boolean authenticate(String aUsername, String aPassword) {
		throw new UnsupportedOperationException();
	}

	public void register(User aUser) {
		throw new UnsupportedOperationException();
	}

	public void shareData(int aDataId, int aUserId, String aPermissionType) {
		throw new UnsupportedOperationException();
	}

	public void revokePermission(int aPermissionId) {
		throw new UnsupportedOperationException();
	}
}