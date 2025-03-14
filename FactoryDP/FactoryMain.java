package FactoryDP;

public class FactoryMain {
    public static void main(String[] args) {
        OSFactory osf = new OSFactory();
        OS obj = osf.getInstance("2");
        obj.specs();
    }
}
