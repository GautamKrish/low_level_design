package Factory.Abstract_Factory;

public class MariaDBQuery implements Query{
	@Override
	public boolean makeConnectiontToDB() {
		return false;
	}

	@Override
	public boolean fireQuery() {
		return false;
	}
}
