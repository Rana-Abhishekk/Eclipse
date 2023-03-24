import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

class Student implements Serializable {
	private static final long serialVersionUID = 1L;
	int id;
	String name;
	String[] sub;

	Student(int id, String name, String[] sub) {
		this.id = id;
		this.name = name;
		this.sub = sub;
	}
}
public class TaskO {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub

		List<Student> studObjLis = new ArrayList<Student>();
		@SuppressWarnings("unused")
		List<Student> filledStudList = new ArrayList<Student>();

		System.out.println("///////////----");
		filledStudList = fillLis(studObjLis); // Filling a list of studObj

		// remember to handle exception and use finally toclos bw
		/*
		 * BufferedWriter bwSci = new BufferedWriter(new FileWriter("Sci.txt"));
		 * BufferedWriter bwCom = new BufferedWriter(new FileWriter("Com.txt"));
		 * BufferedWriter bwArt = new BufferedWriter(new FileWriter("Art.txt"));
		 */
		// how to use catch in this case

		// make 3 arrayList for science com and arts
		List<Student> sciStud = new ArrayList<Student>();
		List<Student> comStud = new ArrayList<Student>();
		List<Student> artStud = new ArrayList<Student>();

		for (Student stObj : filledStudList) {
			String[] subjects = stObj.sub;
			for (String subComp : subjects) {
				if (subComp == "physics" || subComp == "chemistry" || subComp == "maths") {
					// i might have to use serialization idea--> put all the objects of science in
					// an arraylist and then serialize it
					sciStud.add(stObj);
					break;

				}
				if (subComp == "Buisness" || subComp == "Accounts") {
					// i might have to use serialization idea--> put all the objects of science in
					// an arraylist and then serialize it
					comStud.add(stObj);
					break;

				}
				if (subComp == "PolSci" || subComp == "Eco") {
					// i might have to use serialization idea--> put all the objects of science in
					// an arraylist and then serialize it
					artStud.add(stObj);
					break;
				}
			}
		}
		// how to use catch in this case
		try (FileOutputStream fosSci = new FileOutputStream("Sci.ser");
				ObjectOutputStream oosSci = new ObjectOutputStream(fosSci)) {

			oosSci.writeObject(sciStud);
			oosSci.close();

		} catch (Exception e) {
			System.out.println(e);
		}

		try {
			FileOutputStream fosCom = new FileOutputStream("Com.ser");
			ObjectOutputStream oosCom = new ObjectOutputStream(fosCom);
			oosCom.writeObject(comStud);
			oosCom.flush();
			oosCom.close();
		} catch (IOException e) {
			System.out.println(e);
		}

		try {
			FileOutputStream fosArt = new FileOutputStream("Art.ser");
			ObjectOutputStream oosArt = new ObjectOutputStream(fosArt);
			oosArt.writeObject(artStud);
			oosArt.flush();
			oosArt.close();
		} catch (IOException e) {
			System.out.println(e);
		}

		// putting it in new list
		// outstream file for final list

		List<StudentStream> studStrObjLis = new ArrayList<StudentStream>();
		studStrObjLis = fillLisStr(studStrObjLis);

		// now we have to create objects to
		FileInputStream fisS = new FileInputStream("Sci.ser");
		ObjectInputStream oisS = new ObjectInputStream(fisS);

		// StudentStream finalSt = new StudentStream();

		// checking the lists of sci
		// Checking if the separate lists have their corresponding Streams
		@SuppressWarnings("unchecked")
		List<Student> fileListSci = (List<Student>) oisS.readObject(); // can throw exception have to handle

		List<StudentStream> finStudStrLis = new ArrayList<StudentStream>();
		int idx = 0;
		for (Student st : fileListSci) {
			StudentStream stStr = studStrObjLis.get(idx);
			stStr.name = st.name;
			stStr.id = st.id;
			stStr.stream = "Science";
			finStudStrLis.add(stStr);
			idx++;

		}

