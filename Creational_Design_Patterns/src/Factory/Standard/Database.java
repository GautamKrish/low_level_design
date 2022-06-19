package Factory.Standard;

public interface Database {
	String getConnectionURL();
	boolean makeConnection(String url);
	int getConnectionLimit();
}
