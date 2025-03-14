package BuilderDP;

public class Shop {
    public static void main(String[] args) {
        //this way no need to set all values, Only set required values and others will get default values
        Phone p = new PhoneBuilder().setOs("Android").setProcessor("Snapdragon").getPhone();
        System.out.println(p);
    }

}
