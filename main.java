package com.student.jdbc;



import java.util.Scanner;

public class main {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     studentDAO dao = new studentDAO();
     new studentForm();

     while (true) {
         System.out.println("\n--- Student Management System ---");
         System.out.println("1. Add Student");
         System.out.println("2. View Students");
         System.out.println("3. Update Student");
         System.out.println("4. Delete Student");
         System.out.println("5. Exit");
         System.out.print("Choose an option: ");
         int choice = sc.nextInt();

         switch (choice) {
             case 1 -> {
                 student s = new student();
                 System.out.print("Enter name: ");
                 s.name = sc.next();
                 System.out.print("Enter age: ");
                 s.age = sc.nextInt();
                 System.out.print("Enter course: ");
                 s.course = sc.next();
                 System.out.print("Enter email: ");
                 s.email = sc.next();
                 dao.addStudent(s);
             }
             case 2 -> dao.viewStudents();
             case 3 -> {
                 student s = new student();
                 System.out.print("Enter ID to update: ");
                 s.id = sc.nextInt();
                 System.out.print("Enter new name: ");
                 s.name = sc.next();
                 System.out.print("Enter new age: ");
                 s.age = sc.nextInt();
                 System.out.print("Enter new course: ");
                 s.course = sc.next();
                 System.out.print("Enter new email: ");
                 s.email = sc.next();
                 dao.updateStudent(s);
             }
             case 4 -> {
                 System.out.print("Enter ID to delete: ");
                 int id = sc.nextInt();
                 dao.deleteStudent(id);
             }
             case 5 -> {
                 System.out.println("Exiting...");
                 System.exit(0);
             }
             default -> System.out.println("Invalid choice!");
         }
     }
 }
}
