
public class Main {

	public static void main(String[] args) {
		
		Instructor engin = new Instructor();
		engin.nickname ="Engin Demiro�";
		engin.egitimci("engin");
		engin.type="E�itimci";
		
		Student kemal = new Student();
		kemal.nickname="kemal";
		kemal.type = "��renci";
		InstructorManager �nstructor = new InstructorManager();
		
		//�nstructor.add(engin);
		
		
		StudentManager student = new StudentManager();
		
		//student.add(kemal);
		
		User[] users = {engin,kemal};
		UserManager us = new UserManager();
		
		us.cokluekle(users);

	}

}
