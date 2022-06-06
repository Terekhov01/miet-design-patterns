
public class ComplexInterpreter extends Interpreter {
	    public Interpreter space;
	    public Interpreter enter;
	    public Interpreter tabs;
	    public Interpreter hypen;
	    public Interpreter marks;
	    public Interpreter extraSpace;
	    

	    public ComplexInterpreter(){
	        this.space = new MultipleSpaces();
	        this.enter = new MultipleNewlineCharacters();
	        this.tabs = new Tabulator();
	        this.hypen = new Hyphen();
	        this.marks = new QuotationMarks();
	        this.extraSpace = new ExtraSpace();
	    }

	    public String interpret(String context){
	        context = space.interpret(context);
	        context = enter.interpret(context);
	        context = tabs.interpret(context);
	        context = hypen.interpret(context);
	        context = marks.interpret(context);
	        context = extraSpace.interpret(context);
	        return context;
	    }
}
