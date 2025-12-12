package com.skillnext2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentDAO dao = new StudentDAO();

        while (true) {

            System.out.println("\n=== STUDENT MENU ===");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");

            int ch = sc.nextInt();
            sc.nextLine();  // consume newline

            if (ch == 1) {

                System.out.print("Roll No: ");
                int r = sc.nextInt();
                sc.nextLine();

                System.out.print("Name: ");
                String name = sc.nextLine();

                System.out.print("Email: ");
                String email = sc.nextLine();

                System.out.print("Branch: ");
                String branch = sc.nextLine();

                dao.addStudent(new Student(r, name, email, branch));
            }

            else if (ch == 2) {
                dao.viewStudents();
            }

            else if (ch == 3) {
                System.out.println("Bye!");
                break;
            }

            else {
                System.out.println("Invalid Choice!");
            }
        }

        sc.close();
    }
}
