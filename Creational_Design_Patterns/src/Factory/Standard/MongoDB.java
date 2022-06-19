package Factory.Standard;

public class MongoDB implements Database{
	@Override
	public String getConnectionURL() {
		return null;
	}

	@Override
	public boolean makeConnection(String url) {
		return false;
	}

	@Override
	public int getConnectionLimit() {
		return 0;
	}
}
