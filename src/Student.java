import java.util.Scanner;

public class Student {
    private String fulname;
    private long phoneNumber;
    private String address;
    private long bankAccount;

    void setFulname(String fulname) {
        this.fulname = fulname;
    }

    void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    void setAddress(String address) {
        this.address = address;
    }

    void setBankAccount(long bankAccount) {
        this.bankAccount = bankAccount;
    }

    String getFulname() {
        return fulname;
    }

    long getPhoneNumber() {
        return phoneNumber;
    }

    String getAddress() {
        return address;
    }

    long getBankAccount() {
        return bankAccount;
    }

    public void getInfo() {
        System.out.println("Fulname: " + fulname);
        System.out.println("PhoneNumber: " + phoneNumber);
        System.out.println("Address: " + address);
        System.out.println("BankAccount: " + bankAccount);
    }

    public void livIn(Student[] studentys, Apartment[] apartments) {
        int counter1 = 0;
        for (Apartment apartment : apartments) {
            if (apartment.getAddress().equals(address)) {
                counter1 = (int) (bankAccount / apartment.payPerMonth(studentys));
            }
            System.out.println("Live in\n" + counter1);
        }
    }
    public void changelInfo(){
        System.out.println("fullName  : ");
        fulname=new Scanner(System.in).nextLine();
        System.out.println("phoneNumber : ");
        phoneNumber=new Scanner(System.in).nextInt();
        System.out.println("Address : ");
        address=new Scanner(System.in).nextLine();
        System.out.println("bankAccount : ");
        bankAccount=new Scanner(System.in).nextInt();


    }
}
