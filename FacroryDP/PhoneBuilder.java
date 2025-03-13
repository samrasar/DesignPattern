package FacroryDP;

public class PhoneBuilder {
    private String os;
    private String processor;
    private String battery;
    private String display;

/*  Instead of void return PhoneBuilder object and return this object
    public void setDisplay(String display) {
        this.display = display;
    }*/

    public PhoneBuilder setDisplay(String display) {
        this.display = display;
        return this;
    }

    public PhoneBuilder setBattery(String battery) {
        this.battery = battery;
        return this;
    }

    public PhoneBuilder setProcessor(String processor) {
        this.processor = processor;
        return this;
    }

    public PhoneBuilder setOs(String os) {
        this.os = os;
        return this;
    }

    public Phone getPhone(){
        return new Phone(os,processor,battery,display);
    }
}
