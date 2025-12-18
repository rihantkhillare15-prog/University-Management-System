import java.util.Scanner;

// Abstract Base Class
abstract class Person {
    protected int id;
    protected String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public abstract void displayDetails();
}

// Student Class
class Student extends Person {
    private String course;
    private int year;

    public Student(int id, String name, String course, int year) {
        super(id, name);
        this.course = course;
        this.year = year;
    }

    @Override
    public void displayDetails() {
        System.out.println("\n--- Student Details ---");
        System.out.println("ID     : " + id);
        System.out.println("Name   : " + name);
        System.out.println("Course : " + course);
        System.out.println("Year   : " + year);
    }
}

// Faculty Class
class Faculty extends Person {
    private String department;
    private double salary;

    public Faculty(int id, String name, String department, double salary) {
        super(id, name);
        this.department = department;
        this.salary = salary;
    }

    @Override
    public void displayDetails() {
        System.out.println("\n--- Faculty Details ---");
        System.out.println("ID         : " + id);
        System.out.println("Name       : " + name);
        System.out.println("Department : " + department);
        System.out.println("Salary     : " + salary);
    }
}

// Main Class
public class UniversityManagementSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Student student = null;
        Faculty faculty = null;

        int choice;

        do {
            System.out.println("\n===== UNIVERSITY MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Student");
            System.out.println("2. Add Faculty");
            System.out.println("3. Display Student");
            System.out.println("4. Display Faculty");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choice) {
                case 1:
                    System.out.print("Enter Student ID: ");
                    int sid = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Student Name: ");
                    String sname = sc.nextLine();
                    System.out.print("Enter Course: ");
                    String course = sc.nextLine();
                    System.out.print("Enter Year: ");
                    int year = sc.nextInt();

                    student = new Student(sid, sname, course, year);
                    System.out.println("Student added successfully!");
                    break;

                case 2:
                    System.out.print("Enter Faculty ID: ");
                    int fid = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Faculty Name: ");
                    String fname = sc.nextLine();
                    System.out.print("Enter Department: ");
                    String dept = sc.nextLine();
                    System.out.print("Enter Salary: ");
                    double salary = sc.nextDouble();

                    faculty = new Faculty(fid, fname, dept, salary);
                    System.out.println("Faculty added successfully!");
                    break;

                case 3:
                    if (student != null)
                        student.displayDetails();
                    else
                        System.out.println("No student record found!");
                    break;

                case 4:
                    if (faculty != null)
                        faculty.displayDetails();
                    else
                        System.out.println("No faculty record found!");
                    break;

                case 5:
                    System.out.println("Exiting system... Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 5);

        sc.close();
    }
}

=======================================OUTPUT=======================================



===== UNIVERSITY MANAGEMENT SYSTEM =====
1. Add Student
2. Add Faculty
3. Display Student
4. Display Faculty
5. Exit
Enter your choice: 1
Enter Student ID: 101
Enter Student Name: Aman Kumar
Enter Course: B.Tech CSE
Enter Year: 2
Student added successfully!

===== UNIVERSITY MANAGEMENT SYSTEM =====
Enter your choice: 3

--- Student Details ---
ID     : 101
Name   : Aman Kumar
Course : B.Tech CSE
Year   : 2
