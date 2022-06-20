package Factory.Standard;

public class MariaDB implements Database{
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

	@Override
	public Query getQuery() {
		return new MariaDBQuery();
	}
}
