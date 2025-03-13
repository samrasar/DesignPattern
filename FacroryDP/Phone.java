package FacroryDP;

public class Phone {
    private String os;
    private String processor;
    private String battery;
    private String display;

    public Phone(String os, String processor, String battery, String display) {
        this.os = os;
        this.processor = processor;
        this.battery = battery;
        this.display = display;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "os='" + os + '\'' +
                ", processor='" + processor + '\'' +
                ", battery='" + battery + '\'' +
                ", display='" + display + '\'' +
                '}';
    }
}
