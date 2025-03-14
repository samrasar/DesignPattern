package FactoryDP;

public class OSFactory {
    public OS getInstance(String str) {
        if (str.equals("1")) {
            return new Android();
        } else if (str.equals("2")) {
            return new Iphone();
        } else return new Windows();
    }
}
