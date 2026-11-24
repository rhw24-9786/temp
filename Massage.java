public class Massage extends Service {
    public Massage(String location) {
        super("Massage", location);
    }

    @Override
    public int getDuration() {
        return 2;
    }
}
