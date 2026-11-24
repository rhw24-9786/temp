public class Ultrasound extends Service {
    public Ultrasound(String location) {
        super("Ultrasound", location);
    }

    @Override
    public int getDuration() {
        return 3;
    }
}