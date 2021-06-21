package Calculator;

public class Addition {
    public static int add(int... x){
        int addition = 0;
        for ( int y:x ) {
            addition += y;
        }
        return addition;
    }
}
