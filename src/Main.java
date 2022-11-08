import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Apartment apartment = new Apartment();
        apartment.setTitle("Lofty");
        apartment.setPrice(40000);
        apartment.setAddress("UG-2");

        Apartment apartment1 = new Apartment();
        apartment1.setTitle("Elitka");
        apartment1.setPrice(80000);
        apartment1.setAddress("AK-KEME 106");

        Student student = new Student();
        student.setFulname("Lena Kim");
        student.setPhoneNumber(12344);
        student.setAddress("UG-2");
        student.setBankAccount(44567);

        Student student1 = new Student();
        student1.setFulname("Alina Akunova");
        student1.setPhoneNumber(13344);
        student1.setAddress("UG-2");
        student1.setBankAccount(44568);

        Student student2 = new Student();
        student2.setFulname("Aziza Li");
        student2.setPhoneNumber(12444);
        student2.setAddress("UG-2");
        student2.setBankAccount(44569);

        Student student3 = new Student();
        student3.setFulname("Janna Kan");
        student3.setPhoneNumber(12544);
        student3.setAddress("UG-2");
        student3.setBankAccount(44561);

        Student student4 = new Student();
        student4.setFulname("Maksat Nur");
        student4.setPhoneNumber(12644);
        student4.setAddress("AK-KEME 106");
        student4.setBankAccount(44562);
        Student student0 = new Student();
        student0.setFulname("Rahim");
        student0.setPhoneNumber(12644156);
        student0.setAddress("AK-KEME 106");
        student0.setBankAccount(44562);

        Student student5 = new Student();
        student5.setFulname("Janar Akmatov");
        student5.setPhoneNumber(34456);
        student5.setAddress("AK-KEME 106");
        student5.setBankAccount(44563);

        Student student6 = new Student();
        student6.setFulname("Muras Nurmatov");
        student6.setPhoneNumber(84456);
        student6.setAddress("AK-KEME 106");
        student6.setBankAccount(44564);
        Scanner scanner=new Scanner(System.in);
        Apartment[] apartments = {apartment, apartment1};
        Student[] students = {student, student1, student2, student3, student4, student5, student6,student};
        apartment1.pay(scanner.nextLine(),apartments,students);
        student.changelInfo();

    }
    public static void getStudent(String name,Apartment[]apartments,Student[]students){
        String title=null;
        for (Apartment apartment : apartments) {
            if (apartment.getTitle().equals(name)){
                title= apartment.getAddress();
            }

        }
        for (Student student : students) {
            if (student.getAddress().equals(title)){
                student.getInfo();
            }
        }
    }


}






