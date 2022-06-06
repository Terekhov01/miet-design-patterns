
public class Tabulator extends Interpreter{

    public String interpret(String context){
        while (context.contains("\t\t")){
            context = context.replace("\t\t", "\t");
        }
        return context;
    }
}
