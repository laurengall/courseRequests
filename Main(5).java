import java.util.Scanner; 
import java.util.ArrayList; 
class Main {
  public static void main(String[] args) {
   int math; 
    int english; 
   int science; 
    int social; 
    int elective1; 
    int elective2; 
    String [] mathOpts = {"Precalculus", "Calculus I", "Honors Calculus I", "AP Calculus AB", "AP Calculus BC", "Statistics","AP Statistics"}; 
    String [] engOpts = {"English 4", "Honors English 4", "AP English 4"}; 
    String [] sciOpts = {"Ecology", "Anatomy", "Physics", "Honors Physics", "AP Biology", "AP Chemistry", "AP Computer Science A", "AP Computer Science Principles", "AP Physics"}; 
    String [] socialOpts = {"Psychology", "Modern History" , "AP Psychology", "AP US Government"}; 
    String [] elecOpts = {"Accounting", "Business", "CAD I", "CAD II", "Cybersecurity", "Engineering", "Robotics", "Honors Biotechnology"}; 
    ArrayList<String> courses = new ArrayList<String>(); 
    Scanner input = new Scanner(System.in);
    // Math
    System.out.println("Welcome. To select a course, type the corresponding number. Please begin by selecting your desired math course:");
    iterate(mathOpts); 
    math = input.nextInt(); 
    int mathInt = math - 1; 
    courses.add(mathOpts[mathInt]); 
    System.out.println(); 
// English
     System.out.println("Select your desired English course:");
    iterate(engOpts); 
    english = input.nextInt(); 
    int engInt = english -1; 
    courses.add(engOpts[engInt]);
    System.out.println(); 
    //Science 
    System.out.println("Select your desired science course:");
    iterate(sciOpts); 
    science = input.nextInt(); 
    int sciInt = science -1;
    courses.add(sciOpts[sciInt]);
    System.out.println(); 
    //Social Studies
    System.out.println("Select your desired Social Studies course:");
    iterate(socialOpts); 
    social = input.nextInt(); 
    int socialInt = social -1; 
    courses.add(socialOpts[socialInt]); 
    System.out.println(); 
    //Elective 1
     System.out.println("Select your first desired elective course:");
    iterate(elecOpts); 
    elective1 = input.nextInt(); 
   int elec1 = elective1 -1; 
    courses.add(elecOpts[elec1]); 
    System.out.println(); 
      //Elective 2
       System.out.println("Select your second desired elective course:");
    iterate(elecOpts); 
    elective2 = input.nextInt(); 
   int elec2 = elective2 -1; 
    courses.add(elecOpts[elec2]); 
    System.out.println(); 
    System.out.println("Your course requests are: " + courses); 
  }
  //Iterates through course options
  public static void iterate(String [] array){
   int count = 0; 
  int x = 1; 
    for(String i: array){
      System.out.println(x +". " + array[count]); 
      count++;
      x++; 
    }
  }

  
}