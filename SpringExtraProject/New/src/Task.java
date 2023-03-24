
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
class Student implements Serializable{
	int id ;
	int name;

}
public class Task {
	

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
		FileOutputStream fosScie = new FileOutputStream("testTask.ser");
		ObjectOutputStream oosScie = new ObjectOutputStream(fosScie);
		
		Student st = new Student();
		st.id = 1;
		oosScie.writeObject(st);
		oosScie.flush();
		
		
		st.id=2;
		oosScie.writeObject(st);
		oosScie.flush();
		
		oosScie.close();
		
		FileInputStream fisS =new FileInputStream("testTask.ser");
		ObjectInputStream oisS = new ObjectInputStream(fisS);
		
		@SuppressWarnings("unchecked")
		List<Student> fileListSci = (List<Student>)oisS.readObject();
		for(Student stdnt : fileListSci) {
			System.out.println(stdnt.id);
		}
		
		
		
		
	
		

	}

}
