public class Student {
    String name;
    int marks;
    int rollNumber;

    Student(String name, int marks, int rollNumber) {
        this.name = name;
        this.marks = marks;
        this.rollNumber = rollNumber;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNumber);
        System.out.println("Marks: " + marks);
    }

    public static void main(String[] args) {
        Student s = new Student("Piyush", 95, 101);
        s.display();
    }
}