package homework3;

public class StudentManager extends UserManager{
	public void login(Student student) {
		System.out.println(student.getFirstName()+ " " + student.getLastName() + " " + "Giriþ Baþarýlý");
	}

}
