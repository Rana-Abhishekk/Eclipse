package com.exception.custom;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Square implements Serializable {
	int side;
	Square(int side){
		this.side = side;
	}
}
public class SerialisationPrac {
	

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		Square sq = new Square(5);
		
		FileOutputStream fos = new FileOutputStream("ABC.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(sq);
		sq.side=15;
		oos.writeObject(sq2);
		oos.close();
		
		FileInputStream fis =new FileInputStream("ABC.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Square sqq = (Square)ois.readObject();
		
		System.out.println(sqq.side);
		ois.close();
		

	}

}
