package inheritanceatask;

public class StudentMain {

	public static void main(String[] args) {
		Student undergraduate = new Undergraduate("Alice", "U12345", "Computer Science");
        undergraduate.displayStudentInfo();
        ((Undergraduate) undergraduate).displayUndergraduateInfo();

        Student graduate = new Graduate("Bob", "G67890", "Machine Learning");
        graduate.displayStudentInfo();
        ((Graduate) graduate).displayGraduateInfo();

        Student phdStudent = new PhDStudent("Charlie", "P11223", "Artificial Intelligence");
        phdStudent.displayStudentInfo();
        ((PhDStudent) phdStudent).displayPhDStudentInfo();
	}

}