		// for commerce
		FileInputStream fisC = new FileInputStream("Com.ser");
		ObjectInputStream oisC = new ObjectInputStream(fisC);
		List<Student> fileListCom = (List<Student>) oisC.readObject();
		for (Student st : fileListCom) {
			StudentStream stStr = studStrObjLis.get(idx);
			stStr.name = st.name;
			stStr.id = st.id;
			stStr.stream = "Commerce";
			finStudStrLis.add(stStr);
			idx++;

		}

		// for arts
		FileInputStream fisA = new FileInputStream("Art.ser");
		ObjectInputStream oisA = new ObjectInputStream(fisA);

		@SuppressWarnings("unchecked")
		List<Student> fileListArt = (List<Student>) oisA.readObject();

		for (Student st : fileListArt) {
			StudentStream stStr = studStrObjLis.get(idx);
			stStr.name = st.name;
			stStr.id = st.id;
			stStr.stream = "Arts";
			finStudStrLis.add(stStr);
			idx++;

		}

		oisS.close();
		oisC.close();
		oisA.close();

		FileOutputStream fosFin = new FileOutputStream("Final.ser");
		ObjectOutputStream oosFin = new ObjectOutputStream(fosFin);

		oosFin.writeObject(finStudStrLis);
		oosFin.flush();
		oosFin.close();

		FileInputStream fisFin = new FileInputStream("Final.ser");
		ObjectInputStream oisFin = new ObjectInputStream(fisFin);
		@SuppressWarnings("unchecked")
		List<StudentStream> fileListFinal = (List<StudentStream>) oisFin.readObject();
		for (StudentStream stFin : fileListFinal) {
			System.out.println("This is the output from final list");
			System.out.println(stFin.name);
			System.out.println(stFin.id);
			System.out.println(stFin.stream);
			System.out.println("The next student below");
			System.out.println("-----------------------");
		}
		oisFin.close();

	}

	public static List<Student> fillLis(List<Student> studObjLis) {
		String[] subP = { "physics", "chemistry", "maths" };
		String[] subC = { "Buisness", "Accounts" };
		String[] subA = { "PolSci", "Eco" };
		Student studObj = new Student(1, "Aryan", subP);
		studObjLis.add(studObj);

		Student studObj1 = new Student(2, "Aman", subC);
		studObjLis.add(studObj1);

		Student studObj2 = new Student(3, "Akshit", subP);
		studObjLis.add(studObj2);

		Student studObj3 = new Student(4, "Aadya", subA);
		studObjLis.add(studObj3);

		Student studObj4 = new Student(5, "Aditya", subC);
		studObjLis.add(studObj4);

		Student studObj5 = new Student(6, "Brian", subP);
		studObjLis.add(studObj5);

		Student studObj6 = new Student(7, "Brad", subA);
		studObjLis.add(studObj6);

		Student studObj7 = new Student(8, "Bohemia", subC);
		studObjLis.add(studObj7);

		Student studObj8 = new Student(9, "Bhanak", subP);
		studObjLis.add(studObj8);

		return studObjLis;

	}

	public static List<StudentStream> fillLisStr(List<StudentStream> studObjStrLis) {
		StudentStream studStrObj = new StudentStream();
		studObjStrLis.add(studStrObj);

		StudentStream studStrObj1 = new StudentStream();
		studObjStrLis.add(studStrObj1);

		StudentStream studStrObj2 = new StudentStream();
		studObjStrLis.add(studStrObj2);

		StudentStream studStrObj3 = new StudentStream();
		studObjStrLis.add(studStrObj3);

		StudentStream studStrObj4 = new StudentStream();
		studObjStrLis.add(studStrObj4);

		StudentStream studStrObj5 = new StudentStream();
		studObjStrLis.add(studStrObj5);

		StudentStream studStrObj6 = new StudentStream();
		studObjStrLis.add(studStrObj6);

		StudentStream studStrObj7 = new StudentStream();
		studObjStrLis.add(studStrObj7);

		StudentStream studStrObj8 = new StudentStream();
		studObjStrLis.add(studStrObj8);

		return studObjStrLis;

	}
}

class StudentStream implements Serializable {
	int id;
	String name;
	String stream;
}