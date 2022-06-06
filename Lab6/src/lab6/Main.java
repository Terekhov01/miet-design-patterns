package lab6;

public class Main {

	 public static void main(String[] args) {
    	Deanery deanery = new Deanery();
    	Department design = new Department("Design");
    	Department programming = new Department("Programming");
    	Professor professor = new Professor("Профессор 0", deanery);
    	Professor professor1 = new Professor("Профессор 1", deanery);
    	
    	deanery.subscribe("PIN-32", programming);
    	deanery.subscribe("PIN-32", design);
    	
    	professor.fillReport("PIN-32");
    	professor1.fillReport("PIN-32");

		for(String key: deanery.subscribers.keySet())
		{
			System.out.println(key);
			System.out.println(deanery.subscribers.get(key));
		}
    	
    	deanery.unsubscribe("PIN-32", programming);

		 for(String key: deanery.subscribers.keySet())
		 {
			 System.out.println(key);
			 System.out.println(deanery.subscribers.get(key));
		 }
    	
    	professor.fillReport("PIN-32");
    	
    	deanery.unsubscribe("PIN-32", design);

		 for(String key: deanery.subscribers.keySet())
		 {
			 System.out.println(key);
			 System.out.println(deanery.subscribers.get(key));
		 }
    }
}