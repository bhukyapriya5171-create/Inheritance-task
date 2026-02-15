package inheritanceatask;

public class Student {
	protected String name;
    protected String studentId;

    public Student(String name, String studentId) {
        this.name = name;
        this.studentId = studentId;
    }

    public void displayStudentInfo() {
        System.out.println("Name: " + name + ", Student ID: " + studentId);
    }
}
class Undergraduate extends Student {
    private String major;

    public Undergraduate(String name, String studentId, String major) {
        super(name, studentId);
        this.major = major;
    }

    public void displayUndergraduateInfo() {
        System.out.println("Major: " + major);
    }
}
class Graduate extends Student {
    private String thesisTopic;

    public Graduate(String name, String studentId, String thesisTopic) {
        super(name, studentId);
        this.thesisTopic = thesisTopic;
    }

    public void displayGraduateInfo() {
        System.out.println("Thesis Topic: " + thesisTopic);
    }
}
class PhDStudent extends Student {
    private String researchArea;

    public PhDStudent(String name, String studentId, String researchArea) {
        super(name, studentId);
        this.researchArea = researchArea;
    }

    public void displayPhDStudentInfo() {
        System.out.println("Research Area: " + researchArea);
    }
}




