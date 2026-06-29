public class practical 1 {
    public static void main(string[] args) {
        // Hello world
        system.out.println("Hello world!");
        system.out.println() ;

        //variables and data types 
        int age = 20;
        double salary = 35000.75;
        char grade = 'A';
        boolean isStudent = true;
        String name = "Rahul";

        system.out.println("Name:"+ name);
        system.out.println("Age:"+age);
        system.out.println("Salary:"+ salary);
        system.out.println("Grade:"+ grade);
        system.out.println();

        //Implicit Type Casting(automatic)
        int number = 50;
        double result = number;

        system.out.println(x:"implicit type casting");
        system.out.println("integer value:"+number);
        system.out.println("converted to double":+result);

        system.out.println();

        //Explicit type casting(manual)
        double marks = 89.75;
        int totalMarks = (int) marks;

   
             System.out.println("Explicit Type casting");
                  System.out.println("Double value:"+marks);
                       System.out.println("converted to integer" : +totalMarks);

    }
}