import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.student.manage.Student;
import com.student.manage.studentDAO;

public class start {
	public static void main(String[] args) throws IOException {
	System.out.println("welcome");	
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	while(true) {
		System.out.println("1.ADD");
		System.out.println("2.DELETE");
		System.out.println("3.DISPLAY");
		System.out.println("4.EXIT");
		
		int c = Integer.parseInt(br.readLine());
		
		if(c==1) {
			System.out.println("enter student name");
			String name = br.readLine();
			
			System.out.println("enter student phone");
			String phone = br.readLine();
			
			System.out.println("enter student city");
			String city = br.readLine();
			
			Student st = new Student(name,phone,city);
			
			boolean answer= studentDAO.insertStudentToDB(st);
			if(answer) {
				System.out.println("Student Added successfully...!!!!!");
			}else {
				System.out.println("Something went wrong...!!!!!");
			}
			
		}else if(c==2) {
			System.out.println("enter student id to delete");
			int userId = Integer.parseInt(br.readLine());
			boolean f = studentDAO.deleteStudent(userId);
			if(f) {
				System.out.println("Student Deleted successfully...!!!!!");	
			}else{
				System.out.println("Something went wrong...!!!!!");
			}
			
		}else if(c==3) {
			studentDAO.showAllStudent();
			
			
		}else if(c==4) {
			
			break;
		}else {
			
		}
		
	}
	
	System.out.println("Thank you for using application.");
	
	}

}
