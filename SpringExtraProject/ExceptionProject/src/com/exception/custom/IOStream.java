package com.exception.custom;
import java.io.*;
public class IOStream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File f = new File("Text.txt");
		f.createNewFile();
		FileWriter fw = new FileWriter(f);
		fw.write("Something is wrong ");
		
		fw.write("\n");
		fw.write(55);
		fw.flush();
		fw.close();
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("Text1.txt"));
		String str = "I am Going somewhere";
		String str2 = "and then somewhere else";
		bw.write(str);
		bw.newLine();
		bw.write(str2);
		bw.close();
		
		
		
		BufferedReader br = new BufferedReader(new FileReader("Text.txt"));
		String ch = br.readLine();
		String ch2 = br.readLine();
		System.out.println(ch);
		System.out.println(ch2);
		br.close();
		
		BufferedReader br1 = new BufferedReader(new FileReader("Text1.txt"));
		String s = br1.readLine();
		while(s!=null) {
			System.out.println(s);
			s=br1.readLine();	
		}
		br1.close();
		System.out.println("This is printreader");
		PrintWriter pw = new PrintWriter("Text2.txt");
		String pStr = "Go somewhere";
		pw.write(100);
		pw.print(200);
		pw.write("hey hey");
		pw.println(15.5);
		pw.write("hey hey hii");
		pw.close();
		
		BufferedReader br2 = new BufferedReader(new FileReader("Text2.txt"));
		String strn = br2.readLine();
		while(strn!=null) {
			System.out.println(strn);
			strn=br2.readLine();	
		}
		br2.close();

	}

}
