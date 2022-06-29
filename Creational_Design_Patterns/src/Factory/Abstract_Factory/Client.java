package Factory.Abstract_Factory;


public class Client {
	public static void main(String[] args) {
		String dbConfig = "maria";
		Database db = null;
		/*
			1. initial way
			2. violates SRP of main().
		 */
		if(dbConfig.equals("postgre"))
			db = new MySQLDatabase();
		else if(dbConfig.equals("maria"))
			db = new MariaDB();
		else
			db = new MongoDB();

		//using Factory DP, passing the choice of Database
		db = DatabaseFactory.getDBConnectionByConfig(dbConfig);
	}
}
