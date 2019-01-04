package yamlReader;

public class Knot {
	String name;
	String connection;
	String group;
	
	Knot(){
		this.name = "";
		this.connection = "";
		this.group = "";	
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getConnection() {
		return connection;
	}

	public void setConnection(String connection) {
		this.connection = connection;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	@Override
	public String toString() {
		return "Knot [name=" + name + ", connection=" + connection + ", group=" + group + "]";
	}
	
}
