public class Dialysis extends Service {
    public Dialysis (String location) {
        super("Dialysis", location);
    }

    @Override 
    public int getDuration() {
        return 4;
    }
    
}
