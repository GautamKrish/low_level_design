package Factory.Standard;


public class Client {
	public static void main(String[] args) {
		String dbConfig = "maria";
		Database db = null;
		// initial way
		if(dbConfig.equals("postgre"))
			db = new MySQLDatabase();
		else if(dbConfig.equals("maria"))
			db = new MariaDB();
		else
			db = new MongoDB();
	}
}
