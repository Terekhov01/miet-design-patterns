
public class Hyphen extends Interpreter{

    public String interpret(String context){
        while (context.contains(" ‐ ")){
            context = context.replace(" ‐ ", " — ");
        }
        return context;
    }
}