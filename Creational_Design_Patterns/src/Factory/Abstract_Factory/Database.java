package Factory.Abstract_Factory;


public interface Database {
	// will be an interface/abstract class
	String getConnectionURL();
	boolean makeConnection(String url);
	int getConnectionLimit();
	//Factory Method
	Query getQuery();
}
