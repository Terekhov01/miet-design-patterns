
public class MultipleNewlineCharacters extends Interpreter{

    public String interpret(String context){
        while (context.contains("\n\n")){
            context = context.replace("\n\n", "\n");
        }
        return context;
    }
}