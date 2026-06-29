public class Practical1 { 
    public static void main(String[] args) { 
        // Hello world 
        System.out.println("Hello world!"); 
        System.out.println(); 

        //variables and data types 
        int age = 20; 
        double salary = 35000.75; 
        char grade = 'A'; 
        boolean isStudent = true; 
        String name = "Rahul"; 
        
        System.out.println("Name:" + name); 
        System.out.println("Age:" + age); 
        System.out.println("Salary:" + salary); 
        System.out.println("Grade:" + grade); 
        System.out.println(); 

        //Implicit Type Casting(automatic) 
        int number = 50; 
        double result = number; 
        System.out.println("implicit type casting"); 
        System.out.println("integer value:" + number); 
        System.out.println("converted to double:" + result); 
        System.out.println(); 

        //Explicit type casting(manual) 
        double marks = 89.75; 
        int totalMarks = (int) marks; 
        System.out.println("Explicit Type casting"); 
        System.out.println("Double value:" + marks); 
        System.out.println("converted to integer:" + totalMarks); 
    } 
}
