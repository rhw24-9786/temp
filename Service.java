public abstract class Service {
    private String name;
    private String location;
    private boolean active;
    private int hoursLeft;

    public Service(String name, String location) {
        this.name = name;
        this.location = location;
        this.active = false;
        this.hoursLeft = 0;
    }

    public abstract int getDuration();

    public void start() {
        active = true;
        hoursLeft = getDuration();
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public boolean isActive() {
        return active;
    }

    public int getHoursLeft() {
        return hoursLeft;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
