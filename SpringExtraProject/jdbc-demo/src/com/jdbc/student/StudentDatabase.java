package com.jdbc.student;

import java.sql.*;
import java.util.Scanner;

public class StudentDatabase {

	private static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		StudentDatabase stDB = new StudentDatabase();
		String dbURL = "jdbc:mysql://localhost:3306/jdbcb"; // port no. might be a problem
		String username = "root";
		String password = "root";
		// Registering the driver
		try (Connection connection = DriverManager.getConnection(dbURL, username, password)) {
			Class.forName("com.mysql.cj.jdbc.Driver"); // Driver-->loading and registering

			System.out.println("Enter choice");
			System.out.println("1. Insert");
			System.out.println("2. select");
			System.out.println("3. update");
			System.out.println("4. callable output select all records");
			System.out.println("5. Transaction trial");
			System.out.println("6. Batch trial");
			System.out.println("7. Delete");
			int choice = Integer.parseInt(scn.nextLine());
			switch (choice) {
			case 1:
				stDB.insertRecord();
				break;
			case 2:
				stDB.selectRecord();
				break;
			case 3:
				stDB.updateRecord();
				break;
			case 4:
				stDB.selectAll();
			case 5 :
				stDB.transaction();
			case 6 :
				stDB.batch();
			case 7 :
				stDB.delete();
			}
		} catch (SQLException | ClassNotFoundException e) {
			throw new RuntimeException("Something is wrong" + e);

		}
	}
	
	private void delete() {
		System.out.println("Enter the roll to be deleted");
		int roll_no = scn.nextInt();
		try(Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcb", "root", "root")){
			String Query = "DELETE FROM student where roll_number = " + roll_no;
			Statement stmt = connection.createStatement();
			int rows = stmt.executeUpdate(Query);
			if(rows>0) {
				System.out.println("MIRACLE!!!!!!!!!MIRAACLE!!!!!!!!!!!MIRAAACLEEE!!!!!!!!");
			}
			}catch(SQLException e) {
			System.out.println("Wrong Answer" + e);
		}
	}
	private void batch() {
		String query1 = "INSERT INTO student(namee,percentage,address) VALUES('Ceratium', 59.69 ,'Mars')";
		String query2 = "INSERT INTO student(namee,percentage,address) VALUES('Notredamus', 99.69 ,'Citadel')";
		String query3 = "INSERT INTO student(namee,percentage,address) VALUES('XeGin', 69.73 ,'Pluto')";
		try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcb", "root", "root")){
			connection.setAutoCommit(false);
			Statement stmt = connection.createStatement();
			stmt.addBatch(query1);
			stmt.addBatch(query2);
			stmt.addBatch(query3);
			int[] rows = stmt.executeBatch();
			for(int i : rows) {
				if(i>0) {
					continue;
				}else {
					connection.rollback();				}
			}
			connection.commit();
		}catch(SQLException e) {
			System.out.println("HO HO HO go away... because you" + e);
		}	
	}

	private void updateRecord() throws SQLException {
		ResultSet rs =null;
		System.out.println("Enter the roll no. to fetch details for changing them");
		int roll = scn.nextInt();
		String sql = "select * from student where roll_number = " + roll;
		try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcb", "root", "root")){
		Statement stmt = connection.createStatement();
		rs = stmt.executeQuery(sql);
		if (rs.next()) {
			String name = rs.getString("namee");
			Double perc = rs.getDouble("percentage");
			String add = rs.getString("address");
			System.out.println("name is : " + name);
			System.out.println("----------------");
			System.out.println("percentage is : " + perc);
			System.out.println("----------------");
			System.out.println("address is : " + add);
			System.out.println("----------------");
			System.out.println("what to update");
			System.out.println("1. Name");
			System.out.println("2. percentage");
			System.out.println("3. Address");
			int choice = scn.nextInt();
			String query = "update student set ";
			switch (choice) {
			case 1:
				System.out.println("Enter a new name");
				String newName = scn.next();
				query = query + "namee = ? where roll_number = " + roll;
				PreparedStatement stmtPre = connection.prepareStatement(query);
				stmtPre.setString(1, newName);
				int rows = stmtPre.executeUpdate();
				if (rows > 0)
					System.out.println("Succesfully updated");
				break;
			case 2:
				System.out.println("Enter Percentage");
				Double newPerc = scn.nextDouble();
				query = query + "percentage = ? where roll_number = " + roll;
				stmtPre = connection.prepareStatement(query);
				stmtPre.setDouble(1, newPerc);
				rows = stmtPre.executeUpdate();
				if (rows > 0)
					System.out.println("Succesfully updated");
				break;
			case 3:
				System.out.println("Enter Place");
				String newPlace = scn.next();
				query = query + "address = ? where roll_number = " + roll;
				stmtPre = connection.prepareStatement(query);
				stmtPre.setString(1, newPlace);
				rows = stmtPre.executeUpdate();
				if (rows > 0)
					System.out.println("Succesfully updated");
				break;
			}
		} else {
			System.out.println("Wrong index");
		}
		
		} catch(SQLException e) {
			System.out.println("Oops wrong turn" + e);
		}finally {
			rs.close();
		}

		
	}
	
	private void transaction() throws SQLException {
		try(Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcb", "root", "root")){
			connection.setAutoCommit(false);
			String query1 = "INSERT INTO student(namee,percentage,address) VALUES('Kratos', 55.69 ,'Hell')";
			String query2 = "INSERT INTO student(namee,percentage,address) VALUES('thanos', 55.69 ,'Titan')";
			PreparedStatement stmt = connection.prepareStatement(query1);
			int row1 = stmt.executeUpdate();
			stmt = connection.prepareStatement(query2);
			int row2 = stmt.executeUpdate();
			if(row1 >0 && row2 >0) {
				connection.commit();			
			}
		}catch(SQLException e) {
			 System.out.println("Not agood choice of queries" + e);
		}
	}
	
	private void selectAll() throws SQLException {
		ResultSet rs =null;
		System.out.println("Select a roll no. till the data is required");
		int n = scn.nextInt();
		try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcb", "root", "root")){
		CallableStatement stmt = connection.prepareCall("{call get_All(?) }");
		stmt.setInt(1, n);
		rs = stmt.executeQuery();
		while (rs.next()) {
			String name = rs.getString("namee");
			Double perc = rs.getDouble("percentage");
			String add = rs.getString("address");
			System.out.println("name is : " + name);
			System.out.println("-------------------");
			System.out.println("percentage is : " + perc);
			System.out.println("-------------------");
			System.out.println("address is : " + add);
			System.out.println("*********************");
		} 

		
		}catch(SQLException e) {
			System.out.println("Something is wrong" + e);
		}finally {
			rs.close(); 
		}

	}

	private void selectRecord() throws SQLException {
		ResultSet rs = null;
		System.out.println("Enter the roll no. to fetch details");
		int roll = scn.nextInt();
		String sql = "select * from student where roll_number = " + roll;
		try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcb", "root", "root")){
		Statement stmt = connection.createStatement();
		rs = stmt.executeQuery(sql);
		if (rs.next()) {
			String name = rs.getString("namee");
			Double perc = rs.getDouble("percentage");
			String add = rs.getString("address");
			System.out.println("name is : " + name);
			System.out.println("-------------------");
			System.out.println("percentage is : " + perc);
			System.out.println("-------------------");
			System.out.println("address is : " + add); 
			System.out.println("*********************");
		} else {
			System.out.println("Wrong index");
		}

		
		}catch(SQLException e) {
			System.out.println("Something is wrong" + e);
		}finally {
			rs.close();
		}

	}

	private void insertRecord() throws SQLException {
		String sql = "insert into student(namee,percentage,address) values (?,?,?)";

		// prepared statements --> compile once use again again
		try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcb", "root", "root")){
		PreparedStatement stmt = connection.prepareStatement(sql);
		System.out.println(" Enter name ");
		stmt.setString(1, scn.nextLine());
		System.out.println(" Enter percentage");
		stmt.setDouble(2, scn.nextDouble());
		System.out.println(" Enter Area");
		stmt.setString(3, scn.next());
		int rows = stmt.executeUpdate();
		if (rows > 0) {
			System.out.println("Success");
		}

	}
		catch( SQLException e) {
			System.out.println("Mistake" + e);
	}
	}

}
