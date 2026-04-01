package students;
// Base Class : person
class person {
    String name;
    int ID;
    int Age;
   //Constructor tp initialize person details 
person(String n, int id, int age){ 
    this.name = n;
    this.ID = id;
    this.Age = age;
}
   //Method to display person details
void DisplayInfo(){
    System.out.println("\nName :" +name);
    System.out.println("ID :" +ID);
    System.out.println("Age :" +Age);
}
}

// Derived Class: Student inherits from person 
class Student extends person {
    int marks;
    String grade;
    // Constructor to initialize student details     
Student(String n, int id, int age, int marks){
    super(n, id, age); //Call base class constructor
    System.out.println("Enter Marks :");
    this.marks = marks;
    
    // Assign grades based on marks 
    if(marks >= 85 )
     grade = "A";
    else if(marks >= 70)
     grade = "B";
    else if(marks >= 50)
     grade = "C";
    else
     grade = "F";  
}
   //Method to display student-specific details 
void displayInfo(){
    super.DisplayInfo();
    System.out.println("Marks :" +marks);
    System.out.println("Grade :" +grade);
}
}

// Main class
public class Students {

    public static void main(String[] args) {
        
        //Creating a student object with predefined details 
        Student s1 = new Student("Bethel", 102, 22, 82);
        
     
        System.out.println("---Student Details---");
        //Display all Details 
        s1.displayInfo();
    }   
}
