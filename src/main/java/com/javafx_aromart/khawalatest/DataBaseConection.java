package com.javafx_aromart.khawalatest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import entites.Teacher;

public class DataBaseConection{
	
	
	
	static void conect (String query)throws SQLException  {
		String url = "jdbc:mysql://localhost:3306/school";
		String userName = "root";
		String password = "mohammedmogeab" ;
		//String query;
		
		
	//query = "select * from EngineeringStudents where PassOutYear = 2025" ;

	try {
		Class.forName("com.mysql.cj.jdbc.driver");
		Connection connection = DriverManager.getConnection(url,userName,password);
		Statement statement = connection.createStatement(); 
		ResultSet result = statement.executeQuery(query);
		while (result.next()){
			String UniversityData = "";
			for(int i = 1 ; i <= 6 ; i++) {
				UniversityData += result.getString(i)+ " : " ;
				
			}
			System.out.println(UniversityData);
		}
		
	} catch (SQLException e) {
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
        throw new RuntimeException(e);
    }
    }
	
	

	static void addStudent(String name , int berthDate , Boolean jender)throws SQLException {
		conect("INSERT INTO Student (name, imageurl, age, course_id, gender) values('"+name+"'," + berthDate + ","+jender+")");
	}
	static void addTecher(String name , int berthDate , Boolean jender)throws SQLException{
		conect("INSERT '"+name+"'," + berthDate + ","+jender+")");
	}
	static void addSubject(String name , String book , Teacher teacher)throws SQLException {
		conect("insert into Course (, , ,) values('"+name+"'," + book + ","+teacher+")");
	}
	static void getStudent() {

	}
	static void getSubject(){

	}
	static void getTeacher(){

	}
	
	
}
