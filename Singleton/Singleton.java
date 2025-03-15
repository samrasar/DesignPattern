package Singleton;

public class Singleton {
    // static variable instance of type Singleton
    private static Singleton instance = null;

    // variable of type String
    public String s;

    // A private Constructor prevents any other class from instantiating.
    private Singleton() {
        s = "Hello I am a string";
        System.out.println("In constructor");
    }

    // static method to create instance of Singleton class
    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
            System.out.println("Instance Created");
        }
        return instance;
    }
}
