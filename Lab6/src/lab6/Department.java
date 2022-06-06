package lab6;

public class Department implements IObserver {
	public String name;
	
	public Department(String name) {
		this.name = name;
	}

	@Override
	public void update(String group, String professor) {
		System.out.println(name + " department got report by group " + group + " from professor " + professor);
	}
	
	@Override
	public String toString() {
		return name + " department";
	}
}
