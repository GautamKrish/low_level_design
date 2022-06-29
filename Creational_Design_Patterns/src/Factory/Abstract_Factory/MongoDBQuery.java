package Factory.Abstract_Factory;

public class MongoDBQuery implements Query{
	@Override
	public boolean makeConnectiontToDB() {
		return false;
	}

	@Override
	public boolean fireQuery() {
		return false;
	}
}
