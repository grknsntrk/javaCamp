
public class Main {

	public static void main(String[] args) {
		
		Instructor engin = new Instructor();
		engin.nickname ="Engin Demiroð";
		engin.egitimci("engin");
		engin.type="Eðitimci";
		
		Student kemal = new Student();
		kemal.nickname="kemal";
		kemal.type = "Öðrenci";
		InstructorManager ýnstructor = new InstructorManager();
		
		//ýnstructor.add(engin);
		
		
		StudentManager student = new StudentManager();
		
		//student.add(kemal);
		
		User[] users = {engin,kemal};
		UserManager us = new UserManager();
		
		us.cokluekle(users);

	}

}
