package lab6;

public class Professor {
	public String name;
	private Deanery deanery;
	
	public Professor(String name, Deanery deanery) {
		this.name = name;
		this.deanery = deanery;
	}
	
	public void fillReport(String departmentName) {
		deanery.notify(departmentName, name);
	}
}
