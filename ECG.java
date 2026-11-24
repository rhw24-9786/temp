public class ECG extends Service {
    public ECG(String location) {
        super("ECG", location);
    }

    @Override
    public int getDuration() {
        return 1;
    }
}