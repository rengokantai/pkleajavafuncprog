import java.util.Random;

/**
 * Created by Hernan Y.Ke on 2015/11/19.
 */
public class FluentRandom extends Random {
    private int lower = 0;
    private int upper = Integer.MAX_VALUE;

    public FluentRandom useAsSeed(long seed){
        this.setSeed(seed);
        return  this;
    }

    public FluentRandom asLower(int lower){
        this.lower = lower;
        return this;
    }

    public FluentRandom asUpper(int upper){
        this.upper = upper;
        return this;
    }
    @Override
    public int nextInt(){
        return lower + this.nextInt(upper-lower);
    }
}
class TestFluentRandom{
    public static void main(String[] args) {
        FluentRandom fr = new FluentRandom();
        for (int i = 0; i < 5; i++) {
            System.out.println(fr.nextInt());
        }
    }
}
