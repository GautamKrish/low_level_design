package Factory.Standard;

public class MySQLDBQuery implements Query{
	@Override
	public boolean makeConnectiontToDB() {
		return false;
	}

	@Override
	public boolean fireQuery() {
		return false;
	}
}
