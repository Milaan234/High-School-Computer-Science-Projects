import java.util.ArrayList;

// student class
public class Student {
  // instance variables
  private int id;
  private String name;
  ArrayList<Assignment> assignments;
  private int assignmentCount;

  // constructor
  public Student(int id, String name) {
    this.id = id;
    this.name = name;
    this.assignmentCount = 1;
    assignments = new ArrayList<Assignment>();
    assignments.add(new Assignment(assignmentCount, "First Assignment", 100, 100));
  }

  // displays student details
  public void getStudentDetails() {
    System.out.println("ID: " + id);
    System.out.println("Name: " + name);
    double total = 0;
    double score = 0;
    for (int i = 0; i < assignments.size(); i++) {
      total += assignments.get(i).getTotalPoints();
      score += assignments.get(i).getScore();
    }
    System.out.println("Grade: " + (score / total) * 100.0 + "%");
  }

  // creates an assignment
  public void createAssignment(String name, double points, double score) {
    assignmentCount++;
    assignments.add(new Assignment(assignmentCount, name, points, score));
  }

  // displays all asignment details
  public void getAssignments() {
    for (int i = 0; i < assignments.size(); i++) {
      assignments.get(i).getAssignmentDetails();
    }
  }

  // returns max points of all assignments
  public double getTotalPoints() {
    double total = 0;
    double score = 0;
    for (int i = 0; i < assignments.size(); i++) {
      total += assignments.get(i).getTotalPoints();
      score += assignments.get(i).getScore();
    }
    return total;
  }

  // returns total score of all assignments
  public double getTotalScore() {
    double total = 0;
    double score = 0;
    for (int i = 0; i < assignments.size(); i++) {
      total += assignments.get(i).getTotalPoints();
      score += assignments.get(i).getScore();
    }
    return score;
  }

  // change assignment grade
  public void changeGrade(int id, double score) {
    assignments.get(id).setScore(score);
  }

  
}
