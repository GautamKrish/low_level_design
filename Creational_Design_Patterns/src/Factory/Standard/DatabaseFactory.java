package Factory.Standard;

public class DatabaseFactory {
	// Factories are solid implementation classes.
	public static Database getDBConnectionByConfig(String dbConfig){
		if(dbConfig.equals("maria"))
			return new MariaDB();
		else if(dbConfig.equals("mongo"))
			return new MongoDB();
		else
			return new MySQLDatabase();
	}
}
