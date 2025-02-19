package Ex3;

import java.util.Scanner;

public class Person {

    protected String id;
    protected String homeTown;
    protected String dateOfBirth; // Sử dụng String thay vì Date để đơn giản

    public Person(String id, String homeTown, String dateOfBirth) {
        this.id = id;
        this.homeTown = homeTown;
        this.dateOfBirth = dateOfBirth;
    }

    public Person() {
    }

    // Hiển thị thông tin
    public void displayInfo() {
        System.out.println("ID: " + id);
        System.out.println("Home Town: " + homeTown);
        System.out.println("Date of Birth: " + dateOfBirth);
    }

    // Nhập thông tin
    public void addPerson() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ID: ");
        id = sc.nextLine();
        System.out.print("Enter Home Town: ");
        homeTown = sc.nextLine();
        System.out.print("Enter Date of Birth (dd/MM/yyyy): ");
        dateOfBirth = sc.nextLine();
    }

    // Sửa thông tin
    public boolean editPerson() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Edit Home Town: ");
        homeTown = sc.nextLine();
        System.out.print("Edit Date of Birth (dd/MM/yyyy): ");
        dateOfBirth = sc.nextLine();
        return true;
    }
}
