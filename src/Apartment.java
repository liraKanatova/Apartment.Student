import java.util.Objects;
import java.util.Scanner;

public class Apartment {
    private String title;
    private int price;
    private String address;


    void setTitle(String title) {
        this.title = title;
    }

    void setPrice(int price) {
        this.price = price;
    }

    void setAddress(String address) {
        this.address = address;
    }

    String getTitle() {
        return title;
    }

    int getPrice() {
        return price;
    }

    String getAddress() {
        return address;
    }

    public void getInfo() {
        System.out.println("Title: " + title);
        System.out.println("Price: " + title);
        System.out.println("Adress: " + title);


    }

    public int payPerMonth(Student[] studentys) {
        int counter = 0;
        for (Student student : studentys) {
            if ((student.getAddress().equals(address))) {
                counter++;
            }
        }
        return price / counter;
    }

    public void pay(String title, Apartment[] apartments, Student[] students) {
        String address = null;
        int price = 0;
        int counter = 0;
        for (Apartment apartment : apartments) {
            if (apartment.getTitle().equals(title)) {
                address = apartment.getAddress();
                price = apartment.getPrice();
            }
        }
        for (Student student : students) {
            if (student.getAddress().equals(address)) {
                counter++;
            }
        }
        System.out.println("byl kvartiranyn baasy "+price);
        System.out.println("bul kvartirada uhsunca student jashait"+counter);
        System.out.println("ar bir student ainy toloit"+price / counter);

    }
}


