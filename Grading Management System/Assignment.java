// assignment class
public class Assignment {
  // instance variables
  private int id;
  private String name;
  private double totalPoints;
  private double score;

  // class constructor
  public Assignment(int id, String name, double totalPoints, double score) {
    this.id = id;
    this.name = name;
    this.totalPoints = totalPoints;
    this.score = score;
  }
  
  // displays assignment details
  public void getAssignmentDetails() {
    System.out.println("ID: " + id);
    System.out.println("Name: " + name);
    System.out.println("Total Points: " + totalPoints);
    System.out.println("Score: " + score);
    System.out.println("Grade: " + (score / totalPoints) * 100.0 + "%");
  }

  // returns assignment score
  public double getScore() {
    return score;
  }

  // returns assignment max points
  public double getTotalPoints() {
    return totalPoints;
  }

  // changes score
  public void setScore(double score) {
    this.score = score;
  }
  
}
