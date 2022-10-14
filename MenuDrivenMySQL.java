package com.operative.java8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class MenuDrivenMySQL {
	
	static String username = "root";
	static String password = "221299";
	static String DB_URL = "jdbc:mysql://localhost/kharadi";

	public static void main(String[] args) throws SQLException {

		Connection con = DriverManager.getConnection(DB_URL, username, password);
		Statement st = con.createStatement();
		Scanner sc = new Scanner(System.in);
		int a = 0;
		int choice = 0;
		System.out.println("Hello! Welcome to my MySQL!");
		do {
			
			System.out.println("1. Create a Table.");
			System.out.println("2. Insert Data in a Table.");
			System.out.println("3. Select Data from a Table");
			System.out.println("4. Update Data in a Table.");
			System.out.println("5. Delete Data in a Table.");
			System.out.println("6. Exit");
			System.out.println("Choose your option : ");
			
			choice = sc.nextInt();
			
			switch (choice) {
			case 1:	
				System.out.println("Enter Name of the Table : ");
				String name = sc.next();
				
				st.executeUpdate("create table " + name + "(id int primary key auto_increment,e_name varchar(30),age int)");
				System.out.println("Table Created : " + name);
	            System.out.println();
				break;
				
			case 2:	
				System.out.println("Below are the Tables available on 'kharadi' database - ");
	            ResultSet rs=st.executeQuery("show tables");
	            while(rs.next()) {
	                System.out.println(rs.getString(1));
	            }
	            System.out.println();
	            System.out.println("Enter the Table name in which you want to insert data: ");
	            String t_name=sc.next();
	            System.out.println("Enter Name :");
	            String name1=sc.next();
	            System.out.println("Enter Age: ");
	            int age=sc.nextInt();
	            st.executeUpdate("insert into "+t_name+"(e_name,age) values("+"'"+name1+"'"+" , "+age+"); ");
	            System.out.println("Table Updated : " + t_name);
	            System.out.println();
				break;
				
			case 3:	
				System.out.println("Below are the Tables available on 'kharadi' database - ");
	            ResultSet rs1=st.executeQuery("show tables");
	            while(rs1.next()) {
	                System.out.println(rs1.getString(1));
	            }
	            System.out.println();
				System.out.println("Enter Table name: ");
	            String t_name1=sc.next();
	            System.out.println("Below is the data in "+t_name1);
	            rs1=st.executeQuery("select *from "+t_name1+"");
	            while (rs1.next()) {
	                System.out.println(rs1.getInt(1)+" | "+rs1.getString(2)+" | "+rs1.getInt(3));
	            }
	            System.out.println();
	            break;
	            
			case 4:	
				System.out.println("Enter Table name : ");
	            String t_name3=sc.next();
	            System.out.println("Enter ID, Name and Age : ");
	            
	            int id_c=sc.nextInt();
	            String name_c=sc.next();
	            int age_c=sc.nextInt();
	            
	            st.executeUpdate("update "+t_name3+" set e_name="+"'"+name_c+"'"+" , "+"age="+age_c+" where id="+id_c+"");
	            System.out.println("Table Updated : " + t_name3);
	            System.out.println();
				break;
				
			case 5:	
				System.out.println("Enter table name: ");
	            String t_name2=sc.next();
	            System.out.println("Enter ID for which you want to delete data :");
	            int id_n=sc.nextInt();
	            st.executeUpdate("delete from "+t_name2+" where id="+id_n+"");
	            System.out.println("Data Entry deleted successfully.");
	            System.out.println();
	            break;
			case 6:
				a = 1;
				break;
			default:
				break;
			}
			
		} while (a!=1);
		System.out.println("Byee!!");
	}

}
