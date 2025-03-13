package PrototypeDP;

import java.util.ArrayList;
import java.util.List;

public class BookShop implements Cloneable {
    private String shopName;
    List<Book> booksList = new ArrayList<>();

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public List<Book> getBooksList() {
        return booksList;
    }

    public void setBooksList(List<Book> booksList) {
        this.booksList = booksList;
    }

    //Loads the data from DB
    public void loadData() {
        for (int i = 1; i <= 10; i++) {
            Book b = new Book();
            b.setBid(i);
            b.setbName("DemoBookName " + i);
            booksList.add(b);
        }
    }

    @Override
    public String toString() {
        return "BookShop{" +
                "shopName='" + shopName + '\'' +
                ", al=" + booksList +
                '}';
    }

    /*@Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }*/
    //Updated method
    @Override
    protected BookShop clone() throws CloneNotSupportedException {
        BookShop shop = new BookShop();

        for (Book b : this.getBooksList()) {
            shop.getBooksList().add(b);
        }
        return shop;
    }
}
