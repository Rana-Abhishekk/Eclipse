package Stud.com.task.code;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.*;

public class NewTask {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedWriter bw = new BufferedWriter(new FileWriter("taskText.txt"));
		BufferedReader br= new BufferedReader(new FileReader("taskText.txt"));
		try {
		
		bw.write("My Name is Abhishek Singh Rana");
		bw.flush();
		
		String linee = br.readLine();
		System.out.println(linee);
		bw.write("Kartikey is sitting behind me");
		bw.flush();
		
		linee = br.readLine();
		System.out.println(linee);
		bw.write(100);// will not print string instead an alphabet
		bw.flush();
		
		}catch(Exception e){
			System.out.println("Something is wrong" + e);
			
		}finally {
			
			bw.close();
		}
		
	   
		
		
		String line = br.readLine();
		while(line!=null) {
			System.out.println(line);
			line = br.readLine();		
			}
		br.close();
		
		System.out.println("This is Printwriter");
		
		PrintWriter pw =new PrintWriter("taskText2.txt");
		pw.print(10.5);
		pw.print("Something");
		pw.println("ha ha ha ");
		pw.println("ho ho ho");
		pw.write(100);
		pw.print(100);
		pw.close();
		
		BufferedReader br1= new BufferedReader(new FileReader("taskText2.txt"));
		String line1 = br1.readLine();
		while(line1!=null) {
			System.out.println(line1);
			line1 = br1.readLine();		
			}
		br.close();
		
		
		

	}

}
