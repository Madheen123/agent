package com.Infinite.Agentproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class AgentInsertMain {

	
	 public static void main(String[] args) {
   	  String name,city,maritalstatus ;
		double premium;
 		Scanner sc= new Scanner(System.in);
 		System.out.println("Enter Name ");
 		name=sc.next();
 		System.out.println("Enter city ");
 		city=sc.next();
 		System.out.println("Enter meritalSatus ");
 		maritalstatus= sc.next();
 		System.out.println("Enter premium ");
 		premium=sc.nextDouble();
 		
 		try {
 			Class.forName("com.mysql.cj.jdbc.Driver");
 			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/exam","root","india@123");
 			String cmd="insert into Agent(name,city,maritalstatus,premium)" + "values(?,?,?,?)";
 			PreparedStatement pst=con.prepareStatement(cmd);
 			pst.setString(1, name);
 			pst.setString(2, city);
 			pst.setString(3, maritalstatus);
 			pst.setDouble(4, premium);
           pst.executeUpdate();
 			System.out.println(" Agent Record Inserted... ");
 		} catch (ClassNotFoundException e) {
 			// TODO Auto-generated catch block
 			e.printStackTrace();
 		} catch (SQLException e) {
 			// TODO Auto-generated catch block
 			e.printStackTrace();
 		}
 	}
}
