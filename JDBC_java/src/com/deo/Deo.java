package com.deo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.PreparedStatement;

import com.Bean.bean;
public class Deo {
	public String classPath="com.mysql.cj.jdbc.Driver";
	public String path="jdbc:mysql://localhost:3306/b42";
	
	public String  oneUser="SELECT * FROM STUDENT WHERE ROLLNO = ?;";
	public String insertUser="insert into student(rollno,name) values(?,?);";
	public String updateUser="UPDATE STUDENT SET NAME = ? WHERE ROLLNO = ?;";
	public String deleteUser="delete from student where ROLLNO = ?;";
	public String allUser   ="select * from student;";
	//Class.forName("com.mysql.cj.jdbc.Driver");
	public Connection conObject(){
		Connection con = null;
		try {
		con = DriverManager.getConnection(path,"root","Mahesh");
		}catch(SQLException ee) {
			ee.printStackTrace();
		}
		return con;
	}
	//select for single use
	public bean OneStu (int rollno) throws ClassNotFoundException {
		bean  be = null;
		Class.forName(classPath);
		be= new bean();
		try(Connection con=conObject();PreparedStatement st = con.prepareStatement(oneUser))
		{ 
			st.setInt(1,rollno);
			ResultSet rs = st.executeQuery();
			while(rs.next()) {
				int roll_no1=rs.getInt("rollno");
				String name1 = rs.getString("name");
				be.setRule_no(roll_no1);
				be.setName(name1);	
				//be = new bean(roll_no1,);
				}
		}catch(SQLException ee){
			ee.printStackTrace();
			
		}
		return be;
		
	}
	//insert a student
	public void insertStu(int roll_no,String name) throws SQLException {
		try {
			Class.forName(classPath);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try(Connection con=conObject();PreparedStatement st = con.prepareStatement(insertUser)){
		st.setInt(1,roll_no);
		st.setString(2, name);
		st.executeUpdate();
		
		}catch(SQLException ee) {
			ee.printStackTrace();
		}
	}
	
	//update a student
	public void updateStu(String name,int roll_no) {
		try{
			Class.forName(classPath);
		}catch(ClassNotFoundException ee){
			ee.printStackTrace();
		}
		try(Connection con=conObject();PreparedStatement st =con.prepareStatement(updateUser)){
			st.setString(1,name);
			st.setInt(2,roll_no);
			st.executeUpdate();
		}catch(SQLException ee) {
			ee.printStackTrace();
		}
	}
	//delete a student
	public void deleteStu(int roll_no){
		try {
			Class.forName(classPath);
			}catch(ClassNotFoundException ee){
				ee.printStackTrace();
			}
		try(Connection con =conObject();PreparedStatement st= con.prepareStatement(deleteUser)){
			st.setInt(1, roll_no);
			st.executeUpdate();
		}catch(SQLException ee){
			ee.printStackTrace();
		}
	}
	public ArrayList<bean> allStu() throws ClassNotFoundException{
	   ArrayList<bean> arr = new ArrayList<bean>();
	  // Controller co = new Controller();
	   Class.forName(classPath);
	   try(Connection con =conObject();PreparedStatement st =con.prepareStatement(allUser)){
		   ResultSet rs= st.executeQuery();
		   while(rs.next()){
			   int roll_no=rs.getInt("rollno");
			   String name=rs.getString("name");
			   arr.add(new bean(roll_no,name));
		   }
	   }catch(SQLException ee){
		   ee.printStackTrace();
	   }
	   return arr;
	   
	}
	
	
}
