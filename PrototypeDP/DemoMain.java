package PrototypeDP;

public class DemoMain {
    public static void main(String[] args) throws CloneNotSupportedException {
        BookShop bs = new BookShop();
        bs.setShopName("XYZ BOOKS");
        bs.loadData();
        bs.getBooksList().remove(2);
        System.out.println(bs);

       /* Here we are hitting the db 2 times, instead of that can we get the data from BS
        BookShop bs1= new BookShop();
        bs1.setShopName("ABC BOOKS");
        bs1.loadData();
        System.out.println(bs1);*/

        //Shallow Cloning if we remove one book from 1st object it removes from both
        // One object with 2 refs are created here
        //Need to do deep cloning, it will create 2 objects.
        // To achieve this we need to change the overridden clone method

        BookShop bs1 = (BookShop) bs.clone();
        bs1.setShopName("ABC BOOKS");
        //Even without loading the data we are getting that
        System.out.println(bs1);
    }
}
