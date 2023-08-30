import java.util.*;
public class Main {
    static Scanner input = new Scanner(System.in);
    static ArrayList<Student> students = new ArrayList<Student>();
    static ArrayList<Subject> courses = new ArrayList<Subject>();

    public static void setInitial() {
        students.add(new Student(15107739, 19, "Alice", "AliceGamer1337@gmail.com"));
        students.add(new Student(221027704, 18, "Abdullah", "abdallaLxw277@gmail.com"));
        students.add(new Student(15107739, 18, "Omar", "Omarika232@gmail.com"));
        students.add(new Student(15107739, 18, "Hamada", "HamadaMedo223@gmail.com"));
        courses.add(new Subject("CS243", "OOP"));
        courses.add(new Subject("BA203", "DSA"));
        courses.get(0).addStudent(students.get(0), 96);
        courses.get(0).addStudent(students.get(1), 74);
        courses.get(0).addStudent(students.get(2), 98);
        courses.get(0).addStudent(students.get(3), 81);
        courses.get(1).addStudent(students.get(0), 69);
        courses.get(1).addStudent(students.get(2), 90);
    }

    public static void clearConsole() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void proceed() {
        System.out.println("\nPress the enter key to continue...");
        input.nextLine();
        clearConsole();
    }
    public static void displayCourses() {
        System.out.printf("%-10s | %-20s%n", "Code", "Name");
        System.out.println("**********************************");
        for (int i = 0; i < courses.size(); i++) {
            System.out.printf("%-10s | %-20s%n", courses.get(i).getCode(), courses.get(i).getName());
        }
    }
    public static void displayStudents() {
        System.out.printf("%-10s | %-20s | %-20s | %s\n", "Id", "Name", "Number of Courses", "Final Grade");
        System.out.println("-----------|----------------------|----------------------|------------");
        for (int i = 0; i < students.size(); i++) {
            System.out.printf("%-10d | %-20s | %-20d | %s\n", students.get(i).getId(), students.get(i).getName(), students.get(i).getCourseNames().length, students.get(i).getFinalGrade());
        }
    }
    public static void main(String[] args) {
        setInitial();
        clearConsole();
        int c;
        clearConsole();
        while(true){
            System.out.println("Enter the task that you wish to complete (0-6):");
            System.out.println("1. View the course list.");
            System.out.println("2. View the student list.");
            System.out.println("3. Exit the program.\n");
            System.out.print("Your input:\t");
            c = input.nextInt();
            switch (c){
                case 1:
                    clearConsole();
                    input.nextLine();
                    displayCourses();
                    proceed();
                    break;
                case 2:
                    clearConsole();
                    input.nextLine();
                    displayStudents();
                    proceed();
                    break;
                case 3:
                    System.out.println("\nTerminating the program...");
                    break;
                default:
                    System.out.println("Invalid Choice!");
                    input.nextLine();
                    proceed();
                    clearConsole();
                    break;
            }
        }
    }
}