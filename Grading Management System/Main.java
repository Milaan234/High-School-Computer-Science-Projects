/*
Grading Management System
Created by Milaan Shah
*/

// import appropriate classes
import java.util.ArrayList;
import java.util.Scanner;


// main class
public class Main {
  // main method
  public static void main(String[] args) {

    // Scanner object to receive user input
    Scanner input = new Scanner(System.in);

    // create an array of students and create five students
    int count = 1;
    ArrayList<Student> students = new ArrayList<Student>();
    for (int i = 0; i < 5; i++) {
      students.add(new Student(count, "Name" + count));
      count++;
    }

    // while loop that keeps running until program ends
    int choice = -1;

    while (true) {
      // display menu get user choice
      displayMenu();
      choice = input.nextInt();
      System.out.println();

      // if statements that execute appropriate lines based on menu
      // Option 1: print one student's details
      if (choice == 1) {
        System.out.println("Enter student ID: ");
        int id = input.nextInt();
        students.get(id - 1).getStudentDetails();
      }
      // Option 2: print all students' details
      else if (choice == 2) {
        for (int i = 0; i < students.size(); i++) {
          students.get(i).getStudentDetails();
          System.out.println();
        }
      }
      // Option 3: create new assignment for all students
      else if (choice == 3) {
        System.out.print("Enter assignment name: ");
        String assignmentName = input.nextLine();
        assignmentName = input.nextLine();
        System.out.println("Enter total assignment points: ");
        double assignmentPoints = input.nextDouble();
        System.out.println("Enter assignment starting points for all students: ");
        double assignmentScore = input.nextDouble();
        
        for (int i = 0; i < students.size(); i++) {
          students.get(i).createAssignment(assignmentName, assignmentPoints, assignmentScore);
          System.out.println();
        }
        System.out.println("Assignment created!");
      }
      // Option 4: change one student's one assignment score
      else if (choice == 4) {
        System.out.println("Enter student ID: ");
        int studentID = input.nextInt();
        System.out.println("Enter assignment ID: ");
        int assignmentID = input.nextInt();
        System.out.println("Enter new score: ");
        double newScore = input.nextDouble();
        students.get(studentID - 1).changeGrade(assignmentID - 1, newScore);
      }
      // Option 5: print one students' all assignments
      else if (choice == 5) {
        System.out.println("Enter student ID: ");
        int id = input.nextInt();

        students.get(id - 1).getAssignments();
      }
      // Option 6: print average class grade
      else if (choice == 6) {
        double total = 0;
        double score = 0;
        for (int i = 0; i < students.size(); i++) {
          total += students.get(i).getTotalPoints();
          score += students.get(i).getTotalScore();
        }
        System.out.println("Average score: " + (score / total * 100.0) + "%");
      }
      // print choice is incorrect
      else {
        System.out.println("Invalid input. Please try again!");
      }
      System.out.println("\n");
    }
    
  }

  // method that displays menu
  public static void displayMenu() {
    System.out.println("1. See one student's details");
    System.out.println("2. See all students' details");
    System.out.println("3. Create assignment for all students");
    System.out.println("4. Change a student's assignment grade");
    System.out.println("5. See one student's assignments");
    System.out.println("6. See average class grade");
    System.out.print("Enter choice: ");
  }

}
