/*class Student{

    String name;
    int age;
    double marks;

    Student(String name, int age, double marks){
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    void display(){
        System.out.println();
        System.out.println("The name of the student: " + name);
        System.out.println("The age of the student: " + age);
        System.out.println("The marks of the student: " + marks);
 
    }

}

public class Main{
    public static void main(String[] args){

        Student student = new Student("Alan", 18, 90);
        Student student2 = new Student("Alice", 18, 98);


        student.display();
        student2.display();

    }
}*/

class Student{

    private String name;
    private int age;
    private double marks;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setAge(int age){
        if(age > 0){
            this.age = age;
        }
        else{
            System.out.println("Enter a valid age   ");
        }
    }

    public int getAge(){
        return age;
    }

    public void setMarks(double marks){

        if(marks >= 0 && marks <= 100){
            this.marks = marks;
        }

        else{
            System.out.println("Enter a valid mark");
        }

    }

    public double getMarks(){
        return marks;
    }


}

public class Main{
    public static void main(String[] args) {
        
        Student student = new Student();

        student.setName("Alan");
        student.setAge(18);
        student.setMarks(89.95);

        System.out.println("The name of the student: " + student.getName());
        System.out.println("The age of the student: " + student.getAge());
        System.out.println("The mark of the student: " + student.getMarks());

    }
}