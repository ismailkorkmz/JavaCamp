package homework3;


public class Main {

	public static void main(String[] args) {
		Student student = new Student(1, "İsmail Murat"," Korkmaz", "hilal_ay_1907@windowslive.com", "123456789", 9999);
		Student student2 = new Student(2, "Elif"," Kılıç", "elifkılıç@windowslive.com", "456789", 34887);
		Insructor insructor = new Insructor(1, "Engin", "Demiroğ", "engindemiroğ@hotmail.com", "123456", "Java");
		
		UserManager userManager = new UserManager();
		
		
		userManager.add(student);
		userManager.delete(student);
		userManager.update(student);
		
		userManager.add(student2);
		userManager.delete(student2);
		userManager.update(student2);
		
		System.out.println("------------------");
		
		User[] users = {student,student2};
		userManager.addMultiple(users);
		
		System.out.println("------------------");
		
		StudentManager studentManager = new StudentManager();
		studentManager.login(student);
		
		studentManager.login(student2);
		
		InsructorManager insructorManager = new InsructorManager();
		insructorManager.login(insructor);
		
	}

}
