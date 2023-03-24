package Stud.com.task.code;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import Stud.com.task.dto.Student;
import Stud.com.task.dto.StudentStream;

public class TaskO {

	static List<Student> filledStudList = new ArrayList<>();

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		List<Student> studentObjList = new ArrayList<>();
		List<Student> scienceStudList = new ArrayList<>();
		List<Student> commerceStudList = new ArrayList<>();
		List<Student> artsStudList = new ArrayList<>();

		System.out.println("///////////----");
		filledStudList = fillLis(studentObjList); // Filling a list of studObj

		// Making 3 arrayList for science , commerce and arts to segregate the students
		// into 3 streams

		// Separating the students into 3 different lists
		for (Student studentObj : filledStudList) {
			String[] subjects = studentObj.getSub();
			for (String subject : subjects) {
				switch(subject) {
				case "physics" :
//				case "chemistry":
//				case "maths" :
					scienceStudList.add(studentObj);
					break;
				case "Buisness" :
//				case "Accounts" :	
					commerceStudList.add(studentObj);
					break;
				case "PolSci":
//				case "Eco":
					artsStudList.add(studentObj);
					break;
				}
			}
		}

		// Now entering these lists namely artsAtudList,scienceStudList and
		// commerceStudList into 3 different files named Sci.txt,Com.txt,Art.txt

		// File for science students

		try (FileOutputStream fosSci = new FileOutputStream("Sci.txt");
				ObjectOutputStream oosSci = new ObjectOutputStream(fosSci)) {

			oosSci.writeObject(scienceStudList);

		} catch (Exception e) {
			System.out.println(e);
		}

		// File for Commerce students

		try (FileOutputStream fosCom = new FileOutputStream("Com.txt");
				ObjectOutputStream oosCom = new ObjectOutputStream(fosCom)) {

			oosCom.writeObject(commerceStudList);
			oosCom.flush();

		} catch (IOException e) {
			System.out.println(e);
		}

		// File for arts students

		try (FileOutputStream fosArt = new FileOutputStream("Art.txt");
				ObjectOutputStream oosArt = new ObjectOutputStream(fosArt)) {

			oosArt.writeObject(artsStudList);
			oosArt.flush();

		} catch (IOException e) {
			System.out.println(e);
		}

		// Making an arrayList to store objects of a class containing
		// id,name,stream(extra)

		List<StudentStream> studStrObjLis = new ArrayList<>();
		studStrObjLis = fillLisStr(studStrObjLis);

		int idx = 0;

		List<StudentStream> finalStudStrList = new ArrayList<>();
		// The objects from Sci.txt file will be read and put in the objects of
		// StudentStream with the stream as Science
		try (FileInputStream fisSci = new FileInputStream("Sci.txt");
				ObjectInputStream oisSci = new ObjectInputStream(fisSci)) {

			@SuppressWarnings("unchecked")
			List<Student> fileListSci = (List<Student>) oisSci.readObject();

			for (Student st : fileListSci) {
				StudentStream stStr = studStrObjLis.get(idx);
				stStr.setName(st.getName());
				stStr.setId(st.getId());
				stStr.setStream("Science");
				finalStudStrList.add(stStr);
				idx++;

			}
		} catch (Exception e) {
			System.out.println(e);
		}

		// The objects from Com.txt file will be read and put in the objects of
		// StudentStream with the stream as Commerce
		try (FileInputStream fisC = new FileInputStream("Com.txt");
				ObjectInputStream oisC = new ObjectInputStream(fisC)) {

			@SuppressWarnings("unchecked")
			List<Student> fileListCom = (List<Student>) oisC.readObject();
			for (Student st : fileListCom) {
				StudentStream stStr = studStrObjLis.get(idx);
				stStr.setName(st.getName());
				stStr.setId(st.getId());
				stStr.setStream("Commerce");
				finalStudStrList.add(stStr);
				idx++;

			}
		} catch (Exception e) {
			System.out.print(e);
		}

		// The objects from Art.txt file will be read and put in the objects of
		// StudentStream with the stream as Arts
		try (FileInputStream fisA = new FileInputStream("Art.txt");
				ObjectInputStream oisA = new ObjectInputStream(fisA)) {

			@SuppressWarnings("unchecked")
			List<Student> fileListArt = (List<Student>) oisA.readObject();

			for (Student st : fileListArt) {
				StudentStream stStr = studStrObjLis.get(idx);
				stStr.setName(st.getName());
				stStr.setId(st.getId());
				stStr.setStream("Arts");
				finalStudStrList.add(stStr);
				idx++;

			}
		} catch (Exception e) {
			System.out.println(e);
		}

		try (FileOutputStream fosFin = new FileOutputStream("Final.txt");
				ObjectOutputStream oosFin = new ObjectOutputStream(fosFin)) {

			oosFin.writeObject(finalStudStrList);
			oosFin.flush();
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("This is the output from final list");

		try (FileInputStream fisFin = new FileInputStream("Final.txt");
				ObjectInputStream oisFin = new ObjectInputStream(fisFin)) {
			@SuppressWarnings("unchecked")
			List<StudentStream> fileListFinal = (List<StudentStream>) oisFin.readObject();
			for (StudentStream stFin : fileListFinal) {

				System.out.println(stFin.getName());
				System.out.println(stFin.getId());
				System.out.println(stFin.getStream());
				System.out.println("The next student below");
				System.out.println("-----------------------");
			}
		}

	}

	public static List<Student> fillLis(List<Student> studObjLis) {

		String[] subP = { "physics", "chemistry", "maths" };
		String[] subC = { "Buisness", "Accounts" };
		String[] subA = { "PolSci", "Eco" };
		return Arrays.asList(new Student(1, "Aryan", subP), new Student(2, "Aman", subC),
				new Student(3, "Akshit", subA), new Student(4, "Aditya", subC), new Student(5, "Brian", subP),
				new Student(6, "Brad", subA), new Student(7, "Bohemia", subC));

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
